package com.mansour.sales.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mansour.sales.dto.SalesInfoModel;

@Mapper
public interface SalesInfoMapper {

	SalesInfoModel selectSalesInfo(@Param("pSeq") String pSeq, @Param("pName") Map<String, String> pName);
}
