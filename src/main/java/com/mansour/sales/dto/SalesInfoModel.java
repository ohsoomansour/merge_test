package com.mansour.sales.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class SalesInfoModel {
	public int seq; /*시퀀 */
	public String pName; /*제품 이*/
}
