<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>check.jsp</title>
</head>
<body>
	<h1>계좌를 불러오겠습니다. 이름과 비밀번호를 입력해주세요.</h1>
	<form action="check" method="post">
		<input type="text" name = "free_name">
		<input type="text" name = "free_password">
		<input type="submit" value="login">
	</form>
</body>
</html>