/**
 *
 */
package nc.bs.fbm.innerkeep.action;

import java.util.ArrayList;
import java.util.List;

import nc.bs.fbm.pub.action.AbstractBusiAction;
import nc.vo.fbm.pub.BusiActionParamVO;
import nc.vo.fbm.pub.constant.FbmActionConstant;
import nc.vo.fbm.pub.constant.FbmBusConstant;
import nc.vo.fbm.storage.StorageBVO;
import nc.vo.fbm.storage.StorageVO;
import nc.vo.pub.BusinessException;
import nc.vo.trade.pub.HYBillVO;

/**
 * <p>
 *
 * <p>创建人：lpf
 * <b>日期：2007-10-12
 *
 */
public abstract class ActionInnerKeep<K extends HYBillVO,T extends StorageVO> extends AbstractBusiAction<K, T> {

	/**
	 * 
	 */
	public ActionInnerKeep() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see nc.bs.fbm.pub.action.AbstractAction#checkOuter(nc.vo.fbm.pub.ActionParamVO)
	 */
//	@Override
//	protected String checkOuter(ActionParamVO param) throws BusinessException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	/**
	 * 
	 * <p>
	 * 内部存放转换动作VO
	 * <p>
	 * 作者：lpf 日期：2007-10-15
	 * 
	 * @param billVO
	 * @param actioncode
	 * @return
	 * @throws BusinessException
	 */
	@Override
	public BusiActionParamVO<T>[] buildParam(K data, String actioncode)
			throws BusinessException {
		
		StorageVO parent = (StorageVO) data.getParentVO();
		StorageBVO[] child = (StorageBVO[]) data.getChildrenVO();
		if (child != null && child.length > 0) {
			int len = child.length;
			List<BusiActionParamVO<T>> list = new ArrayList<BusiActionParamVO<T>>();

			for (int i = 0; i < len; i++) {
				BusiActionParamVO<T> param = new BusiActionParamVO<T>();
				fillBusiField(parent, param, actioncode);

				if (actioncode.equals(FbmActionConstant.INPUT_SUCCESS)) {
					param.setActionperson(parent.getInputperson());
					param.setActiondate(parent.getInputdate());
				}
				param.setPk_baseinfo(child[i].getPk_baseinfo());
				param.setActioncode(actioncode);
				param.setPk_bill(parent.getPrimaryKey());
				param.setPk_source(child[i].getPk_source());
				param.setPk_corp(parent.getPk_corp());
				param.setSourcefield(StorageBVO.PK_SOURCE);
				param.setBilltype(FbmBusConstant.BILLTYPE_INNERKEEP);
				param.setSuperVO((T)parent);

				// param.setUnit_a(parent.getPk_corp());//存放公司
				list.add(param);
			}

			return (BusiActionParamVO<T>[]) list.toArray(new BusiActionParamVO[0]);
		}
		return null;
	}

}
