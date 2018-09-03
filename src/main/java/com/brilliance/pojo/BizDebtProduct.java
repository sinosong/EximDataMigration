package com.brilliance.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import org.ibase4j.core.base.BaseModel;
import org.ibase4j.vo.ProductVo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * 描述：债项产品关系表
 *
 * @author xiaoshuiquan
 * @date 2018/08/08
 */

@TableName("BIZ_DEBT_PRODUCT")
public class BizDebtProduct extends BaseModel implements Serializable {

    /**
     * 债项方案id
     */
    @TableField("DEBT_CODE")
    private String debtCode;
    /**
     * 产品种类
     */
    @TableField("BUSINESS_TYPES")
    private String businessType;
    /**
     * 产品名称
     */
    @TableField("PRODUCT_NAME")
    private String productName;
    /**
     * 行业投向
     */
    @TableField("INDUSTRY_INVESTMENT")
    private String industryInvestment;
    /**
     * 背景国别
     */
    @TableField("BACKGROUND_NATIONALITY")
    private String backgroundNationality;

    public String getDebtCode() {
        return debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIndustryInvestment() {
        return industryInvestment;
    }

    public void setIndustryInvestment(String industryInvestment) {
        this.industryInvestment = industryInvestment;
    }

    public String getBackgroundNationality() {
        return backgroundNationality;
    }

    public void setBackgroundNationality(String backgroundNationality) {
        this.backgroundNationality = backgroundNationality;
    }
}