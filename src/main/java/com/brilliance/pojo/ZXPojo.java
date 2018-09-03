package com.brilliance.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 债项
 */

@Entity
@Table(name = "")
public class ZXPojo {

    String deptcode;
    String productname;

    public ZXPojo() {
    }

    public ZXPojo(String deptcode, String productname) {
        this.deptcode = deptcode;
        this.productname = productname;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    @Override
    public String toString() {
        return "ZXPojo{" +
                "deptcode='" + deptcode + '\'' +
                ", productname='" + productname + '\'' +
                '}';
    }
}
