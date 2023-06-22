<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/guest/insertform.jsp</title>
</head>
<body>
	<div class="container">
		<h1>방명록 작성 폼</h1>
		<form action="${pageContext.request.contextPath }/guest/insert" method="post">
			<div>
				<label for="writer">작성자</label>
				<input type="text" name="writer" id="writer" autocomplete="off"/>
			</div>
			<div>
				<label for="content">내용</label>
				<textarea cols="50" rows="10" id="content" name="content" autocomplete="off"></textarea>
			</div>
			<div>
				<label for="pwd">비밀번호</label>
				<input type="password" name="pwd" id="pwd" autocomplete="off"/>
			</div>
			<button type="submit">작성</button>
		</form>
	</div>
</body>
</html>