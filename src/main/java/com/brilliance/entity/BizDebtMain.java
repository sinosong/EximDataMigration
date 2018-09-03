package com.brilliance.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * 描述：债项概要
 *
 * @author xiaoshuiquan
 * @date 2018/05/26
 */

@TableName("BIZ_DEBT_MAIN")
public class BizDebtMain extends BaseModel implements Serializable {

    /**
     * 债项方案id
     */
    @TableField("DEBT_CODE")
    private String debtCode;
    /**
     * 项目名称
     */
    @TableField("PROJECT_NAME")
    private String projectName;
    /**
     * 柜员id
     */
    @TableField("BANK_TELL_ID")
    private Long bankTellerId;
    /**
     * 流程发起时间
     */
    @TableField("WF_TIME")
    private Date processInitiatTime;
    /**
     * 效期循环规则
     */
    @TableField("VALIDITY_CYCLE_GAUGE")
    private Long validityCcycleGauge;
    /**
     * 方案生效日期
     */
    @TableField("PG_EFFECTIVE_DATE")
    private Date pgEffectivDate;
    /**
     * 方案失效日期
     */
    @TableField("PG_EXPI_DATE")
    private Date pgExpiDate;
    /**
     * 方案循环标志
     */
    @TableField("LOOP_FLAG")
    private Long ls;
    /**
     * 产品规则
     */
    @TableField("RULE_TYPE")
    private Long ruleType;
    /**
     * 可办理笔数限制
     */
    @TableField("LTNOPA")
    private Long ltnopa;
    /**
     * 可办理笔数
     */
    @TableField("TDWLN")
    private Long tdwln;
    /**
     * 方案主币种
     */
    @TableField("M_CURRENCY")
    private String mpc;
    /**
     * 方案金额
     */
    @TableField("SOLUTION_AMT")
    private BigDecimal solutionAmount;
    /**
     * 方案辅助币种(0无1其他可选币种2等值其他币种)
     */
    @TableField("A_CURRENCY")
    private String aCurrrency;
    /**
     * 其他可选币种
     */
    @TableField("O_CURRENCY")
    private String oc;
    /**
     * 方案业务期限范围
     */
    @TableField("SCOPE_BUSIN_PERIOD")
    private Long dopo;
    /**
     * 方案费率类型
     */
    @TableField("PROG_RATE_TYPE")
    private Long progRateType;
    /**
     * 方案费率形式
     */
    @TableField("SCHEME_RATE_FORM")
    private Long schemeRateForm;
    /**
     * 方案费率范围最低值
     */
    @TableField("RATE_RANGE_MIX")
    private Long rateRangeMix;
    /**
     * 方案费率范围最高值
     */
    @TableField("RATE_RANGE_MAX")
    private Long rateRangeMax;
    /**
     * 方案费率
     */
    @TableField("PACKAGE_RATE")
    private Long packageRate;
    /**
     * 是否经审批
     */
    @TableField("APPROVE")
    private Long approve;
    /**
     * 费率审批机构
     */
    @TableField("RATE_APPROVAL_ORG")
    private Long raaa;
    /**
     * 是否存在方案费率折扣
     */
    @TableField("WHETHER_RATE_DISCOUNT")
    private Long whetherRateDiscount;
    /**
     * 方案费率折扣
     */
    @TableField("PROGRAM_RATE_DISCOUNT")
    private Long programRateDiscount;
    /**
     * 利率规则描述
     */
    @TableField("DESCRIPTION_RATE_RULES")
    private String descriptionRateRules;
    /**
     * 交易背景概况
     */
    @TableField("BRIF_BACKGROUND")
    private String brifBackground;
    /**
     * 交易背景
     */
    @TableField("TRAD_BACKGROUND")
    private String tradBackground;
    /**
     * 业务背景简述
     */
    @TableField("BUSINESS_BACKGROUND_BRIEF")
    private String businessBackgroundBrief;
    /**
     * 货物/服务情况简述
     */
    @TableField("GOODS_SKETCH")
    private String goodsSketch;
    /**
     * 政策性属性描述
     */
    @TableField("POLICY_DESCRIPTION")
    private String policyDescription;
    /**
     * 是否是政策性
     */
    @TableField("POLICY")
    private String policy;
    /**
     * 申请人
     */
    @TableField("PROPOSER")
    private String proposer;
    /**
     * 申请人客户号
     */
    @TableField("PROPOSER_NUM")
    private String proposerNum;
    /**
     * 是否单笔单批
     */
    @TableField("SINGLE_BATCH")
    private Long singleBtch;
    /**
     * 经办机构编码
     */
    @TableField("INSTITUTION_CODE")
    private String institutionCode;

    /**
     * 说明：追加方案状态
     * 作者：陈志明
     * 日期：2018/7/12
     * 1、系统根据该债项方案的审批状态，自动显示；
     * 2、方案状态：可发放/过期。状态类型，参见方案状态及方案审核状态
     * 3、灰显，不可修改
     */
    @TableField("SOLUTION_STATE")
    private Integer solutionState;


    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    public String getProposerNum() {
        return proposerNum;
    }

    public void setProposerNum(String proposerNum) {
        this.proposerNum = proposerNum;
    }

