package com.mansour.sales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * @Date: 25.4.8
 * @updated: ##add developer1 branch + develop branch + main branch
 * */
@Slf4j
//@RequestMapping("/test")
@Controller
public class SalesInfoController {
	//
	@GetMapping("/list")
	public String getItemList() {
		
		return "index";
	}
	
	@GetMapping("/sales/info")
	public String getSalesInfo() {
		return "sales/info";
	}
}
