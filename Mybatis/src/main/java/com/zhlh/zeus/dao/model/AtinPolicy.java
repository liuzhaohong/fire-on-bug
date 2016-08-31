package com.zhlh.zeus.dao.model;

import java.util.Date;

public class AtinPolicy extends BaseModel {
    private Integer id;

    private String orderId;

    private Integer quotationId;

    private String insuComPriceNo;

    private String insuProtocolCode;

    private String saleProtocolCode;

    private String partnerCode;

    private String channelCode;

    private String origin;

    private String insurerCode;

    private String cityCode;

    private Integer totalAmount;

    private Integer benchmarkPremium;

    private Integer premium;

    private Integer sumDiscount;

    private String discount;

    private String checkCode;

    private String jurisdictArea;

    private String argueSolution;

    private String arbitration;

    private Date insureDate;

    private Integer policyStatus;

    private String policyStatusMsg;

    private Integer payStatus;

    private Integer printStatus;

    private Integer postStatus;

    private Integer settleStatus;

    private String postNo;

    private String postContact;

    private String postTel;

    private String postMobile;

    private String postEmail;

    private String postAddr;

    private String postCode;

    private String relationFlag;

    private String identityCheckCode;

    private String tciSearchNo;

    private String tciPremSearchNo;

    private String tciPreconfirmNo;

    private String tciSubmitNo;

    private String tciLastStartDate;

    private String tciLastEndDate;

    private String tciProposalNo;

    private String tciPolicyNo;

    private String tciUdwrtFlag;

    private String tciUdwrtMessage;

    private Integer tciSumAmount;

    private Integer tciBenchmarkPremium;

    private Integer tciPremium;

    private Integer tciDiscountAmount;

    private String tciDiscount;

    private String tciStartDate;

    private String tciEndDate;

    private String tciSuccessFlag;

    private String tciFailReason;

    private String tciConfirmNo;

    private String tciMsgBackFlag;

    private String tciRcclFlag;

    private String tciRcclMessage;

    private String vciSearchNo;

    private String vciPremSearchNo;

    private String vciPreconfirmNo;

    private String vciSubmitNo;

    private String vciProposalNo;

    private String vciPolicyNo;

    private String vciUdwrtFlag;

    private String vciUdwrtMessage;

    private String vciLastStartDate;

    private String vciLastEndDate;

    private String vciStartDate;

    private String vciEndDate;

    private Integer vciBenchmarkPremium;

    private Integer vciPremium;

    private String vciDiscount;

    private Integer vciDiscountAmount;

    private Integer vciAdtnlFee;

    private String vciSuccessFlag;

    private String vciFailReason;

    private String vciConfirmNo;

    private String vciMsgBackFlag;

    private String vciRcclFlag;

    private String vciRcclMessage;

    private Integer sumTravelTax;

    private String licenseNo;

    private String frameNo;

    private String engineNo;

    private Integer actualValue;

    private Integer purchasePrice;

    private String owner;

    private String ownerCertType;

    private String ownerCertNo;

