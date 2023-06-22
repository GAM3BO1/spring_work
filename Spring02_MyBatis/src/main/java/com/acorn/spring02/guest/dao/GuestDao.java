package com.acorn.spring02.guest.dao;

import java.util.List;
import java.util.Map;

import com.acorn.spring02.guest.dto.GuestDto;

public interface GuestDao {
	public GuestDto getData(int num);
	public List<GuestDto> getList();
	public void insert(GuestDto dto);
	public void update(GuestDto dto); 
	public void delete(GuestDto dto); 
}
