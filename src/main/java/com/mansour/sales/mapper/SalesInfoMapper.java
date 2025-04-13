package com.mansour.sales.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mansour.sales.dto.SalesInfoModel;

@Mapper
public interface SalesInfoMapper {

	SalesInfoModel selectSalesInfo(@Param("pSeq") int pSeq, @Param("pName") String pName);
}
