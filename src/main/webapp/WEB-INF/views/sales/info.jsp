<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>영업</title>
</head>
<body>여기는 영업 관
	
	<button type="button" class="sales_item_list" onclick="javascript:" >영업정보 조</button>
	<script layout:fragment="script" type="text/javascript" src="/lib/jquery-3.6.1.min.js">
		/**
		 * @Descript: 엘리먼트 태그가 다 로드 후 스크립트가 실행
		 * @이 경우는 전체 리스트 조회 쿼리 적합 
		*/
		$(document).ready(function(){
			
			
		})
		/* form 형식 동적 추가는 corporateKeyLi api테스트1: sales_seq + p_categoryst.jsp 참고
		 *
		*/ 
		$('#sales_item_list').click(function() {
			let params = {
				keyword: '코트'
			}
			let queryStr = new URLSearchParams(params).toString(); // "keyword=코트"
			let url = `/api/sales/item/${p_seq}/search?${queryStr}`;
			$.ajax({
			    type: "GET",
			    url: url,
				success: function(res){
					console.log("res ===>", res);
				},
				error: function(err){
					console.error(err);
				}				
					
			})
		})
		$('#').click(function(){
			
		})
		
	</script>
	
</body>
</html>