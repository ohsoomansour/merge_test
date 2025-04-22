package com.mansour.sales.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mansour.sales.dto.SalesInfoModel;
import com.mansour.sales.service.SalesService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/api/sales")
@RequiredArgsConstructor
public class SalesApiController {
	
	private final SalesService salesService;
	
	@GetMapping("/item/{pseq}/search")
	public SalesInfoModel getSalesInfo(
	    @PathVariable("pseq") String p_seq,
	    @RequestParam Map<String, String> keyword
			) {
		log.info("pseq={}, keyword={}", p_seq, keyword);
		
		return salesService.getSalesInfo(p_seq, keyword);
	}
	
}
