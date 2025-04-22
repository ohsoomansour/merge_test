package com.mansour.sales.repository;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mansour.sales.dto.SalesInfoModel;
import com.mansour.sales.mapper.SalesInfoMapper;

import lombok.RequiredArgsConstructor;

/**
 * @Description: 매퍼 호출 + 추가 로직작성 
 * */
@RequiredArgsConstructor
@Repository
public class SalesRepository {

	private final SalesInfoMapper salesInfoMapper;
	
	public SalesInfoModel selectSalesInfo( String p_seq, Map<String, String> keyword) {
		return salesInfoMapper.selectSalesInfo(p_seq, keyword);
	}
}
