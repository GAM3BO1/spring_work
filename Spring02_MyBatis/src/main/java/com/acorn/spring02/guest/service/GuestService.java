package com.acorn.spring02.guest.service;

import org.springframework.web.servlet.ModelAndView;

import com.acorn.spring02.guest.dto.GuestDto;

public interface GuestService {
	public void addGuest(GuestDto dto);
	public void updateGuest(GuestDto dto);
	public void deleteGuest(GuestDto dto);
	public void getGuestInfo(ModelAndView mv, int num);
	public void getGuestList(ModelAndView mv);
}
