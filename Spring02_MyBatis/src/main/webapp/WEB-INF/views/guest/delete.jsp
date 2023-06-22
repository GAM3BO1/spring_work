<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/guest/delete.jsp</title>
</head>
<body>
	<script>
		alert("${param.num}번 방명록이 삭제되었습니다.");
		
		//javascript를 이용해서 페이지 이동(redirect 이동)
		location.href="${pageContext.request.contextPath}/guest/list";
	</script>
</body>
</html>