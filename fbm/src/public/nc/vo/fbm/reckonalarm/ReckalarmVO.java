  /***************************************************************\
  *     The skeleton of this class is generated by an automatic *
  * code generator for NC product. It is based on Velocity.     *
  \***************************************************************/
      	package nc.vo.fbm.reckonalarm;

	import java.util.ArrayList;
	import nc.vo.pub.*;
import nc.vo.pub.lang.*;

/**
 * <b> 在此处简要描述此类的功能 </b>
 *
 * <p>
 *     调剂清算设置（预警条件）VO
 * </p>
 *
 * 创建日期:2007-10-25
 * @author author bsrl
 * @version Your Project  5.02
 */
     public class ReckalarmVO extends SuperVO {

             /**
	 *
	 */
	private static final long serialVersionUID = 1L;
			public String pk_corp;// 公司
             public String pk_reckalarm;//主键
             public String pk_org;//组织
             public UFDate reckondate;//清算开始日期
             public String reckonunit;//清算单位
             public String pk_curr;//币种
             public String inacc;//转入帐户
             public String outacc;//转出帐户
             private UFDateTime ts;//时间戳
             private Integer dr;//删除标志

             public static final String  PK_CORP="pk_corp";
             public static final String  PK_RECKALARM="pk_reckalarm";
             public static final String  PK_ORG="pk_org";
             public static final String  RECKONDATE="reckondate";
             public static final String  RECKONUNIT="reckonunit";
             public static final String  PK_CURR="pk_curr";
             public static final String  TABLENAME = "fbm_reckalarm";
             public static final String INACC = "inacc";
             public static final String OUTACC = "outacc";


        /**
	   * 属性pk_corp的Getter方法.
	   *
	   * 创建日期:2007-10-25
	   * @return String
	   */
	 public String getPk_corp() {
		 return pk_corp;
	  }

     /**
	   * 属性pk_corp的Setter方法.
	   *
	   * 创建日期:2007-10-25
	   * @param newPk_corp String
	   */
	public void setPk_corp(String newPk_corp) {

		pk_corp = newPk_corp;
	 }

        /**
	   * 属性pk_reckalarm的Getter方法.
	   *
	   * 创建日期:2007-10-25
	   * @return String
	   */
	 public String getPk_reckalarm() {
		 return pk_reckalarm;
	  }

     /**
	   * 属性pk_reckalarm的Setter方法.
	   *
	   * 创建日期:2007-10-25
	   * @param newPk_reckalarm String
	   */
	public void setPk_reckalarm(String newPk_reckalarm) {

		pk_reckalarm = newPk_reckalarm;
	 }

        /**
	   * 属性pk_org的Getter方法.
	   *
	   * 创建日期:2007-10-25
	   * @return String
	   */
	 public String getPk_org() {
		 return pk_org;
	  }

     /**
	   * 属性pk_org的Setter方法.
	   *
	   * 创建日期:2007-10-25
	   * @param newPk_org String
	   */
	public void setPk_org(String newPk_org) {

		pk_org = newPk_org;
	 }

        /**
	   * 属性reckondate的Getter方法.
	   *
	   * 创建日期:2007-10-25
	   * @return String
	   */
	 public UFDate getReckondate() {
		 return reckondate;
	  }

     /**
	   * 属性reckondate的Setter方法.
	   *
	   * 创建日期:2007-10-25
	   * @param newReckondate String
	   */
	public void setReckondate(UFDate newReckondate) {

		reckondate = newReckondate;
	 }

        /**
	   * 属性reckonunit的Getter方法.
	   *
	   * 创建日期:2007-10-25
	   * @return String
	   */
	 public String getReckonunit() {
		 return reckonunit;
	  }

     /**
	   * 属性reckonunit的Setter方法.
	   *
	   * 创建日期:2007-10-25
	   * @param newReckonunit String
	   */
	public void setReckonunit(String newReckonunit) {

		reckonunit = newReckonunit;
	 }

        /**
	   * 属性pk_curr的Getter方法.
	   *
	   * 创建日期:2007-10-25
	   * @return String
	   */
	 public String getPk_curr() {
		 return pk_curr;
	  }

     /**
	   * 属性pk_curr的Setter方法.
	   *
	   * 创建日期:2007-10-25
	   * @param newPk_curr String
	   */
	public void setPk_curr(String newPk_curr) {

		pk_curr = newPk_curr;
	 }



    /**
	  * 验证对象各属性之间的数据逻辑正确性.
	  *
	  * 创建日期:2007-10-25
	  * @exception nc.vo.pub.ValidationException 如果验证失败,抛出
	  * ValidationException,对错误进行解释.
	 */
	 public void validate() throws ValidationException {

	 	ArrayList errFields = new ArrayList(); // errFields record those null

                                                      // fields that cannot be null.
       		  // 检查是否为不允许空的字段赋了空值,你可能需要修改下面的提示信息:

	   		if (pk_reckalarm == null) {
			errFields.add(new String("pk_reckalarm"));
			  }

	    StringBuffer message = new StringBuffer();
		message.append(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("36201050","UPP36201050-000002")/* @res"下列字段不能为空:"*/);
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
	  * 创建日期:2007-10-25
	  * @return java.lang.String
	  */
	public java.lang.String getParentPKFieldName() {

	 	    return null;

	}

    /**
	  * <p>取得表主键.
	  * <p>
	  * 创建日期:2007-10-25
	  * @return java.lang.String
	  */
	public java.lang.String getPKFieldName() {
	 	  return "pk_reckalarm";
	 	}

	/**
      * <p>返回表名称.
	  * <p>
	  * 创建日期:2007-10-25
	  * @return java.lang.String
	 */
	public java.lang.String getTableName() {

		return "fbm_reckalarm";
	}

    /**
	  * 按照默认方式创建构造子.
	  *
	  * 创建日期:2007-10-25
	  */
	public ReckalarmVO() {

			   super();
	  }

            /**
	 * 使用主键进行初始化的构造子.
	 *
	 * 创建日期:2007-10-25
	 * @param newPk_reckalarm 主键值
	 */
	 public ReckalarmVO(String newPk_reckalarm) {

		// 为主键字段赋值:
		 pk_reckalarm = newPk_reckalarm;

    	}


     /**
	  * 返回对象标识,用来唯一定位对象.
	  *
	  * 创建日期:2007-10-25
	  * @return String
	  */
	   public String getPrimaryKey() {

		 return pk_reckalarm;

	   }

     /**
	  * 设置对象标识,用来唯一定位对象.
	  *
	  * 创建日期:2007-10-25
	  * @param newPk_reckalarm  String
	  */
	 public void setPrimaryKey(String newPk_reckalarm) {

				pk_reckalarm = newPk_reckalarm;

	 }

	  /**
       * 返回数值对象的显示名称.
	   *
	   * 创建日期:2007-10-25
	   * @return java.lang.String 返回数值对象的显示名称.
	   */
	 public String getEntityName() {

	   return "fbm_reckalarm";

	 }

	public UFDateTime getTs() {
		return ts;
	}

	public void setTs(UFDateTime ts) {
		this.ts = ts;
	}

	public Integer getDr() {
		return dr;
	}

	public void setDr(Integer dr) {
		this.dr = dr;
	}

	public String getInacc() {
		return inacc;
	}

	public void setInacc(String inacc) {
		this.inacc = inacc;
	}

	public String getOutacc() {
		return outacc;
	}

	public void setOutacc(String outacc) {
		this.outacc = outacc;
	}
	
	
}