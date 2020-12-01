package com.ddz.mapper;

import com.ddz.entity.TbOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface TbOrderMapper {

	public TbOrder getTbOrderById(@Param(value = "id") Long id)throws Exception;

	public List<TbOrder>	getTbOrderListByMap(Map<String,Object> param)throws Exception;

	public Integer getTbOrderCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertTbOrder(TbOrder tbOrder)throws Exception;

	public Integer updateTbOrder(TbOrder tbOrder)throws Exception;


}
