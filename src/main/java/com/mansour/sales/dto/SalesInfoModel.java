package com.mansour.sales.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class SalesInfoModel {
	public int seq; /*시퀀 */
	
	public String product; /*제품 이*/
	
	//public String sessionId; /* sessionId */
}
