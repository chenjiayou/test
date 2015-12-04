package nc.bs.fbm.gather.action;

import nc.bs.fbm.pub.action.BusiMessageTranslator;
import nc.vo.fbm.pub.ActionVO;
import nc.vo.fbm.pub.BusiActionParamVO;
import nc.vo.fbm.pub.constant.FbmBusConstant;
import nc.vo.fbm.pub.constant.FbmStatusConstant;
import nc.vo.fbm.pub.constant.IFBMStatus;
import nc.vo.fbm.register.RegisterVO;
import nc.vo.fbm.returnbill.ReturnVO;
import nc.vo.pub.BusinessException;

public class SaveGather<K extends RegisterVO, T extends RegisterVO> extends ActionGather<K, T> {

	@Override
	protected String doCheck(BusiActionParamVO<T> param) throws BusinessException {

		ActionVO actionVO = param.getLastActionVO();

		if (actionVO == null) {
			return null;
		}
//		else{
//			/* 校验业务日期
//			 * 统管生成收票时，当应取的收票日期小于单位调剂存放到中心的日期时，应控制不能生成收票登记单，
//			 * 并阻止保存统管单据的操作。(贴现、托收、背书)
//			 * 	   
//			*/
//			if (actionVO.getActiondate().after(param.getActiondate())) {
//				return "票据当前业务日期早于前一业务日期。"	+ BusiMessageTranslator.translateAction(param);
//			}
//		}
		

		if (actionVO.getEndstatus().equals(FbmStatusConstant.HAS_DISCOUNT)) {
			return nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("fbmcomm","UPPFBMComm-000322")/* @res"票据已贴现，无法操作"*/ + BusiMessageTranslator.translateAction(param);
		} else if (actionVO.getEndstatus().equals(FbmStatusConstant.HAS_IMPAWN)) {
			return nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("fbmcomm","UPPFBMComm-000323")/* @res"票据已质押，无法收票"*/ + BusiMessageTranslator.translateAction(param);
		} else if (actionVO.getEndstatus().equals(FbmStatusConstant.HAS_ENDORE)
				|| actionVO.getEndstatus()
						.equals(FbmStatusConstant.HAS_PAYBILL)
				|| actionVO.getEndstatus().equals(FbmStatusConstant.HAS_RELIEF)
				|| actionVO.getEndstatus().equals(FbmStatusConstant.HAS_RETURN)
				|| actionVO.getEndstatus().equals(FbmStatusConstant.HAS_CENTER_USE)) {
			// 正确的情况
		} else {
			return nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("fbmcomm","UPPFBMComm-000324")/* @res"票据使用中，无法收票。"*/ + BusiMessageTranslator.translateAction(param);
		}

		if (actionVO != null) {
			if (actionVO.getEndstatus().equals(FbmStatusConstant.HAS_PAYBILL)) {// 已付票
				// 检查是否生成了生效的划账结算单
				// ICreateCorpQueryService ProductService =
				// (ICreateCorpQueryService)
				// NCLocator.getInstance().lookup(ICreateCorpQueryService.class.getName());
				// Hashtable productEnabled =
				// ProductService.queryProductEnabled(param.getRegisterVO().getPk_corp(),new
				// String[]{ProductCode.PROD_EP});
				// if(((UFBoolean)productEnabled.get(ProductInfo.pro_EP)).booleanValue()){//启用了收付报才校验
				// OuterRelationDAO relDao = new OuterRelationDAO();
				// if(!relDao.isHjEffect(actionVO.getPk_source())){
				// throw new BusinessException("背书单位付票登记的划账结算单未生成或未生效");
				// }
				// }
			} else if (actionVO.getEndstatus().equals(
					FbmStatusConstant.HAS_RETURN)) {
				// 退票的收票
				ReturnVO returnVO = (ReturnVO) dao.getBaseDAO().retrieveByPK(
						ReturnVO.class, actionVO.getPk_bill());
				if (returnVO == null) {
					throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("fbmcomm","UPPFBMComm-000325")/* @res"找不到对应的退票单"*/);
				}
				if (returnVO.getVbillstatus().intValue() != IFBMStatus.TRANSFORM) {
					//throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("fbmcomm","UPPFBMComm-000326")/* @res"退票单未执行转出操作无法收票"*/);
					throw new BusinessException("该票先前已作过退票，但退票后未冲销。请先到退票节点冲销后再进行收票。");
				}

				if (actionVO.getActiondate().after(param.getActiondate())) {
					throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("fbmcomm","UPPFBMComm-000327")/* @res"票据:"*/
							+ param.getBaseinfoVO().getFbmbillno()
							+ nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("fbmcomm","UPPFBMComm-000243")/* @res"的当前业务日期早于前一业务日期。"*/
							+ BusiMessageTranslator.translateAction(param));
				}

				if (!returnVO.getReturntype().equals(
						FbmBusConstant.BACK_TYPE_GATHER)) {
					throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("fbmcomm","UPPFBMComm-000328")/* @res"只有退票类型为收票退票的票据才能重新收票"*/);
				}
//				RegisterVO newRegisterVO = (RegisterVO) dao
//						.getBaseDAO()
//						.retrieveByPK(RegisterVO.class, actionVO.getPk_source());
//				if (!newRegisterVO.getPk_corp().equals(
//						param.getRegisterVO().getPk_corp())) {
//					throw new BusinessException(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("fbmcomm","UPPFBMComm-000329")/* @res"票据相关的最新业务操作不在本公司"*/);
//				}
			}
		}
		return null;
	}

	@Override
	protected String getBeginStatus(BusiActionParamVO<T> param)
			throws BusinessException {
		// TODO Auto-generated method stub
		return FbmStatusConstant.NONE;
	}

	@Override
	protected String getEndStatus(BusiActionParamVO<T> param) throws BusinessException {
		// TODO Auto-generated method stub
		return FbmStatusConstant.ON_GATHER;
	}

}
