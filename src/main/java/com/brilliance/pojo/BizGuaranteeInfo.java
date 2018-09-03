package com.brilliance.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 描述：担保信息表
 *
 * @author xiaoshuiquan
 * @date 2018/07/17
 */

@TableName("BIZ_GUARANTEE_INFO")
@SuppressWarnings("serial")
public class BizGuaranteeInfo extends BaseModel implements Serializable {

    /**
     * 债项方案id
     */
    @TableField("DEBT_CODE")
    private String debtCode;
    /**
     * 基础担保类型（分）
     */
    @TableField("TYPE_POINT")
    private Long typePoint;
    /**
     * 担保合同类型/占用额度类型
     */
    @TableField("GUARANTEE_CONTRACT_TYPE")
    private Long guaranteeContractType;
    /**
     * 担保合同编号
     */
    @TableField("WARRANTY_CONTRACT_NUMBER")
    private Long warrantyContractNumber;
    /**
     * 担保人
     */
    @TableField("GUARANTOR")
    private String guarantor;
    /**
     * 担保人客户编号
     */
    @TableField("GUARANTOR_CUST_ID")
    private Long guarantorCustId;
    /**
     * 担保币种
     */
    @TableField("CURRENCY_GUARANTEE")
    private String currencyGuarantee;
    /**
     * 担保金额
     */
    @TableField("GUARANTEE_AMOUNT")
    private BigDecimal guaranteeAmount;
    /**
     * 担保使用产品
     */
    @TableField("GUARANTEED_USE_PRODUCT")
    private String guaranteedUseProduct;
    /**
     * 押品信息描述
     */
    @TableField("PRODUCT_INFORMATION")
    private String productInformation;
    /**
     * 备注
     */
    @TableField("NOTE_")
    private String note;

    /**
     * 风险分析中的押品信息
     */
    @TableField(exist = false)
    private List<BizBetInformation> betInformationList;


    public List<BizBetInformation> getBetInformationList() {
        return betInformationList;
    }

    public void setBetInformationList(List<BizBetInformation> betInformationList) {
        this.betInformationList = betInformationList;
    }

    public String getDebtCode() {
        return debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getTypePoint() {
        return typePoint;
    }

    public void setTypePoint(Long typePoint) {
        this.typePoint = typePoint;
    }

    public Long getGuaranteeContractType() {
        return guaranteeContractType;
    }

    public void setGuaranteeContractType(Long guaranteeContractType) {
        this.guaranteeContractType = guaranteeContractType;
    }

    public String getGuaranteedUseProduct() {
        return guaranteedUseProduct;
    }

    public void setGuaranteedUseProduct(String guaranteedUseProduct) {
        this.guaranteedUseProduct = guaranteedUseProduct;
    }

    public Long getWarrantyContractNumber() {
        return warrantyContractNumber;
    }

    public void setWarrantyContractNumber(Long warrantyContractNumber) {
        this.warrantyContractNumber = warrantyContractNumber;
    }

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    public Long getGuarantorCustId() {
        return guarantorCustId;
    }

    public void setGuarantorCustId(Long guarantorCustId) {
        this.guarantorCustId = guarantorCustId;
    }

    public String getCurrencyGuarantee() {
        return currencyGuarantee;
    }

    public void setCurrencyGuarantee(String currencyGuarantee) {
        this.currencyGuarantee = currencyGuarantee;
    }

    public BigDecimal getGuaranteeAmount() {
        return guaranteeAmount;
    }

    public void setGuaranteeAmount(BigDecimal guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }
}

