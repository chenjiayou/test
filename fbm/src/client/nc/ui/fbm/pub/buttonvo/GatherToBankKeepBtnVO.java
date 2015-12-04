/**
 *
 */
package nc.ui.fbm.pub.buttonvo;

import java.awt.Event;

import nc.ui.fbm.pub.IFBMButton;
import nc.ui.trade.base.IBillOperate;
import nc.ui.trade.button.IBillButtonVO;
import nc.vo.fbm.pub.constant.IFBMExtendStatus;
import nc.vo.trade.button.ButtonVO;
import nc.vo.trade.pub.IBillStatus;

/**
 * <p>
 * 收票登记-银行存放按钮定义
 * <p>创建人：lpf
 * <b>日期：2007-8-24
 *
 */
public class GatherToBankKeepBtnVO implements IBillButtonVO {

	/**
	 *
	 */
	public GatherToBankKeepBtnVO() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see nc.ui.trade.button.IBillButtonVO#getButtonVO()
	 */
	public ButtonVO getButtonVO() {
		// TODO Auto-generated method stub
		ButtonVO btnVo=new ButtonVO();
		btnVo.setBtnChinaName("银行存放");
		btnVo.setBtnName(nc.ui.ml.NCLangRes.getInstance().getStrByID("fbmcomm","UPPFBMComm-000017")/* @res"银行存放"*/);
		btnVo.setBtnNo(IFBMButton.Gather_BankKeep);
		btnVo.setHotKey("E");
		btnVo.setDisplayHotKey("(Shift+E)");
		btnVo.setModifiers(Event.SHIFT_MASK);
		btnVo.setOperateStatus(new int[]{IBillOperate.OP_NOTEDIT});
		btnVo.setBusinessStatus(new int[]{IBillStatus.CHECKPASS});
		btnVo.setExtendStatus(new int[]{IFBMExtendStatus.GATHERED});
		return btnVo;
	}

}