  /***************************************************************\
  *     The skeleton of this class is generated by an automatic *
  * code generator for NC product. It is based on Velocity.     *
  \***************************************************************/
      	package nc.vo.fbm.returnbill;

	import java.util.ArrayList;

import nc.vo.pub.NullFieldException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

/**
 * <b> 在此处简要描述此类的功能 </b>
 *
 * <p>
 *     退票子表VO
 * </p>
 *
 * 创建日期:2007-8-30
 * @author author
 * @version Your Project 1.0
 */
     public class ReturnBVO extends SuperVO {

   /**
	 *
	 */
	private static final long serialVersionUID = 1L;
		public static String tablecode="fbm_return_b";
	      	 public String pk_source;
             public String pk_return_b;
             public UFDateTime ts;
             public String pk_baseinfo;
             public Integer dr;
             public String pk_return;

             //baseinfo字段
             public String payunit;
             public String paybankacc;
             public String receiveunit;
             public String receivebankacc;
             public String pk_curr;
             public UFDouble moneyy;
             public UFDate invoicedate;
             public UFDate gatherdate;
             public UFDate enddate;
             public String fbmbilltype;
             public String endstatus;
             public String fbmbillno;
             //register字段
             public String pk_loanbank;
             public String returnbillno;
             public String cctype;
             public UFDouble brate;
             public UFDouble moneyb;

             public static final String  PK_SOURCE="pk_source";
             public static final String  PK_RETURN_B="pk_return_b";
             public static final String  TS="ts";
             public static final String  PK_BASEINFO="pk_baseinfo";
             public static final String  DR="dr";
             public static final String  PK_RETURN="pk_return";

             public static final String INVOICEDATE="invoicedate";
             public static final String ENDDATE="enddate";
             public static final String GATHERDATE="gatherdate";
             public static final String PAYUNIT="payunit";
             public static final String PAYBANKACC="paybankacc";
             public static final String RECEIVEUNIT="receiveunit";
             public static final String RECEIVEBANKACC="receivebankacc";
             public static final String PK_CURR="pk_curr";
             public static final String MONEYY="moneyy";
             public static final String FBMBILLTYPE="fbmbilltype";
             public static final String ENDSTATUS="endstatus";
             public static final String FBMBILLNO = "fbmbillno";

             public static final String PK_LOANBANK="moneyy";
             public static final String RETURNBILLNO="returnbillno";
             public static final String CCTYPE="cctype";
             public static final String BRATE = "brate";
             public static final String MONEYB = "moneyb";


          	
         	// 公式里要用到的字段
	private String payunitname;
	private String paybankaccname;
	private String receiveunitname;
	private String receivebankaccname;
	private String invoiceunitname;
	private String keepplacename;
	private String paybillunitname;
	private String holdunitname;
	private String keepbankname;
	private String currtypename;

	public String getCurrtypename() {
		return currtypename;
	}

	public void setCurrtypename(String currtypename) {
		this.currtypename = currtypename;
	}

	public String getPayunitname() {
		return payunitname;
	}

	public void setPayunitname(String payunitname) {
		this.payunitname = payunitname;
	}

	public String getPaybankaccname() {
		return paybankaccname;
	}

	public void setPaybankaccname(String paybankaccname) {
		this.paybankaccname = paybankaccname;
	}

	public String getReceiveunitname() {
		return receiveunitname;
	}

	public void setReceiveunitname(String receiveunitname) {
		this.receiveunitname = receiveunitname;
	}

	public String getReceivebankaccname() {
		return receivebankaccname;
	}

	public void setReceivebankaccname(String receivebankaccname) {
		this.receivebankaccname = receivebankaccname;
	}

	public String getInvoiceunitname() {
		return invoiceunitname;
	}

	public void setInvoiceunitname(String invoiceunitname) {
		this.invoiceunitname = invoiceunitname;
	}

	public String getKeepplacename() {
		return keepplacename;
	}

	public void setKeepplacename(String keepplacename) {
		this.keepplacename = keepplacename;
	}

	public String getPaybillunitname() {
		return paybillunitname;
	}

	public void setPaybillunitname(String paybillunitname) {
		this.paybillunitname = paybillunitname;
	}

	public String getHoldunitname() {
		return holdunitname;
	}

	public void setHoldunitname(String holdunitname) {
		this.holdunitname = holdunitname;
	}

	public String getKeepbankname() {
		return keepbankname;
	}

	public void setKeepbankname(String keepbankname) {
		this.keepbankname = keepbankname;
	}
	
        /**
	   * 属性pk_source的Getter方法.
	   *
	   * 创建日期:2007-8-30
	   * @return String
	   */
	 public String getPk_source() {
		 return pk_source;
	  }

     /**
	   * 属性pk_source的Setter方法.
	   *
	   * 创建日期:2007-8-30
	   * @param newPk_source String
	   */
	public void setPk_source(String newPk_source) {

		pk_source = newPk_source;
	 }

        /**
	   * 属性pk_return_b的Getter方法.
	   *
	   * 创建日期:2007-8-30
	   * @return String
	   */
	 public String getPk_return_b() {
		 return pk_return_b;
	  }

     /**
	   * 属性pk_return_b的Setter方法.
	   *
	   * 创建日期:2007-8-30
	   * @param newPk_return_b String
	   */
	public void setPk_return_b(String newPk_return_b) {

		pk_return_b = newPk_return_b;
	 }

        /**
	   * 属性ts的Getter方法.
	   *
	   * 创建日期:2007-8-30
	   * @return UFDateTime
	   */
	 public UFDateTime getTs() {
		 return ts;
	  }

     /**
	   * 属性ts的Setter方法.
	   *
	   * 创建日期:2007-8-30
	   * @param newTs UFDateTime
	   */
	public void setTs(UFDateTime newTs) {

		ts = newTs;
	 }

        /**
	   * 属性pk_baseinfo的Getter方法.
	   *
	   * 创建日期:2007-8-30
	   * @return String
	   */
	 public String getPk_baseinfo() {
		 return pk_baseinfo;
	  }

     /**
	   * 属性pk_baseinfo的Setter方法.
	   *
	   * 创建日期:2007-8-30
	   * @param newPk_baseinfo String
	   */
	public void setPk_baseinfo(String newPk_baseinfo) {

		pk_baseinfo = newPk_baseinfo;
	 }

        /**
	   * 属性dr的Getter方法.
	   *
	   * 创建日期:2007-8-30
	   * @return UFDouble
	   */
	 public Integer getDr() {
		 return dr;
	  }

     /**
	   * 属性dr的Setter方法.
	   *
	   * 创建日期:2007-8-30
	   * @param newDr UFDouble
	   */
	public void setDr(Integer newDr) {

		dr = newDr;
	 }

        /**
	   * 属性pk_return的Getter方法.
	   *
	   * 创建日期:2007-8-30
	   * @return String
	   */
	 public String getPk_return() {
		 return pk_return;
	  }

     /**
	   * 属性pk_return的Setter方法.
	   *
	   * 创建日期:2007-8-30
	   * @param newPk_return String
	   */
	public void setPk_return(String newPk_return) {

		pk_return = newPk_return;
	 }


    public String getPayunit() {
		return payunit;
	}

	public void setPayunit(String payunit) {
		this.payunit = payunit;
	}

	public String getPaybankacc() {
		return paybankacc;
	}

	public void setPaybankacc(String paybankacc) {
		this.paybankacc = paybankacc;
	}

	public String getReceiveunit() {
		return receiveunit;
	}

	public void setReceiveunit(String receiveunit) {
		this.receiveunit = receiveunit;
	}

	public String getReceivebankacc() {
		return receivebankacc;
	}

	public void setReceivebankacc(String receivebankacc) {
		this.receivebankacc = receivebankacc;
	}

	public String getPk_curr() {
		return pk_curr;
	}

	public void setPk_curr(String pk_curr) {
		this.pk_curr = pk_curr;
	}

	public UFDouble getMoneyy() {
		return moneyy;
	}

	public void setMoneyy(UFDouble moneyy) {
		this.moneyy = moneyy;
	}

	public UFDate getInvoicedate() {
		return invoicedate;
	}

	public void setInvoicedate(UFDate invoicedate) {
		this.invoicedate = invoicedate;
	}

	public UFDate getGatherdate() {
		return gatherdate;
	}

	public void setGatherdate(UFDate gatherdate) {
		this.gatherdate = gatherdate;
	}

	public UFDate getEnddate() {
		return enddate;
	}

	public void setEnddate(UFDate enddate) {
		this.enddate = enddate;
	}

	public String getFbmbilltype() {
		return fbmbilltype;
	}

	public void setFbmbilltype(String fbmbilltype) {
		this.fbmbilltype = fbmbilltype;
	}

	public String getEndstatus() {
		return endstatus;
	}

	public void setEndstatus(String endstatus) {
		this.endstatus = endstatus;
	}

	public String getPk_loanbank() {
		return pk_loanbank;
	}

	public void setPk_loanbank(String pk_loanbank) {
		this.pk_loanbank = pk_loanbank;
	}

	public String getReturnbillno() {
		return returnbillno;
	}

	public void setReturnbillno(String returnbillno) {
		this.returnbillno = returnbillno;
	}

	public String getCctype() {
		return cctype;
	}

	public void setCctype(String cctype) {
		this.cctype = cctype;
	}

	/**
	  * 验证对象各属性之间的数据逻辑正确性.
	  *
	  * 创建日期:2007-8-30
	  * @exception nc.vo.pub.ValidationException 如果验证失败,抛出
	  * ValidationException,对错误进行解释.
	 */
	 public void validate() throws ValidationException {

	 	ArrayList errFields = new ArrayList(); // errFields record those null

                                                      // fields that cannot be null.
       		  // 检查是否为不允许空的字段赋了空值,你可能需要修改下面的提示信息:

	   		if (pk_return_b == null) {
			errFields.add(new String("pk_return_b"));
			  }

	    StringBuffer message = new StringBuffer();
		message.append(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("362025","UPP362025-000001")/* @res"下列字段不能为空:"*/);
		if (errFields.size() > 0) {
		String[] temp = (String[]) errFields.toArray(new String[0]);
		message.append(temp[0]);
		for ( int i= 1; i < temp.length; i++ ) {
			message.append(",");
			message.append(temp[i]);
		}
		throw new NullFieldException(message.toString());
		}
	 }


   	/**
	  * <p>取得父VO主键字段.
	  * <p>
	  * 创建日期:2007-8-30
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {

	 	    return "pk_return";

	}

    /**
	  * <p>取得表主键.
	  * <p>
	  * 创建日期:2007-8-30
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
	 	  return "pk_return_b";
	 	}

	/**
      * <p>返回表名称.
	  * <p>
	  * 创建日期:2007-8-30
	  * @return java.lang.String
	 */
	public java.lang.String getTableName() {

		return "fbm_return_b";
	}

    /**
	  * 按照默认方式创建构造子.
	  *
	  * 创建日期:2007-8-30
	  */
	public ReturnBVO() {

			   super();
	  }

            /**
	 * 使用主键进行初始化的构造子.
	 *
	 * 创建日期:2007-8-30
	 * @param newPk_return_b 主键值
	 */
	 public ReturnBVO(String newPk_return_b) {

		// 为主键字段赋值:
		 pk_return_b = newPk_return_b;

    	}


     /**
	  * 返回对象标识,用来唯一定位对象.
	  *
	  * 创建日期:2007-8-30
	  * @return String
	  */
	   public String getPrimaryKey() {

		 return pk_return_b;

	   }

     /**
	  * 设置对象标识,用来唯一定位对象.
	  *
	  * 创建日期:2007-8-30
	  * @param newPk_return_b  String
	  */
	 public void setPrimaryKey(String newPk_return_b) {

				pk_return_b = newPk_return_b;

	 }

	  public UFDouble getBrate() {
		return brate;
	}

	public void setBrate(UFDouble brate) {
		this.brate = brate;
	}

	public UFDouble getMoneyb() {
		return moneyb;
	}

	public void setMoneyb(UFDouble moneyb) {
		this.moneyb = moneyb;
	}

	
	public String getFbmbillno() {
		return fbmbillno;
	}

	public void setFbmbillno(String fbmbillno) {
		this.fbmbillno = fbmbillno;
	}

	/**
       * 返回数值对象的显示名称.
	   *
	   * 创建日期:2007-8-30
	   * @return java.lang.String 返回数值对象的显示名称.
	   */
	 public String getEntityName() {

	   return "fbm_return_b";

	 }
}