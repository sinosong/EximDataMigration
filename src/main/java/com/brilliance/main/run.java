package com.brilliance.main;

import com.brilliance.dao.IBizCBERepository;
import com.brilliance.dao.impl.BizCBERepository;
import com.brilliance.pojo.BizCBE;

//test
public class run {


    public static void main(String[] args) {

        IBizCBERepository cbedao = new BizCBERepository();
        BizCBE sel = new BizCBE();
        sel.setId(1L);
        System.out.println(cbedao.findCBE(sel).toString());


    }


}
