package com.brilliance.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 描述：担保合同与抵质押物表
 *
 * @author xiaoshuiquan
 * @date 2018/08/26
 */

@TableName("BIZ_CONTRACT_COLLATERAL")
@SuppressWarnings("serial")
public class BizBetInformation extends SuperEntity<BizBetInformation> implements Serializable {
    /**
     * 担保合同编号
     */
    @TableField("GUAR_NO")
    private Long guarNo;
    /**
     * 押品编号
     */
    @TableField("PLED_NO")
    private Long pledNo;
    /**
     * 押品信息描述
     */
    @TableField("PRODUCT_INFORMATION")
    private String productInformation;
    /**
     * 押品类型
     */
    @TableField("GUAR_MART_TYPE")
    private Long guarmartType;

    public Long getGuarNo() {
        return guarNo;
    }

    public void setGuarNo(Long guarNo) {
        this.guarNo = guarNo;
    }

    public Long getPledNo() {
        return pledNo;
    }

    public void setPledNo(Long pledNo) {
        this.pledNo = pledNo;
    }

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    public Long getGuarmartType() {
        return guarmartType;
    }

    public void setGuarmartType(Long guarmartType) {
        this.guarmartType = guarmartType;
    }
}

