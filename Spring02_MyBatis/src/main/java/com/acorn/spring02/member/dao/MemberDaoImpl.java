package com.acorn.spring02.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.spring02.member.dto.MemberDto;

//component scan 시 bean이 되기 위해 @Repository를 붙임
@Repository
public class MemberDaoImpl implements MemberDao{
	//MyBatis를 사용하기 위한 핵심 의존객체 주입받기
	@Autowired
	private SqlSession session;	//spring bean container에서 관리되는 SqlSessionTemplate 객체가 주입됨
	
	@Override
	public void insert(MemberDto dto) {
		session.insert("member.insert",	dto);
	}

	@Override
	public void update(MemberDto dto) {
		session.update("member.update", dto);
	}

	@Override
	public void delete(int num) {
		session.delete("member.delete", num);
	}

	@Override
	public MemberDto getData(int num) {		
		return session.selectOne("member.getData", num);
	}

	@Override
	public List<MemberDto> getList() {
		//select된 row 하나하나를 어떤 객체에 담을지 정해줘야 함		
		return session.selectList("member.getList");
	}
	
}
