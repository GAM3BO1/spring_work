package com.acorn.step01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acorn.step01.member.MemberDto;

/*
 *  JSON 문자열 응답하는 방법
 *  
 *  1. pom.xml에 jackson-databind dependency를 추가한다
 *  2. Controller 메소드에 @ResponseBody 어노테이션을 붙여준다
 *  3. Dto, List, Map 등을 Controller에서 리턴해주면 해당 객체에 담긴 정보가 json으로 구성되어서 응답된다
 */

@Controller
public class TestController {
	@ResponseBody
	@RequestMapping("/test/json1")
	public String json1() {
		
		return "{\"num\": 1, \"name\": \"LEE\", \"addr\": \"suwon\"}";
	}
	
	@ResponseBody
	@RequestMapping("/test/json2")
	public MemberDto json2() {
		MemberDto dto = new MemberDto();
		dto.setNum(2);
		dto.setName("한량");
		dto.setAddr("화성시");
		
		return dto;
	}
	
	@ResponseBody
	@RequestMapping("/test/json3")
	public Map<String, Object> json3(){
		Map<String, Object> map = new HashMap<>();
		map.put("num", 3);
		map.put("name", "호영");
		map.put("addr", "그란디스");
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/test/json4")
	public List<String> json4(){
		List<String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("한량");
		names.add("호영");
		
		return names;
	}
	
	@ResponseBody
	@RequestMapping("/test/json5")
	public List<MemberDto> json5(){
		List<MemberDto> list = new ArrayList<>();
		list.add(new MemberDto(1, "홍길동", "수원시"));
		list.add(new MemberDto(2, "한량", "화성시"));
		list.add(new MemberDto(3, "호영", "시흥시"));
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/test/json6")
	public List<Map<String, Object>> json6(){		
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "홍길동");
		map1.put("addr", "수원시");
		
		Map<String, Object> map2 = new HashMap<>();
		map1.put("num", 2);
		map1.put("name", "한량");
		map1.put("addr", "화성시");
		
		Map<String, Object> map3 = new HashMap<>();
		map1.put("num", 3);
		map1.put("name", "호영");
		map1.put("addr", "시흥시");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		return list;
	}
	
}
