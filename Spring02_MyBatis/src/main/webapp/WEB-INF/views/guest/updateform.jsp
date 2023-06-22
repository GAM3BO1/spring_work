<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/guest/updateform.jsp</title>
</head>
<body>
	<div class="container">
		<h1>회원정보 수정 폼</h1>
		<form action="${pageContext.request.contextPath }/guest/update" method="post">
			<div>
				<label for="num">번호</label>
				<input type="text" name="num" value="${dto.num }" readonly/>
			</div>
			<div>
				<label for="writer">작성자</label>
				<input type="text" name="writer" id="writer" value="${dto.writer}" autocomplete="off"/>
			</div>
			<div>
				<label for="content">내용</label>
				<textarea cols="50" rows="10" id="content" name="content" autocomplete="off">${dto.content}</textarea>
			</div>
			<div>
				<label for="pwd">비밀번호</label>
				<input type="password" name="pwd" id="pwd" autocomplete="off"/>
			</div>
			<button type="submit">수정</button>
			<button type="reset">취소</button>
		</form>
	</div>
</body>
</html>