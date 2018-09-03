package com.brilliance.dao.impl;

import com.brilliance.dao.IBizCBERepository;
import com.brilliance.pojo.BizCBE;
import org.ibase4j.core.base.BaseProviderImpl;

public class BizCBERepository extends BaseProviderImpl<BizCBE> implements IBizCBERepository {


    @Override
    public BizCBE findCBE(BizCBE sel) {
        if(null != sel)
            return this.selectOne(sel);
        else
            return null;
    }


}
