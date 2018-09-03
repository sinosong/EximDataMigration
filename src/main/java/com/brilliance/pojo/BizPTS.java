package com.brilliance.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import org.ibase4j.core.base.BaseModel;

/**
 * 功能：客户类型表
 *
 * @author czm
 * 日期：2018/7/6
 */
@TableName("BIZ_PTS")
public class BizPTS extends BaseModel {
    /**
     * 业务表名称（XXD）
     */
    @TableField("OBJTYP")
    private String objtyp;
    /**
     * 业务表INR(XXD的ID)
     */
    @TableField("OBJINR")
    private String objinr;
    /**
     * 角色种类
     */
    @TableField("ROL")
    private String role;
    /**
     * 关联客户信息表
     */
    @TableField("PTYINR")
    private String ptyinr;
    /**
     * 地址信息
     */
    @TableField("ADRBLK")
    private String adrblk;
    /**
     * 客户英文名称
     */
    @TableField("NAM")
    private String nameEn;
    /**
     * 交易编号和角色
     */
    @TableField("OWNREF")
    private String ownref;
    /**
     * 默认的角色等级
     */
    @TableField("DFTDSP")
    private String dftdsp;
    /**
     * 默认账户种类
     */
    @TableField("DFTACT")
    private String dftact;
    /**
     * 账号
     */
    @TableField("EXTACT")
    private String extact;
    /**
     * 版本号
     */
    @TableField("VER")
    private String ver;
    /**
     * 银行账号
     */
    @TableField("BANKNO")
    private String bankno;

    public String getObjtyp() {
        return objtyp;
    }

    public void setObjtyp(String objtyp) {
        this.objtyp = objtyp;
    }

    public String getObjinr() {
        return objinr;
    }

    public void setObjinr(String objinr) {
        this.objinr = objinr;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPtyinr() {
        return ptyinr;
    }

    public void setPtyinr(String ptyinr) {
        this.ptyinr = ptyinr;
    }

    public String getAdrblk() {
        return adrblk;
    }

    public void setAdrblk(String adrblk) {
        this.adrblk = adrblk;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getOwnref() {
        return ownref;
    }

    public void setOwnref(String ownref) {
        this.ownref = ownref;
    }

    public String getDftdsp() {
        return dftdsp;
    }

    public void setDftdsp(String dftdsp) {
        this.dftdsp = dftdsp;
    }

    public String getDftact() {
        return dftact;
    }

    public void setDftact(String dftact) {
        this.dftact = dftact;
    }

    public String getExtact() {
        return extact;
    }

    public void setExtact(String extact) {
        this.extact = extact;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((adrblk == null) ? 0 : adrblk.hashCode());
        result = prime * result + ((bankno == null) ? 0 : bankno.hashCode());
        result = prime * result + ((dftact == null) ? 0 : dftact.hashCode());
        result = prime * result + ((dftdsp == null) ? 0 : dftdsp.hashCode());
        result = prime * result + ((extact == null) ? 0 : extact.hashCode());
        result = prime * result + ((nameEn == null) ? 0 : nameEn.hashCode());
        result = prime * result + ((objinr == null) ? 0 : objinr.hashCode());
        result = prime * result + ((objtyp == null) ? 0 : objtyp.hashCode());
        result = prime * result + ((ownref == null) ? 0 : ownref.hashCode());
        result = prime * result + ((ptyinr == null) ? 0 : ptyinr.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((ver == null) ? 0 : ver.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BizPTS other = (BizPTS) obj;
        if (adrblk == null) {
            if (other.adrblk != null) {
                return false;
            }
        } else if (!adrblk.equals(other.adrblk)) {
            return false;
        }
        if (bankno == null) {
            if (other.bankno != null) {
                return false;
            }
        } else if (!bankno.equals(other.bankno)) {
            return false;
        }
        if (dftact == null) {
            if (other.dftact != null) {
                return false;
            }
        } else if (!dftact.equals(other.dftact)) {
            return false;
        }
        if (dftdsp == null) {
            if (other.dftdsp != null) {
                return false;
            }
        } else if (!dftdsp.equals(other.dftdsp)) {
            return false;
        }
        if (extact == null) {
            if (other.extact != null) {
                return false;
            }
        } else if (!extact.equals(other.extact)) {
            return false;
        }
        if (nameEn == null) {
            if (other.nameEn != null) {
                return false;
            }
        } else if (!nameEn.equals(other.nameEn)) {
            return false;
        }
        if (objinr == null) {
            if (other.objinr != null) {
                return false;
            }
        } else if (!objinr.equals(other.objinr)) {
            return false;
        }
        if (objtyp == null) {
            if (other.objtyp != null) {
                return false;
            }
        } else if (!objtyp.equals(other.objtyp)) {
            return false;
        }
        if (ownref == null) {
            if (other.ownref != null) {
                return false;
            }
        } else if (!ownref.equals(other.ownref)) {
            return false;
        }
        if (ptyinr == null) {
            if (other.ptyinr != null) {
                return false;
            }
        } else if (!ptyinr.equals(other.ptyinr)) {
            return false;
        }
        if (role == null) {
            if (other.role != null) {
                return false;
            }
        } else if (!role.equals(other.role)) {
            return false;
        }
        if (ver == null) {
            if (other.ver != null) {
                return false;
            }
        } else if (!ver.equals(other.ver)) {
            return false;
        }
        return true;
    }

}

