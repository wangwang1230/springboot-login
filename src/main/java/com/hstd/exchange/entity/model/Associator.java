package com.hstd.exchange.entity.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table PJ_ASSOCIATOR
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class Associator extends AssociatorKey {
    /**
     * Database Column Remarks:
     *   管理员账号  必输，唯一
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.ACCT_NO
     *
     * @mbggenerated
     */
    private String acctNo;

    /**
     * Database Column Remarks:
     *   管理员密码  必输，明文，不要转码。(因为要手工输入)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.PASSWORD
     *
     * @mbggenerated
     */
    private String password;

    /**
     * Database Column Remarks:
     *   管理员邮箱  必输，校验是否满足邮箱格式，唯一
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.EMAIL
     *
     * @mbggenerated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   管理员手机  必输，校验是否满足手机号格式，唯一
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.MOBILE_PHONE
     *
     * @mbggenerated
     */
    private String mobilePhone;

    /**
     * Database Column Remarks:
     *   会员类型  2个人用户  ，1企业用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.CUST_TYPE
     *
     * @mbggenerated
     */
    private String custType;

    /**
     * Database Column Remarks:
     *   联系人中文名  只有企业用户的时候才需要录入
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.LINKMAN
     *
     * @mbggenerated
     */
    private String linkman;

    /**
     * Database Column Remarks:
     *   联系人手机号码  只有企业用户的时候才需要录入
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.MBPHONE
     *
     * @mbggenerated
     */
    private String mbphone;

    /**
     * Database Column Remarks:
     *   联系人电子邮箱  只有企业用户的时候才需要录入
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.CON_EMAIL
     *
     * @mbggenerated
     */
    private String conEmail;

    /**
     * Database Column Remarks:
     *   身份证上传正面  照片存储的地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.ID_PHOTO_FACE
     *
     * @mbggenerated
     */
    private String idPhotoFace;

    /**
     * Database Column Remarks:
     *   身份证上传背面  照片存储的地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.ID_PHOTO_BACK
     *
     * @mbggenerated
     */
    private String idPhotoBack;

    /**
     * Database Column Remarks:
     *   营业执照上传一  照片存储的地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.PHOTO1
     *
     * @mbggenerated
     */
    private String photo1;

    /**
     * Database Column Remarks:
     *   组织机构代码证上传二  照片存储的地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.PHOTO2
     *
     * @mbggenerated
     */
    private String photo2;

    /**
     * Database Column Remarks:
     *   税务登记证上传三  照片存储的地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.PHOTO3
     *
     * @mbggenerated
     */
    private String photo3;

    /**
     * Database Column Remarks:
     *   前端备注信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   票市通系统内该用户的审核状态 0、未认证，1、待认证，2、已认证 3、被驳回未认证
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * Database Column Remarks:
     *   是否申请认证  1，未申请，2、待申请
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.APPROV_STATUS
     *
     * @mbggenerated
     */
    private String approvStatus;

    /**
     * Database Column Remarks:
     *   手机认证申请  为之后填写手机认证码做准备
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.PHONE_APPROVNO
     *
     * @mbggenerated
     */
    private String phoneApprovno;

    /**
     * Database Column Remarks:
     *   是否申请密码修改  1、申请密码修改，2、未申请密码修改
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.PASSWORD_CHANGED
     *
     * @mbggenerated
     */
    private String passwordChanged;

    /**
     * Database Column Remarks:
     *   邮箱认证申请  为之后填写邮箱认证码做准备
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.EMAIL_APPROVNO
     *
     * @mbggenerated
     */
    private String emailApprovno;

    /**
     * Database Column Remarks:
     *   注册日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.REGISTER_DATE
     *
     * @mbggenerated
     */
    private Date registerDate;

    /**
     * Database Column Remarks:
     *   认证日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.APPROVE_DATE
     *
     * @mbggenerated
     */
    private Date approveDate;

    /**
     * Database Column Remarks:
     *   交易密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.TRADE_PASSWORD
     *
     * @mbggenerated
     */
    private String tradePassword;

    /**
     * Database Column Remarks:
     *   系统中的clientId
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.CLIENT_ID
     *
     * @mbggenerated
     */
    private String clientId;

    /**
     * Database Column Remarks:
     *   个人用户的姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.PERSONNAME
     *
     * @mbggenerated
     */
    private String personname;

    /**
     * Database Column Remarks:
     *   个人用户的身份证号码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.IDCARDNUM
     *
     * @mbggenerated
     */
    private String idcardnum;

    /**
     * Database Column Remarks:
     *   推荐码——自己的
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.INVITE_CODE
     *
     * @mbggenerated
     */
    private String inviteCode;

    /**
     * Database Column Remarks:
     *   被推荐码--别人的；如果在会员注册邀请码登记表查询到该邀请码，注册/认证成功后，调用登记的业务处理逻辑
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.INVITED_CODE
     *
     * @mbggenerated
     */
    private String invitedCode;

    /**
     * Database Column Remarks:
     *   来源标记 0、网站 1、微信
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.SOURCE_FLAG
     *
     * @mbggenerated
     */
    private String sourceFlag;

    /**
     * Database Column Remarks:
     *   来源id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.SOURCE_ID
     *
     * @mbggenerated
     */
    private String sourceId;

    /**
     * Database Column Remarks:
     *   业务功能标记: 使用位运算计算允许使用的业务功能
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.FUNCTION_RIGHT_FLAG
     *
     * @mbggenerated
     */
    private long functionRightFlag;

    /**
     * Database Column Remarks:
     *   业务联系人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.BUSSINESS_LINKMAN
     *
     * @mbggenerated
     */
    private String bussinessLinkman;

    /**
     * Database Column Remarks:
     *   业务联系人手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.BUSSINESS_PHONE
     *
     * @mbggenerated
     */
    private String bussinessPhone;

    /**
     * Database Column Remarks:
     *   关联码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.ASSOCIATED_CODE
     *
     * @mbggenerated
     */
    private String associatedCode;

    /**
     * Database Column Remarks:
     *   上传税务登记证
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.PHOTO4
     *
     * @mbggenerated
     */
    private String photo4;

    /**
     * Database Column Remarks:
     *   上传一般纳税人资格认定
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PJ_ASSOCIATOR.PHOTO5
     *
     * @mbggenerated
     */
    private String photo5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.ACCT_NO
     *
     * @return the value of PJ_ASSOCIATOR.ACCT_NO
     *
     * @mbggenerated
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.ACCT_NO
     *
     * @param acctNo the value for PJ_ASSOCIATOR.ACCT_NO
     *
     * @mbggenerated
     */
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.PASSWORD
     *
     * @return the value of PJ_ASSOCIATOR.PASSWORD
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.PASSWORD
     *
     * @param password the value for PJ_ASSOCIATOR.PASSWORD
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.EMAIL
     *
     * @return the value of PJ_ASSOCIATOR.EMAIL
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.EMAIL
     *
     * @param email the value for PJ_ASSOCIATOR.EMAIL
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.MOBILE_PHONE
     *
     * @return the value of PJ_ASSOCIATOR.MOBILE_PHONE
     *
     * @mbggenerated
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.MOBILE_PHONE
     *
     * @param mobilePhone the value for PJ_ASSOCIATOR.MOBILE_PHONE
     *
     * @mbggenerated
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.CUST_TYPE
     *
     * @return the value of PJ_ASSOCIATOR.CUST_TYPE
     *
     * @mbggenerated
     */
    public String getCustType() {
        return custType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.CUST_TYPE
     *
     * @param custType the value for PJ_ASSOCIATOR.CUST_TYPE
     *
     * @mbggenerated
     */
    public void setCustType(String custType) {
        this.custType = custType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.LINKMAN
     *
     * @return the value of PJ_ASSOCIATOR.LINKMAN
     *
     * @mbggenerated
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.LINKMAN
     *
     * @param linkman the value for PJ_ASSOCIATOR.LINKMAN
     *
     * @mbggenerated
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.MBPHONE
     *
     * @return the value of PJ_ASSOCIATOR.MBPHONE
     *
     * @mbggenerated
     */
    public String getMbphone() {
        return mbphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.MBPHONE
     *
     * @param mbphone the value for PJ_ASSOCIATOR.MBPHONE
     *
     * @mbggenerated
     */
    public void setMbphone(String mbphone) {
        this.mbphone = mbphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.CON_EMAIL
     *
     * @return the value of PJ_ASSOCIATOR.CON_EMAIL
     *
     * @mbggenerated
     */
    public String getConEmail() {
        return conEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.CON_EMAIL
     *
     * @param conEmail the value for PJ_ASSOCIATOR.CON_EMAIL
     *
     * @mbggenerated
     */
    public void setConEmail(String conEmail) {
        this.conEmail = conEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.ID_PHOTO_FACE
     *
     * @return the value of PJ_ASSOCIATOR.ID_PHOTO_FACE
     *
     * @mbggenerated
     */
    public String getIdPhotoFace() {
        return idPhotoFace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.ID_PHOTO_FACE
     *
     * @param idPhotoFace the value for PJ_ASSOCIATOR.ID_PHOTO_FACE
     *
     * @mbggenerated
     */
    public void setIdPhotoFace(String idPhotoFace) {
        this.idPhotoFace = idPhotoFace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.ID_PHOTO_BACK
     *
     * @return the value of PJ_ASSOCIATOR.ID_PHOTO_BACK
     *
     * @mbggenerated
     */
    public String getIdPhotoBack() {
        return idPhotoBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.ID_PHOTO_BACK
     *
     * @param idPhotoBack the value for PJ_ASSOCIATOR.ID_PHOTO_BACK
     *
     * @mbggenerated
     */
    public void setIdPhotoBack(String idPhotoBack) {
        this.idPhotoBack = idPhotoBack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.PHOTO1
     *
     * @return the value of PJ_ASSOCIATOR.PHOTO1
     *
     * @mbggenerated
     */
    public String getPhoto1() {
        return photo1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.PHOTO1
     *
     * @param photo1 the value for PJ_ASSOCIATOR.PHOTO1
     *
     * @mbggenerated
     */
    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.PHOTO2
     *
     * @return the value of PJ_ASSOCIATOR.PHOTO2
     *
     * @mbggenerated
     */
    public String getPhoto2() {
        return photo2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.PHOTO2
     *
     * @param photo2 the value for PJ_ASSOCIATOR.PHOTO2
     *
     * @mbggenerated
     */
    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.PHOTO3
     *
     * @return the value of PJ_ASSOCIATOR.PHOTO3
     *
     * @mbggenerated
     */
    public String getPhoto3() {
        return photo3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.PHOTO3
     *
     * @param photo3 the value for PJ_ASSOCIATOR.PHOTO3
     *
     * @mbggenerated
     */
    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.REMARK
     *
     * @return the value of PJ_ASSOCIATOR.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.REMARK
     *
     * @param remark the value for PJ_ASSOCIATOR.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.STATUS
     *
     * @return the value of PJ_ASSOCIATOR.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.STATUS
     *
     * @param status the value for PJ_ASSOCIATOR.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.APPROV_STATUS
     *
     * @return the value of PJ_ASSOCIATOR.APPROV_STATUS
     *
     * @mbggenerated
     */
    public String getApprovStatus() {
        return approvStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.APPROV_STATUS
     *
     * @param approvStatus the value for PJ_ASSOCIATOR.APPROV_STATUS
     *
     * @mbggenerated
     */
    public void setApprovStatus(String approvStatus) {
        this.approvStatus = approvStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.PHONE_APPROVNO
     *
     * @return the value of PJ_ASSOCIATOR.PHONE_APPROVNO
     *
     * @mbggenerated
     */
    public String getPhoneApprovno() {
        return phoneApprovno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.PHONE_APPROVNO
     *
     * @param phoneApprovno the value for PJ_ASSOCIATOR.PHONE_APPROVNO
     *
     * @mbggenerated
     */
    public void setPhoneApprovno(String phoneApprovno) {
        this.phoneApprovno = phoneApprovno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.PASSWORD_CHANGED
     *
     * @return the value of PJ_ASSOCIATOR.PASSWORD_CHANGED
     *
     * @mbggenerated
     */
    public String getPasswordChanged() {
        return passwordChanged;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.PASSWORD_CHANGED
     *
     * @param passwordChanged the value for PJ_ASSOCIATOR.PASSWORD_CHANGED
     *
     * @mbggenerated
     */
    public void setPasswordChanged(String passwordChanged) {
        this.passwordChanged = passwordChanged;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.EMAIL_APPROVNO
     *
     * @return the value of PJ_ASSOCIATOR.EMAIL_APPROVNO
     *
     * @mbggenerated
     */
    public String getEmailApprovno() {
        return emailApprovno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.EMAIL_APPROVNO
     *
     * @param emailApprovno the value for PJ_ASSOCIATOR.EMAIL_APPROVNO
     *
     * @mbggenerated
     */
    public void setEmailApprovno(String emailApprovno) {
        this.emailApprovno = emailApprovno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.REGISTER_DATE
     *
     * @return the value of PJ_ASSOCIATOR.REGISTER_DATE
     *
     * @mbggenerated
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.REGISTER_DATE
     *
     * @param registerDate the value for PJ_ASSOCIATOR.REGISTER_DATE
     *
     * @mbggenerated
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.APPROVE_DATE
     *
     * @return the value of PJ_ASSOCIATOR.APPROVE_DATE
     *
     * @mbggenerated
     */
    public Date getApproveDate() {
        return approveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.APPROVE_DATE
     *
     * @param approveDate the value for PJ_ASSOCIATOR.APPROVE_DATE
     *
     * @mbggenerated
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.TRADE_PASSWORD
     *
     * @return the value of PJ_ASSOCIATOR.TRADE_PASSWORD
     *
     * @mbggenerated
     */
    public String getTradePassword() {
        return tradePassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.TRADE_PASSWORD
     *
     * @param tradePassword the value for PJ_ASSOCIATOR.TRADE_PASSWORD
     *
     * @mbggenerated
     */
    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.CLIENT_ID
     *
     * @return the value of PJ_ASSOCIATOR.CLIENT_ID
     *
     * @mbggenerated
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.CLIENT_ID
     *
     * @param clientId the value for PJ_ASSOCIATOR.CLIENT_ID
     *
     * @mbggenerated
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.PERSONNAME
     *
     * @return the value of PJ_ASSOCIATOR.PERSONNAME
     *
     * @mbggenerated
     */
    public String getPersonname() {
        return personname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.PERSONNAME
     *
     * @param personname the value for PJ_ASSOCIATOR.PERSONNAME
     *
     * @mbggenerated
     */
    public void setPersonname(String personname) {
        this.personname = personname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.IDCARDNUM
     *
     * @return the value of PJ_ASSOCIATOR.IDCARDNUM
     *
     * @mbggenerated
     */
    public String getIdcardnum() {
        return idcardnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.IDCARDNUM
     *
     * @param idcardnum the value for PJ_ASSOCIATOR.IDCARDNUM
     *
     * @mbggenerated
     */
    public void setIdcardnum(String idcardnum) {
        this.idcardnum = idcardnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.INVITE_CODE
     *
     * @return the value of PJ_ASSOCIATOR.INVITE_CODE
     *
     * @mbggenerated
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.INVITE_CODE
     *
     * @param inviteCode the value for PJ_ASSOCIATOR.INVITE_CODE
     *
     * @mbggenerated
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.INVITED_CODE
     *
     * @return the value of PJ_ASSOCIATOR.INVITED_CODE
     *
     * @mbggenerated
     */
    public String getInvitedCode() {
        return invitedCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.INVITED_CODE
     *
     * @param invitedCode the value for PJ_ASSOCIATOR.INVITED_CODE
     *
     * @mbggenerated
     */
    public void setInvitedCode(String invitedCode) {
        this.invitedCode = invitedCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.SOURCE_FLAG
     *
     * @return the value of PJ_ASSOCIATOR.SOURCE_FLAG
     *
     * @mbggenerated
     */
    public String getSourceFlag() {
        return sourceFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.SOURCE_FLAG
     *
     * @param sourceFlag the value for PJ_ASSOCIATOR.SOURCE_FLAG
     *
     * @mbggenerated
     */
    public void setSourceFlag(String sourceFlag) {
        this.sourceFlag = sourceFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.SOURCE_ID
     *
     * @return the value of PJ_ASSOCIATOR.SOURCE_ID
     *
     * @mbggenerated
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.SOURCE_ID
     *
     * @param sourceId the value for PJ_ASSOCIATOR.SOURCE_ID
     *
     * @mbggenerated
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.FUNCTION_RIGHT_FLAG
     *
     * @return the value of PJ_ASSOCIATOR.FUNCTION_RIGHT_FLAG
     *
     * @mbggenerated
     */
    public long getFunctionRightFlag() {
        return functionRightFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.FUNCTION_RIGHT_FLAG
     *
     * @param functionRightFlag the value for PJ_ASSOCIATOR.FUNCTION_RIGHT_FLAG
     *
     * @mbggenerated
     */
    public void setFunctionRightFlag(long functionRightFlag) {
        this.functionRightFlag = functionRightFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.BUSSINESS_LINKMAN
     *
     * @return the value of PJ_ASSOCIATOR.BUSSINESS_LINKMAN
     *
     * @mbggenerated
     */
    public String getBussinessLinkman() {
        return bussinessLinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.BUSSINESS_LINKMAN
     *
     * @param bussinessLinkman the value for PJ_ASSOCIATOR.BUSSINESS_LINKMAN
     *
     * @mbggenerated
     */
    public void setBussinessLinkman(String bussinessLinkman) {
        this.bussinessLinkman = bussinessLinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.BUSSINESS_PHONE
     *
     * @return the value of PJ_ASSOCIATOR.BUSSINESS_PHONE
     *
     * @mbggenerated
     */
    public String getBussinessPhone() {
        return bussinessPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.BUSSINESS_PHONE
     *
     * @param bussinessPhone the value for PJ_ASSOCIATOR.BUSSINESS_PHONE
     *
     * @mbggenerated
     */
    public void setBussinessPhone(String bussinessPhone) {
        this.bussinessPhone = bussinessPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.ASSOCIATED_CODE
     *
     * @return the value of PJ_ASSOCIATOR.ASSOCIATED_CODE
     *
     * @mbggenerated
     */
    public String getAssociatedCode() {
        return associatedCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.ASSOCIATED_CODE
     *
     * @param associatedCode the value for PJ_ASSOCIATOR.ASSOCIATED_CODE
     *
     * @mbggenerated
     */
    public void setAssociatedCode(String associatedCode) {
        this.associatedCode = associatedCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.PHOTO4
     *
     * @return the value of PJ_ASSOCIATOR.PHOTO4
     *
     * @mbggenerated
     */
    public String getPhoto4() {
        return photo4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.PHOTO4
     *
     * @param photo4 the value for PJ_ASSOCIATOR.PHOTO4
     *
     * @mbggenerated
     */
    public void setPhoto4(String photo4) {
        this.photo4 = photo4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PJ_ASSOCIATOR.PHOTO5
     *
     * @return the value of PJ_ASSOCIATOR.PHOTO5
     *
     * @mbggenerated
     */
    public String getPhoto5() {
        return photo5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PJ_ASSOCIATOR.PHOTO5
     *
     * @param photo5 the value for PJ_ASSOCIATOR.PHOTO5
     *
     * @mbggenerated
     */
    public void setPhoto5(String photo5) {
        this.photo5 = photo5;
    }
}