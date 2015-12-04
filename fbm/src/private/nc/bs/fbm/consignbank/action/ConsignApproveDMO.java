package nc.bs.fbm.consignbank.action;

import nc.bs.pub.pf.IQueryData;
import nc.bs.trade.business.HYPubBO;
import nc.bs.trade.business.HYSuperDMO;
import nc.vo.fbm.consignbank.CollectionVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class ConsignApproveDMO extends HYSuperDMO implements
		IQueryData {

	public CircularlyAccessibleValueObject[] queryAllBodyData(String key)
			throws BusinessException {
		CircularlyAccessibleValueObject[] voResults = null;
		StringBuffer whereString = new StringBuffer();
		whereString.append(" pk_collection = '").append(key).append("' ").append(" and isnull(dr,0) = 0 ");
		try {
			voResults = new HYPubBO().queryByCondition(CollectionVO.class,
					whereString.toString());
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		return voResults;
	}

	public CircularlyAccessibleValueObject[] queryAllHeadData(String whereString)
			throws BusinessException {
		CircularlyAccessibleValueObject[] voResults = null;
		try {
			voResults = new HYPubBO().queryByCondition(CollectionVO.class,whereString);
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		return voResults;
	}

}
