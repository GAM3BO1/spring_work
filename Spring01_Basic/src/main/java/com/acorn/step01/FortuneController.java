package com.acorn.step01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
	@RequestMapping("/fortune")
	public String fortune(HttpServletRequest request) {
		//오늘의 운세
		String fortuneToday = "06월 16일의 운세 총운은 “자수성가” 입니다.";
		//request scope에 응답에 필요한 데이터 담기
		request.setAttribute("fortuneToday", fortuneToday);
		
		// /WEB-INF/views/fortune.jsp 페이지로 forward 이동해서 응답하기
		return "fortune";
	}
	
	@RequestMapping("/fortune2")
	public ModelAndView fortune2() {
		//오늘의 운세(모델)
		String fortuneToday = "06월 16일의 운세 총운은 “자수성가” 입니다.";
		
		//HttpServletRequest 객체 대신에 ModelAndView 객체를 생성
		ModelAndView mView = new ModelAndView();
		//view page에 전달할 내용 담기
		mView.addObject("fortuneToday", fortuneToday);
		//view page의 위치 담기
		mView.setViewName("fortune");
		
		//모델과 view page 정보가 모두 담겨있는 ModelAndView 객체를 리턴해주면 똑같이 동작함
		return mView;
	}
	
	//ModelAndView를 매개변수로 선언하면 스프링 프레임워크가 알아서 객체 생성 후 참조값을 넣어줌
	@RequestMapping("/fortune3")
	public ModelAndView fortune3(ModelAndView mView) {
		//오늘의 운세(모델)
		String fortuneToday = "06월 16일의 운세 총운은 “자수성가” 입니다.";
		
		//view page에 전달할 내용 담기
		mView.addObject("fortuneToday", fortuneToday);
		//view page의 위치 담기
		mView.setViewName("fortune");
		
		//모델과 view page 정보가 모두 담겨있는 ModelAndView 객체를 리턴해주면 똑같이 동작함
		return mView;
	}
}
