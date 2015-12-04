/**
 *
 */
package nc.ui.fbm.accept;

import nc.ui.fbm.pub.IFBMButton;
import nc.ui.trade.bill.AbstractManageController;
import nc.ui.trade.bill.ISingleController;
import nc.ui.trade.businessaction.IBusinessActionType;
import nc.ui.trade.button.IBillButton;
import nc.vo.fbm.acceptbill.AcceptVO;
import nc.vo.fbm.pub.constant.FbmBusConstant;
import nc.vo.trade.pub.HYBillVO;

/**
 * <p>
 * 
 * <p>
 * 创建人：lpf <b>日期：2007-9-3
 * 
 */
public class AcceptBillController extends AbstractManageController implements
		ISingleController {

	/**
	 * 
	 */
	public AcceptBillController() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.bill.ICardController#getCardBodyHideCol()
	 */
	public String[] getCardBodyHideCol() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.bill.ICardController#getCardButtonAry()
	 */
	public int[] getCardButtonAry() {
		return new int[] { 
				IBillButton.Query,
				IBillButton.Brow, 
				IBillButton.Refresh,
				IBillButton.Add, 
				IBillButton.Edit, 
				IBillButton.Delete,
				IBillButton.Copy, 
				IBillButton.Cancel, 
				IBillButton.Save,
				IBillButton.Action,  
				IFBMButton.BTN_ACCEPT_QUERY_GROUP, 
				IBillButton.Print,
				IBillButton.Return};
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.bill.ICardController#isShowCardRowNo()
	 */
	public boolean isShowCardRowNo() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.bill.ICardController#isShowCardTotal()
	 */
	public boolean isShowCardTotal() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#getBillType()
	 */
	public String getBillType() {
		// TODO Auto-generated method stub
		return FbmBusConstant.BILLTYPE_BILLPAY;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#getBillVoName()
	 */
	public String[] getBillVoName() {
		// TODO Auto-generated method stub
		return new String[] { HYBillVO.class.getName(),
				AcceptVO.class.getName(), AcceptVO.class.getName() };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#getBodyCondition()
	 */
	public String getBodyCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#getBodyZYXKey()
	 */
	public String getBodyZYXKey() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#getBusinessActionType()
	 */
	public int getBusinessActionType() {
		// TODO Auto-generated method stub
		return IBusinessActionType.PLATFORM;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#getChildPkField()
	 */
	public String getChildPkField() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#getHeadZYXKey()
	 */
	public String getHeadZYXKey() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#getPkField()
	 */
	public String getPkField() {
		// TODO Auto-generated method stub
		return AcceptVO.PK_ACCEPT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#isEditInGoing()
	 */
	public Boolean isEditInGoing() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#isExistBillStatus()
	 */
	public boolean isExistBillStatus() {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.controller.IControllerBase#isLoadCardFormula()
	 */
	public boolean isLoadCardFormula() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.bill.IListController#getListBodyHideCol()
	 */
	public String[] getListBodyHideCol() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.bill.IListController#getListButtonAry()
	 */
	public int[] getListButtonAry() {
		return new int[] { 
				IBillButton.Query, 
				IBillButton.Refresh, 
				IBillButton.Add,
				IBillButton.Edit, 
				IBillButton.Delete, 
				IBillButton.Action,
				IFBMButton.BTN_ACCEPT_QUERY_GROUP,
				IBillButton.Print,
				IBillButton.Card };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.bill.IListController#getListHeadHideCol()
	 */
	public String[] getListHeadHideCol() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.bill.IListController#isShowListRowNo()
	 */
	public boolean isShowListRowNo() {
		// TODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nc.ui.trade.bill.IListController#isShowListTotal()
	 */
	public boolean isShowListTotal() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isSingleDetail() {
		// TODO Auto-generated method stub
		return false;
	}

}
