/**
 *
 */
package com.brilliance.context;

import com.brilliance.util.PropertiesUtil;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Map;
import java.util.Properties;


/**
 *
 * @author ShenHuaJie
 * @version 2017年12月1日 上午10:48:48
 */
public class PropertyPlaceholder extends PropertyPlaceholderConfigurer {

    @Override
    protected void convertProperties(Properties props) {
        for(Map.Entry<Object,Object> entry:props.entrySet()){
            String stringKey = String.valueOf(entry.getKey());
            String stringValue = String.valueOf(entry.getValue());
            PropertiesUtil.getProperties().put(stringKey, stringValue);
        }
        super.convertProperties(props);
    }


}
