package com.mansour.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RequestMapping("/member")
@Controller
public class LoginController {
	/**
	 *@SESSION의 이해: /login 경로에서 세션설정 시 -> JSESSIONID라는 쿠키를 서버로부터 받는다.
	 * 
	 * */
	
	@GetMapping("/login")
	public String loginActtion(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("userId", "osm");
		
		return "redirect:/member/get-session";
	}
	
	@GetMapping("/get-session")
	public String getSession(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String userName = (String)session.getAttribute("userId");
		System.out.println("세션에서 가져온 사용자: " + userName);
		return "index";
	}
}
