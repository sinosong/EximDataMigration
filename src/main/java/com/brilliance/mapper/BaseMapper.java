/**
 * 
 */
package com.brilliance.mapper;

import com.brilliance.entity.BaseModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author ShenHuaJie
 * 
 * @version 2016年6月3日 下午2:30:14
 * 
 */
public interface BaseMapper<T extends BaseModel> extends com.baomidou.mybatisplus.core.mapper.BaseMapper<T> {
}