    public Long getSingleBtch() {
        return singleBtch;
    }

    public void setSingleBtch(Long singleBtch) {
        this.singleBtch = singleBtch;
    }

    public Long getLtnopa() {
        return ltnopa;
    }

    public void setLtnopa(Long ltnopa) {
        this.ltnopa = ltnopa;
    }

    public Long getTdwln() {
        return tdwln;
    }

    public void setTdwln(Long tdwln) {
        this.tdwln = tdwln;
    }

    public String getMpc() {
        return mpc;
    }

    public void setMpc(String mpc) {
        this.mpc = mpc;
    }

    public String getOc() {
        return oc;
    }

    public void setOc(String oc) {
        this.oc = oc;
    }

    public BigDecimal getSolutionAmount() {
        return solutionAmount;
    }

    public void setSolutionAmount(BigDecimal solutionAmount) {
        this.solutionAmount = solutionAmount;
    }

    public Long getDopo() {
        return dopo;
    }

    public void setDopo(Long dopo) {
        this.dopo = dopo;
    }

    public String getDebtCode() {
        return debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    public Long getRateRangeMix() {
        return rateRangeMix;
    }

    public void setRateRangeMix(Long rateRangeMix) {
        this.rateRangeMix = rateRangeMix;
    }

    public Long getRateRangeMax() {
        return rateRangeMax;
    }

    public void setRateRangeMax(Long rateRangeMax) {
        this.rateRangeMax = rateRangeMax;
    }

    public String getPolicyDescription() {
        return policyDescription;
    }

    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
    }

    public Long getWhetherRateDiscount() {
        return whetherRateDiscount;
    }

    public void setWhetherRateDiscount(Long whetherRateDiscount) {
        this.whetherRateDiscount = whetherRateDiscount;
    }

    public Long getProgramRateDiscount() {
        return programRateDiscount;
    }

    public void setProgramRateDiscount(Long programRateDiscount) {
        this.programRateDiscount = programRateDiscount;
    }

    public Long getRaaa() {
        return raaa;
    }

    public void setRaaa(Long raaa) {
        this.raaa = raaa;
    }

    public Long getPackageRate() {
        return packageRate;
    }

    public void setPackageRate(Long packageRate) {
        this.packageRate = packageRate;
    }

    public Long getProgRateType() {
        return progRateType;
    }

    public void setProgRateType(Long progRateType) {
        this.progRateType = progRateType;
    }

    public Date getPgEffectivDate() {
        return pgEffectivDate;
    }

    public void setPgEffectivDate(Date pgEffectivDate) {
        this.pgEffectivDate = pgEffectivDate;
    }

    public Date getPgExpiDate() {
        return pgExpiDate;
    }

    public void setPgExpiDate(Date pgExpiDate) {
        this.pgExpiDate = pgExpiDate;
    }

    public Long getLs() {
        return ls;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Long getBankTellerId() {
        return bankTellerId;
    }

    public void setBankTellerId(Long bankTellerId) {
        this.bankTellerId = bankTellerId;
    }

    public Date getProcessInitiatTime() {
        return processInitiatTime;
    }

    public void setProcessInitiatTime(Date processInitiatTime) {
        this.processInitiatTime = processInitiatTime;
    }

    public Long getValidityCcycleGauge() {
        return validityCcycleGauge;
    }

    public void setValidityCcycleGauge(Long validityCcycleGauge) {
        this.validityCcycleGauge = validityCcycleGauge;
    }

    public void setLs(Long ls) {
        this.ls = ls;
    }

    public Long getRuleType() {
        return ruleType;
    }

    public void setRuleType(Long ruleType) {
        this.ruleType = ruleType;
    }

    public String getaCurrrency() {
        return aCurrrency;
    }

    public void setaCurrrency(String aCurrrency) {
        this.aCurrrency = aCurrrency;
    }



    public Long getSchemeRateForm() {
        return schemeRateForm;
    }

    public void setSchemeRateForm(Long schemeRateForm) {
        this.schemeRateForm = schemeRateForm;
    }

    public Long getApprove() {
        return approve;
    }

    public void setApprove(Long approve) {
        this.approve = approve;
    }

    public String getDescriptionRateRules() {
        return descriptionRateRules;
    }

    public void setDescriptionRateRules(String descriptionRateRules) {
        this.descriptionRateRules = descriptionRateRules;
    }

    public String getBrifBackground() {
        return brifBackground;
    }

    public void setBrifBackground(String brifBackground) {
        this.brifBackground = brifBackground;
    }

    public String getTradBackground() {
        return tradBackground;
    }

    public void setTradBackground(String tradBackground) {
        this.tradBackground = tradBackground;
    }

    public String getBusinessBackgroundBrief() {
        return businessBackgroundBrief;
    }

    public void setBusinessBackgroundBrief(String businessBackgroundBrief) {
        this.businessBackgroundBrief = businessBackgroundBrief;
    }

    public String getGoodsSketch() {
        return goodsSketch;
    }

    public void setGoodsSketch(String goodsSketch) {
        this.goodsSketch = goodsSketch;
    }

    public Integer getSolutionState() {
        return solutionState;
    }

    public void setSolutionState(Integer solutionState) {
        this.solutionState = solutionState;
    }

}
