package com.acorn.spring02.guest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.acorn.spring02.guest.dao.GuestDao;
import com.acorn.spring02.guest.dto.GuestDto;
import com.acorn.spring02.guest.service.GuestService;

@Controller
public class GuestController {
	//Controller는 비즈니스 로직을 대신 처리해주는 service에 의존한다
	@Autowired
	private GuestService service;
	
	@RequestMapping("/guest/list")
	public ModelAndView list(ModelAndView mv) {
		//서비스의 메소드를 호출해서 ModelAndView 객체의 참조값을 전달하면 방명록 목록이 담긴다
		service.getGuestList(mv);
		mv.setViewName("guest/list");
		
		/*
		 *  두 개의 정보가 모두 담긴 ModelAndView 객체를 리턴해주면
		 *  addObject(key, value)를 통해서 담은 정보는 request scope에 담기고
		 *  setViewName(view page 위치)를 통해서 담은 정보는 해당 view page로 forward 이동해서 응답된다
		 *  => 이 작업은 spring framework가 알아서 해준다
		 */
		return mv;
	}
	
	@RequestMapping("/guest/insertform")
	public String insertform() {
		return "guest/insertform";
	}
	
	@RequestMapping("/guest/insert")
	public String insert(GuestDto dto) {
		service.addGuest(dto);
		
		return "guest/insert";
	}
	
	@RequestMapping("/guest/updateform")
	public ModelAndView updateform(ModelAndView mv, int num) {
		//service를 이용해서 ModelAndView 객체에 글 하나의 정보를 담아온다
		service.getGuestInfo(mv, num);
		mv.setViewName("guest/updateform");
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/guest/update")
	public String update(GuestDto dto) {
		service.updateGuest(dto);
		
		return "guest/update";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/guest/delete")
	public String delete(GuestDto dto) {
		service.deleteGuest(dto);
		
		return "redirect:/guest/list";
	}
}
