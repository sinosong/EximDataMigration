package main.java.com.brilliance.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "BIZ_DEBT_MAIN")
public class BizDebtMain {

    /**
     * 债项方案id
     */

    private String debtCode;
    /**
     * 项目名称
     */

    private String projectName;
    /**
     * 柜员id
     */

    private Long bankTellerId;
    /**
     * 流程发起时间
     */

    private Date processInitiatTime;
    /**
     * 效期循环规则
     */

    private Long validityCcycleGauge;
    /**
     * 方案生效日期
     */

    private Date pgEffectivDate;
    /**
     * 方案失效日期
     */

    private Date pgExpiDate;
    /**
     * 方案循环标志
     */

    private Long ls;
    /**
     * 产品规则
     */

    private Long ruleType;
    /**
     * 可办理笔数限制
     */

    private Long ltnopa;
    /**
     * 可办理笔数
     */

    private Long tdwln;
    /**
     * 方案主币种
     */

    private String mpc;
    /**
     * 方案金额
     */

    private BigDecimal solutionAmount;
    /**
     * 方案辅助币种(0无1其他可选币种2等值其他币种)
     */

    private String aCurrrency;
    /**
     * 其他可选币种
     */

    private String oc;
    /**
     * 方案业务期限范围
     */

    private Long dopo;
    /**
     * 方案费率类型
     */

    private Long progRateType;
    /**
     * 方案费率形式
     */

    private Long schemeRateForm;
    /**
     * 方案费率范围最低值
     */

    private Long rateRangeMix;
    /**
     * 方案费率范围最高值
     */

    private Long rateRangeMax;
    /**
     * 方案费率
     */

    private Long packageRate;
    /**
     * 是否经审批
     */

    private Long approve;
    /**
     * 费率审批机构
     */

    private Long rateApprovalOrg;
    /**
     * 是否存在方案费率折扣
     */

    private Long whetherRateDiscount;
    /**
     * 方案费率折扣
     */

    private Long programRateDiscount;
    /**
     * 利率规则描述
     */

    private String descriptionRateRules;
    /**
     * 交易背景概况
     */

    private String brifBackground;
    /**
     * 交易背景
     */

    private String tradBackground;
    /**
     * 业务背景简述
     */

    private String businessBackgroundBrief;
    /**
     * 货物/服务情况简述
     */

    private String goodsSketch;
    /**
     * 政策性属性描述
     */

    private String policyDescription;
    /**
     * 是否是政策性
     */
    private String policy;
    /**
     * 申请人
     */

    private String proposer;
    /**
     * 申请人客户号
     */

    private String proposerNum;
    /**
     * 是否单笔单批
     */

    private Long singleBtch;
    /**
     * 经办机构编码
     */

    private String institutionCode;

    /**
     * 说明：追加方案状态
     * 作者：陈志明
     * 日期：2018/7/12
     * 1、系统根据该债项方案的审批状态，自动显示；
     * 2、方案状态：可发放/过期。状态类型，参见方案状态及方案审核状态
     * 3、灰显，不可修改
     */

    private Integer solutionState;

    @Column(name = "DEBT_CODE", unique = true, nullable = false)
    public String getDebtCode() {
        return debtCode;
    }

    public void setDebtCode(String debtCode) {
        this.debtCode = debtCode;
    }

    @Column(name = "PROJECT_NAME")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Column(name = "BANK_TELL_ID")
    public Long getBankTellerId() {
        return bankTellerId;
    }

    public void setBankTellerId(Long bankTellerId) {
        this.bankTellerId = bankTellerId;
    }

    @Column(name = "WF_TIME")
    public Date getProcessInitiatTime() {
        return processInitiatTime;
    }

    public void setProcessInitiatTime(Date processInitiatTime) {
        this.processInitiatTime = processInitiatTime;
    }

    @Column(name = "VALIDITY_CYCLE_GAUGE")
    public Long getValidityCcycleGauge() {
        return validityCcycleGauge;
    }

    public void setValidityCcycleGauge(Long validityCcycleGauge) {
        this.validityCcycleGauge = validityCcycleGauge;
    }

    @Column(name = "PG_EFFECTIVE_DATE")
    public Date getPgEffectivDate() {
        return pgEffectivDate;
    }

    public void setPgEffectivDate(Date pgEffectivDate) {
        this.pgEffectivDate = pgEffectivDate;
    }

    @Column(name = "PG_EXPI_DATE")
    public Date getPgExpiDate() {
        return pgExpiDate;
    }

    public void setPgExpiDate(Date pgExpiDate) {
        this.pgExpiDate = pgExpiDate;
    }

    @Column(name = "LOOP_FLAG")
    public Long getLs() {
        return ls;
    }

    public void setLs(Long ls) {
        this.ls = ls;
    }

    @Column(name = "RULE_TYPE")
    public Long getRuleType() {
        return ruleType;
    }

    public void setRuleType(Long ruleType) {
        this.ruleType = ruleType;
    }

    @Column(name = "LTNOPA")
    public Long getLtnopa() {
        return ltnopa;
    }

    public void setLtnopa(Long ltnopa) {
        this.ltnopa = ltnopa;
    }

    @Column(name = "TDWLN")
    public Long getTdwln() {
        return tdwln;
    }

    public void setTdwln(Long tdwln) {
        this.tdwln = tdwln;
    }

