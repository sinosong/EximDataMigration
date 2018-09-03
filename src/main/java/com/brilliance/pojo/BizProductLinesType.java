package com.brilliance.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 描述:业务品种与额度类型关系表
 *
 * @author xiaoshuiquan
 * @date 2018/06/19
 */

@TableName("BIZ_PRODUCT_LINESTYPE")
public class BizProductLinesType extends BaseModel implements Serializable {

    /**
     * 债项方案id
     */
    @TableField("DEBT_CODE")
    private String debtCode;
    /**
     * 业务品种编号（细类）
     */
    @TableField("BUSINESS_TYPE")
    private String businessType;
    /**
     * 客户编号(核心系统用户编码)
     */
    @TableField("CUST_NO")
    private String custNo;
    /**
     * 客户信息表外键
     */
    @TableField("BIZ_CUSTOMER_ID")
    private Long bizCustomerId;
    /**
     * 授信额度信息外键
     */
    @TableField("BIZ_CREDIT_LINES_ID")
    private Long creditLinesId;
    /**
     * 产品用信比例
     */
    @TableField("CREDIT_RATIO")
    private String creditRatio;

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getBusinessType() {
        return businessType;
    }

    public String getDebtCode() {
        return debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public Long getBizCustomerId() {
        return bizCustomerId;
    }

    public void setBizCustomerId(Long bizCustomerId) {
        this.bizCustomerId = bizCustomerId;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Long getCreditLinesId() {
        return creditLinesId;
    }

    public void setCreditLinesId(Long creditLinesId) {
        this.creditLinesId = creditLinesId;
    }

    public String getCreditRatio() {
        return creditRatio;
    }

    public void setCreditRatio(String creditRatio) {
        this.creditRatio = creditRatio;
    }
}
