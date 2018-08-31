package com.hns.pojo;

/**
 * 债项
 */
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
