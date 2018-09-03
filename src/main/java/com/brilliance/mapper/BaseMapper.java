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
	/** 非分页使用 **/
	List<Long> selectIdPage(@Param("cm") Map<String, Object> params);
	/** 基于缓存id的分页使用 **/
	List<Long> selectIdPage(RowBounds rowBounds, @Param("cm") Map<String, Object> params);
	/** 基于结果集的分页使用 **/
	List<Map<String,Object>> selectResultPage(RowBounds rowBounds, @Param("cm") Map<String, Object> params);
	/** 批量插入数据，需要在自己的map.xml中实现 **/
	void insertBatch(List<T> records);

	T selectById(Long id);
}
