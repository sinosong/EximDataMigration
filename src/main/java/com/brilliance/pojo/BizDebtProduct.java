package main.java.com.brilliance.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIZ_DEBT_PRODUCT")
public class BizDebtProduct {

    /**
     * 债项方案id
     */
    @Column(name = "DEBT_CODE", unique = true, nullable = false)
    private String debtCode;
    /**
     * 产品种类
     */
    @Column(name = "BUSINESS_TYPES")
    private String businessType;
    /**
     * 产品名称
     */
    @Column(name = "PRODUCT_NAME")
    private String productName;
    /**
     * 行业投向
     */
    @Column(name = "INDUSTRY_INVESTMENT")
    private String industryInvestment;
    /**
     * 背景国别
     */
    @Column(name = "BACKGROUND_NATIONALITY")
    private String backgroundNationality;


}
