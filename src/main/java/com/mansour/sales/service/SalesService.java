package com.mansour.sales.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.mansour.sales.dto.SalesInfoModel;
import com.mansour.sales.repository.SalesRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @Service :'접근 제어자' private 또는 public 을 붙이지 않아도 된다.
 *  스프링 빈으로 등록하고 접근 제어자와 무관하게게 동작
 * */

//@AllArgsConstructor
@RequiredArgsConstructor
@Service
public class SalesService {

	private final SalesRepository salesRepository;
	
	public SalesInfoModel getSalesInfo ( String p_seq, Map<String, String> keyword) {
		return salesRepository.selectSalesInfo(p_seq, keyword);
	}
}