    private String brandName;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Integer quotationId) {
        this.quotationId = quotationId;
    }

    public String getInsuComPriceNo() {
        return insuComPriceNo;
    }

    public void setInsuComPriceNo(String insuComPriceNo) {
        this.insuComPriceNo = insuComPriceNo == null ? null : insuComPriceNo.trim();
    }

    public String getInsuProtocolCode() {
        return insuProtocolCode;
    }

    public void setInsuProtocolCode(String insuProtocolCode) {
        this.insuProtocolCode = insuProtocolCode == null ? null : insuProtocolCode.trim();
    }

    public String getSaleProtocolCode() {
        return saleProtocolCode;
    }

    public void setSaleProtocolCode(String saleProtocolCode) {
        this.saleProtocolCode = saleProtocolCode == null ? null : saleProtocolCode.trim();
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode == null ? null : partnerCode.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getInsurerCode() {
        return insurerCode;
    }

    public void setInsurerCode(String insurerCode) {
        this.insurerCode = insurerCode == null ? null : insurerCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getBenchmarkPremium() {
        return benchmarkPremium;
    }

    public void setBenchmarkPremium(Integer benchmarkPremium) {
        this.benchmarkPremium = benchmarkPremium;
    }

    public Integer getPremium() {
        return premium;
    }

    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    public Integer getSumDiscount() {
        return sumDiscount;
    }

    public void setSumDiscount(Integer sumDiscount) {
        this.sumDiscount = sumDiscount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode == null ? null : checkCode.trim();
    }

    public String getJurisdictArea() {
        return jurisdictArea;
    }

    public void setJurisdictArea(String jurisdictArea) {
        this.jurisdictArea = jurisdictArea == null ? null : jurisdictArea.trim();
    }

    public String getArgueSolution() {
        return argueSolution;
    }

    public void setArgueSolution(String argueSolution) {
        this.argueSolution = argueSolution == null ? null : argueSolution.trim();
    }

    public String getArbitration() {
        return arbitration;
    }

    public void setArbitration(String arbitration) {
        this.arbitration = arbitration == null ? null : arbitration.trim();
    }

    public Date getInsureDate() {
        return insureDate;
    }

    public void setInsureDate(Date insureDate) {
        this.insureDate = insureDate;
    }

    public Integer getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(Integer policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getPolicyStatusMsg() {
        return policyStatusMsg;
    }

    public void setPolicyStatusMsg(String policyStatusMsg) {
        this.policyStatusMsg = policyStatusMsg == null ? null : policyStatusMsg.trim();
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPrintStatus() {
        return printStatus;
    }

    public void setPrintStatus(Integer printStatus) {
        this.printStatus = printStatus;
    }

    public Integer getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Integer postStatus) {
        this.postStatus = postStatus;
    }

    public Integer getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Integer settleStatus) {
        this.settleStatus = settleStatus;
    }

    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo == null ? null : postNo.trim();
    }

    public String getPostContact() {
        return postContact;
    }

    public void setPostContact(String postContact) {
        this.postContact = postContact == null ? null : postContact.trim();
    }

    public String getPostTel() {
        return postTel;
    }

    public void setPostTel(String postTel) {
        this.postTel = postTel == null ? null : postTel.trim();
    }

    public String getPostMobile() {
        return postMobile;
    }

    public void setPostMobile(String postMobile) {
        this.postMobile = postMobile == null ? null : postMobile.trim();
    }

    public String getPostEmail() {
        return postEmail;
    }

    public void setPostEmail(String postEmail) {
        this.postEmail = postEmail == null ? null : postEmail.trim();
    }

    public String getPostAddr() {
        return postAddr;
    }

    public void setPostAddr(String postAddr) {
        this.postAddr = postAddr == null ? null : postAddr.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getRelationFlag() {
        return relationFlag;
    }

    public void setRelationFlag(String relationFlag) {
        this.relationFlag = relationFlag == null ? null : relationFlag.trim();
    }

    public String getIdentityCheckCode() {
        return identityCheckCode;
    }

    public void setIdentityCheckCode(String identityCheckCode) {
        this.identityCheckCode = identityCheckCode == null ? null : identityCheckCode.trim();
    }

    public String getTciSearchNo() {
        return tciSearchNo;
    }

    public void setTciSearchNo(String tciSearchNo) {
        this.tciSearchNo = tciSearchNo == null ? null : tciSearchNo.trim();
    }

    public String getTciPremSearchNo() {
        return tciPremSearchNo;
    }

    public void setTciPremSearchNo(String tciPremSearchNo) {
        this.tciPremSearchNo = tciPremSearchNo == null ? null : tciPremSearchNo.trim();
    }

    public String getTciPreconfirmNo() {
        return tciPreconfirmNo;
    }

    public void setTciPreconfirmNo(String tciPreconfirmNo) {
        this.tciPreconfirmNo = tciPreconfirmNo == null ? null : tciPreconfirmNo.trim();
    }

    public String getTciSubmitNo() {
        return tciSubmitNo;
    }

    public void setTciSubmitNo(String tciSubmitNo) {
        this.tciSubmitNo = tciSubmitNo == null ? null : tciSubmitNo.trim();
    }

    public String getTciLastStartDate() {
        return tciLastStartDate;
    }

    public void setTciLastStartDate(String tciLastStartDate) {
        this.tciLastStartDate = tciLastStartDate == null ? null : tciLastStartDate.trim();
    }

    public String getTciLastEndDate() {
        return tciLastEndDate;
    }

    public void setTciLastEndDate(String tciLastEndDate) {
        this.tciLastEndDate = tciLastEndDate == null ? null : tciLastEndDate.trim();
    }

    public String getTciProposalNo() {
        return tciProposalNo;
    }

    public void setTciProposalNo(String tciProposalNo) {
        this.tciProposalNo = tciProposalNo == null ? null : tciProposalNo.trim();
    }

    public String getTciPolicyNo() {
        return tciPolicyNo;
    }

    public void setTciPolicyNo(String tciPolicyNo) {
        this.tciPolicyNo = tciPolicyNo == null ? null : tciPolicyNo.trim();
    }

    public String getTciUdwrtFlag() {
        return tciUdwrtFlag;
    }

    public void setTciUdwrtFlag(String tciUdwrtFlag) {
        this.tciUdwrtFlag = tciUdwrtFlag == null ? null : tciUdwrtFlag.trim();
    }

    public String getTciUdwrtMessage() {
        return tciUdwrtMessage;
    }

    public void setTciUdwrtMessage(String tciUdwrtMessage) {
        this.tciUdwrtMessage = tciUdwrtMessage == null ? null : tciUdwrtMessage.trim();
    }

    public Integer getTciSumAmount() {
        return tciSumAmount;
    }

    public void setTciSumAmount(Integer tciSumAmount) {
        this.tciSumAmount = tciSumAmount;
    }

    public Integer getTciBenchmarkPremium() {
        return tciBenchmarkPremium;
    }

    public void setTciBenchmarkPremium(Integer tciBenchmarkPremium) {
        this.tciBenchmarkPremium = tciBenchmarkPremium;
    }

    public Integer getTciPremium() {
        return tciPremium;
    }

    public void setTciPremium(Integer tciPremium) {
        this.tciPremium = tciPremium;
    }

    public Integer getTciDiscountAmount() {
        return tciDiscountAmount;
    }

    public void setTciDiscountAmount(Integer tciDiscountAmount) {
        this.tciDiscountAmount = tciDiscountAmount;
    }

    public String getTciDiscount() {
        return tciDiscount;
    }

    public void setTciDiscount(String tciDiscount) {
        this.tciDiscount = tciDiscount == null ? null : tciDiscount.trim();
    }

    public String getTciStartDate() {
        return tciStartDate;
    }

    public void setTciStartDate(String tciStartDate) {
        this.tciStartDate = tciStartDate == null ? null : tciStartDate.trim();
    }

    public String getTciEndDate() {
        return tciEndDate;
    }

    public void setTciEndDate(String tciEndDate) {
        this.tciEndDate = tciEndDate == null ? null : tciEndDate.trim();
    }

    public String getTciSuccessFlag() {
        return tciSuccessFlag;
    }

    public void setTciSuccessFlag(String tciSuccessFlag) {
        this.tciSuccessFlag = tciSuccessFlag == null ? null : tciSuccessFlag.trim();
    }

    public String getTciFailReason() {
        return tciFailReason;
    }

    public void setTciFailReason(String tciFailReason) {
        this.tciFailReason = tciFailReason == null ? null : tciFailReason.trim();
    }

    public String getTciConfirmNo() {
        return tciConfirmNo;
    }

    public void setTciConfirmNo(String tciConfirmNo) {
        this.tciConfirmNo = tciConfirmNo == null ? null : tciConfirmNo.trim();
    }

    public String getTciMsgBackFlag() {
        return tciMsgBackFlag;
    }

    public void setTciMsgBackFlag(String tciMsgBackFlag) {
        this.tciMsgBackFlag = tciMsgBackFlag == null ? null : tciMsgBackFlag.trim();
    }

    public String getTciRcclFlag() {
        return tciRcclFlag;
    }

    public void setTciRcclFlag(String tciRcclFlag) {
        this.tciRcclFlag = tciRcclFlag == null ? null : tciRcclFlag.trim();
    }

    public String getTciRcclMessage() {
        return tciRcclMessage;
    }

    public void setTciRcclMessage(String tciRcclMessage) {
        this.tciRcclMessage = tciRcclMessage == null ? null : tciRcclMessage.trim();
    }

    public String getVciSearchNo() {
        return vciSearchNo;
    }

    public void setVciSearchNo(String vciSearchNo) {
        this.vciSearchNo = vciSearchNo == null ? null : vciSearchNo.trim();
    }

    public String getVciPremSearchNo() {
        return vciPremSearchNo;
    }

    public void setVciPremSearchNo(String vciPremSearchNo) {
        this.vciPremSearchNo = vciPremSearchNo == null ? null : vciPremSearchNo.trim();
    }

    public String getVciPreconfirmNo() {
        return vciPreconfirmNo;
    }

    public void setVciPreconfirmNo(String vciPreconfirmNo) {
        this.vciPreconfirmNo = vciPreconfirmNo == null ? null : vciPreconfirmNo.trim();
    }

    public String getVciSubmitNo() {
        return vciSubmitNo;
    }

    public void setVciSubmitNo(String vciSubmitNo) {
        this.vciSubmitNo = vciSubmitNo == null ? null : vciSubmitNo.trim();
    }

    public String getVciProposalNo() {
        return vciProposalNo;
    }

    public void setVciProposalNo(String vciProposalNo) {
        this.vciProposalNo = vciProposalNo == null ? null : vciProposalNo.trim();
    }

    public String getVciPolicyNo() {
        return vciPolicyNo;
    }

    public void setVciPolicyNo(String vciPolicyNo) {
        this.vciPolicyNo = vciPolicyNo == null ? null : vciPolicyNo.trim();
    }

    public String getVciUdwrtFlag() {
        return vciUdwrtFlag;
    }

    public void setVciUdwrtFlag(String vciUdwrtFlag) {
        this.vciUdwrtFlag = vciUdwrtFlag == null ? null : vciUdwrtFlag.trim();
    }

    public String getVciUdwrtMessage() {
        return vciUdwrtMessage;
    }

    public void setVciUdwrtMessage(String vciUdwrtMessage) {
        this.vciUdwrtMessage = vciUdwrtMessage == null ? null : vciUdwrtMessage.trim();
    }

    public String getVciLastStartDate() {
        return vciLastStartDate;
    }

    public void setVciLastStartDate(String vciLastStartDate) {
        this.vciLastStartDate = vciLastStartDate == null ? null : vciLastStartDate.trim();
    }

    public String getVciLastEndDate() {
        return vciLastEndDate;
    }

    public void setVciLastEndDate(String vciLastEndDate) {
        this.vciLastEndDate = vciLastEndDate == null ? null : vciLastEndDate.trim();
    }

    public String getVciStartDate() {
        return vciStartDate;
    }

    public void setVciStartDate(String vciStartDate) {
        this.vciStartDate = vciStartDate == null ? null : vciStartDate.trim();
    }

    public String getVciEndDate() {
        return vciEndDate;
    }

    public void setVciEndDate(String vciEndDate) {
        this.vciEndDate = vciEndDate == null ? null : vciEndDate.trim();
    }

    public Integer getVciBenchmarkPremium() {
        return vciBenchmarkPremium;
    }

    public void setVciBenchmarkPremium(Integer vciBenchmarkPremium) {
        this.vciBenchmarkPremium = vciBenchmarkPremium;
    }

    public Integer getVciPremium() {
        return vciPremium;
    }

    public void setVciPremium(Integer vciPremium) {
        this.vciPremium = vciPremium;
    }

    public String getVciDiscount() {
        return vciDiscount;
    }

    public void setVciDiscount(String vciDiscount) {
        this.vciDiscount = vciDiscount == null ? null : vciDiscount.trim();
    }

    public Integer getVciDiscountAmount() {
        return vciDiscountAmount;
    }

    public void setVciDiscountAmount(Integer vciDiscountAmount) {
        this.vciDiscountAmount = vciDiscountAmount;
    }

    public Integer getVciAdtnlFee() {
        return vciAdtnlFee;
    }

    public void setVciAdtnlFee(Integer vciAdtnlFee) {
        this.vciAdtnlFee = vciAdtnlFee;
    }

    public String getVciSuccessFlag() {
        return vciSuccessFlag;
    }

    public void setVciSuccessFlag(String vciSuccessFlag) {
        this.vciSuccessFlag = vciSuccessFlag == null ? null : vciSuccessFlag.trim();
    }

    public String getVciFailReason() {
        return vciFailReason;
    }

    public void setVciFailReason(String vciFailReason) {
        this.vciFailReason = vciFailReason == null ? null : vciFailReason.trim();
    }

    public String getVciConfirmNo() {
        return vciConfirmNo;
    }

    public void setVciConfirmNo(String vciConfirmNo) {
        this.vciConfirmNo = vciConfirmNo == null ? null : vciConfirmNo.trim();
    }

    public String getVciMsgBackFlag() {
        return vciMsgBackFlag;
    }

    public void setVciMsgBackFlag(String vciMsgBackFlag) {
        this.vciMsgBackFlag = vciMsgBackFlag == null ? null : vciMsgBackFlag.trim();
    }

    public String getVciRcclFlag() {
        return vciRcclFlag;
    }

    public void setVciRcclFlag(String vciRcclFlag) {
        this.vciRcclFlag = vciRcclFlag == null ? null : vciRcclFlag.trim();
    }

    public String getVciRcclMessage() {
        return vciRcclMessage;
    }

    public void setVciRcclMessage(String vciRcclMessage) {
        this.vciRcclMessage = vciRcclMessage == null ? null : vciRcclMessage.trim();
    }

    public Integer getSumTravelTax() {
        return sumTravelTax;
    }

    public void setSumTravelTax(Integer sumTravelTax) {
        this.sumTravelTax = sumTravelTax;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo == null ? null : licenseNo.trim();
    }

    public String getFrameNo() {
        return frameNo;
    }

    public void setFrameNo(String frameNo) {
        this.frameNo = frameNo == null ? null : frameNo.trim();
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo == null ? null : engineNo.trim();
    }

    public Integer getActualValue() {
        return actualValue;
    }

    public void setActualValue(Integer actualValue) {
        this.actualValue = actualValue;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getOwnerCertType() {
        return ownerCertType;
    }

    public void setOwnerCertType(String ownerCertType) {
        this.ownerCertType = ownerCertType == null ? null : ownerCertType.trim();
    }

    public String getOwnerCertNo() {
        return ownerCertNo;
    }

    public void setOwnerCertNo(String ownerCertNo) {
        this.ownerCertNo = ownerCertNo == null ? null : ownerCertNo.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}