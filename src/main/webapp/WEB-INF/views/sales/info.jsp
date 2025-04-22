<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>영업</title>
	<!-- cdn 방법-->
	<script layout:fragment="script" type="text/javascript" src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>

<script type="text/javascript" >
	/**
	 * @Descript: 엘리먼트 태그가 다 로드 후 스크립트가 실행
	 * @이 경우는 전체 리스트 조회 쿼리 적합  form 형식 동적 추가는 corporateKeyLi api테스트1: sales_seq + p_categoryst.jsp 참고
	 * @ajax는 restcontroller 기능을 한다.
	 * 
	*/ 
	$(document).ready(function(){
		$('#sales_item_list').click(function() {
			let pseq = "1";
			let params = {
				keyword: '코트'
			};
			let queryStr = new URLSearchParams(params).toString(); // "keyword=코트"
			let url = `/api/sales/item/1/search?keyword=코트`;
			console.log("요청 URL ===>", url);
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
		});
		
		$("#mall_login").click(function(){
			window.location.href = "/member/login";
		})			
		
	})
</script>
	<button type="button" id="sales_item_list" >영업정보 조회</button>
	<button type="button" id="mall_login">LoginAction</button>
</body>
		


