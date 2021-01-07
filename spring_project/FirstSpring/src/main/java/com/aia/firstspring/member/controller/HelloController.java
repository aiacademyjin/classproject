package com.aia.firstspring.member.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	// 메소드는 ViewName 반환해야한다. 반환타입을 ModelAndView를 이용해서 반환
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/hello");  // /WEB-INF/view/member/hello.jsp -> member/hello
		mav.addObject("greeting", greeting());
		
		return mav;
	}

	private String greeting() {
		
		String result = "안녕하세요.";
		
		int nowTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(nowTime>=6 && nowTime<=10) {
			result = "좋은 아침입니다.";
		} else if(nowTime>=12 && nowTime<=15) {
			result = "점심 식사는 하셨나요?";
		} else if(nowTime>=18 && nowTime<=22) {
			result = "좋은 밤 되세요.";
		}
		
		return result;
	}
	
}