    @Column(name = "M_CURRENCY")
    public String getMpc() {
        return mpc;
    }

    public void setMpc(String mpc) {
        this.mpc = mpc;
    }

    @Column(name = "SOLUTION_AMT")
    public BigDecimal getSolutionAmount() {
        return solutionAmount;
    }

    public void setSolutionAmount(BigDecimal solutionAmount) {
        this.solutionAmount = solutionAmount;
    }

    @Column(name = "A_CURRENCY")
    public String getaCurrrency() {
        return aCurrrency;
    }

    public void setaCurrrency(String aCurrrency) {
        this.aCurrrency = aCurrrency;
    }

    @Column(name = "O_CURRENCY")
    public String getOc() {
        return oc;
    }

    public void setOc(String oc) {
        this.oc = oc;
    }

    @Column(name = "SCOPE_BUSIN_PERIOD")
    public Long getDopo() {
        return dopo;
    }

    public void setDopo(Long dopo) {
        this.dopo = dopo;
    }

    @Column(name = "PROG_RATE_TYPE")
    public Long getProgRateType() {
        return progRateType;
    }

    public void setProgRateType(Long progRateType) {
        this.progRateType = progRateType;
    }

    @Column(name = "SCHEME_RATE_FORM")
    public Long getSchemeRateForm() {
        return schemeRateForm;
    }

    public void setSchemeRateForm(Long schemeRateForm) {
        this.schemeRateForm = schemeRateForm;
    }

    @Column(name = "RATE_RANGE_MIX")
    public Long getRateRangeMix() {
        return rateRangeMix;
    }

    public void setRateRangeMix(Long rateRangeMix) {
        this.rateRangeMix = rateRangeMix;
    }

    @Column(name = "RATE_RANGE_MAX")
    public Long getRateRangeMax() {
        return rateRangeMax;
    }

    public void setRateRangeMax(Long rateRangeMax) {
        this.rateRangeMax = rateRangeMax;
    }

    @Column(name = "PACKAGE_RATE")
    public Long getPackageRate() {
        return packageRate;
    }

    public void setPackageRate(Long packageRate) {
        this.packageRate = packageRate;
    }

    @Column(name = "APPROVE")
    public Long getApprove() {
        return approve;
    }

    public void setApprove(Long approve) {
        this.approve = approve;
    }

    @Column(name = "RATE_APPROVAL_ORG")
    public Long getRateApprovalOrg() {
        return rateApprovalOrg;
    }

    public void setRateApprovalOrg(Long rateApprovalOrg) {
        this.rateApprovalOrg = rateApprovalOrg;
    }

    @Column(name = "WHETHER_RATE_DISCOUNT")
    public Long getWhetherRateDiscount() {
        return whetherRateDiscount;
    }

    public void setWhetherRateDiscount(Long whetherRateDiscount) {
        this.whetherRateDiscount = whetherRateDiscount;
    }

    @Column(name = "PROGRAM_RATE_DISCOUNT")
    public Long getProgramRateDiscount() {
        return programRateDiscount;
    }

    public void setProgramRateDiscount(Long programRateDiscount) {
        this.programRateDiscount = programRateDiscount;
    }

    @Column(name = "DESCRIPTION_RATE_RULES")
    public String getDescriptionRateRules() {
        return descriptionRateRules;
    }

    public void setDescriptionRateRules(String descriptionRateRules) {
        this.descriptionRateRules = descriptionRateRules;
    }

    @Column(name = "BRIF_BACKGROUND")
    public String getBrifBackground() {
        return brifBackground;
    }

    public void setBrifBackground(String brifBackground) {
        this.brifBackground = brifBackground;
    }

    @Column(name = "TRAD_BACKGROUND")
    public String getTradBackground() {
        return tradBackground;
    }

    public void setTradBackground(String tradBackground) {
        this.tradBackground = tradBackground;
    }

    @Column(name = "BUSINESS_BACKGROUND_BRIEF")
    public String getBusinessBackgroundBrief() {
        return businessBackgroundBrief;
    }

    public void setBusinessBackgroundBrief(String businessBackgroundBrief) {
        this.businessBackgroundBrief = businessBackgroundBrief;
    }

    @Column(name = "GOODS_SKETCH")
    public String getGoodsSketch() {
        return goodsSketch;
    }

    public void setGoodsSketch(String goodsSketch) {
        this.goodsSketch = goodsSketch;
    }

    @Column(name = "POLICY_DESCRIPTION")
    public String getPolicyDescription() {
        return policyDescription;
    }

    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
    }

    @Column(name = "POLICY")
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @Column(name = "PROPOSER")
    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    @Column(name = "PROPOSER_NUM")
    public String getProposerNum() {
        return proposerNum;
    }

    public void setProposerNum(String proposerNum) {
        this.proposerNum = proposerNum;
    }

    @Column(name = "SINGLE_BATCH")
    public Long getSingleBtch() {
        return singleBtch;
    }

    public void setSingleBtch(Long singleBtch) {
        this.singleBtch = singleBtch;
    }

    @Column(name = "INSTITUTION_CODE")
    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    @Column(name = "SOLUTION_STATE")
    public Integer getSolutionState() {
        return solutionState;
    }

    public void setSolutionState(Integer solutionState) {
        this.solutionState = solutionState;
    }
}
