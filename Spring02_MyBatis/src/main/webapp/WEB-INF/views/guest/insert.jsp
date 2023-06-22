<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/guest/insert.jsp</title>
</head>
<body>
	<script>
		alert("${param.writer}님이 작성한 방명록이 등록되었습니다.");
		
		//javascript를 이용해서 페이지 이동(redirect 이동)
		location.href="${pageContext.request.contextPath}/guest/list";
	</script>
</body>
</html>