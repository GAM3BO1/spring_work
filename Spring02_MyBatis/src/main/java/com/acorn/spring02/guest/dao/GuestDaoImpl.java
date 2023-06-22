package com.acorn.spring02.guest.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.spring02.guest.dto.GuestDto;

@Repository
public class GuestDaoImpl implements GuestDao{
	//mybatis 기반으로 DB 연동을 하기 위한 핵심 의존객체를 Dependency Injection 받는다
	@Autowired
	private SqlSession session;

	@Override
	public GuestDto getData(int num) {
		/*
		 *  Mapper의 namespace: guest
		 *  sql의 id: getData
		 *  parameterType: int
		 *  resultType: GuestDto
		 */
		return session.selectOne("guest.getData", num);
	}

	@Override
	public List<GuestDto> getList() {
		/*
		 *  Mapper의 namespace: guest
		 *  sql의 id: getList
		 *  parameterType: x
		 *  resultType: GuestDto
		 */
		return session.selectList("guest.getList");
	}

	@Override
	public void insert(GuestDto dto) {
		/*
		 *  Mapper의 namespace: guest
		 *  sql의 id: insert
		 *  parameterType: GuestDto
		 */
		session.insert("guest.insert", dto);
	}

	@Override
	public void update(GuestDto dto) {
		session.update("guest.update", dto);
	}

	@Override
	public void delete(GuestDto dto) {
		session.delete("guest.delete", dto);
	}

}
