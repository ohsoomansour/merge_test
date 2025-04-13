package com.mansour.sales.repository;

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
	
	public SalesInfoModel selectSalesInfo(int p_seq, String keyword) {
		return salesInfoMapper.selectSalesInfo(p_seq, keyword);
	}
}
