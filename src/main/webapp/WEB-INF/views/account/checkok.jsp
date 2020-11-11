<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    <%@page import="com.gabin.VO.Account"%>
<jsp:useBean id="daw" scope="request" class="com.gabin.VO.Account" />
<jsp:useBean id="loan" scope="request" class="com.gabin.VO.Account" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>deposit and withdrawal</title>
</head>
<body>
	<h1>입금 또는 출금을 할 수 있습니다.</h1>
	<h1>회원님의 잔액 : <%=daw.getAmount()%></h1>
	<h1>회원님의 남은대출가능금액 : <%=loan.getLoanamount()%></h1>
	<form action="deposit" method="post">
		<p>입금할 금액을 입력해주세요. ex) 10 : 10만원 </p>
		<input type="number" name="deposit">
		<input type="hidden" value="<%=daw.getFree_name()%>" name="free_name">
		<input type="hidden" value="<%=daw.getFree_password()%>" name="free_password">
		<input type="hidden" value="<%=daw.getFree_serial()%>" name="free_serial">
		<input type="hidden" value="<%=daw.getWithdrawal()%>" name="withdrawal">
		<input type="hidden" value="<%=daw.getAmount()%>" name="amount">
		<input type="hidden" value="<%=daw.getYn()%>" name="yn">
		<input type="submit" value="입금하기">
	</form>
	<form action="withdrawal" method="post">
		<p>출금할 금액을 입력해주세요. ex) 15 : 15만원 </p>
		<input type="number" name="withdrawal">
		<input type="submit" value="출금하기">
	</form>
	<form action="loanwithdrawal" method="post">
		<p>대출할 금액을 입력해주세요. ex) 1000 : 1000만원 </p>
		<input type="text" value="<%=loan.getFree_name()%>" name="free_name">
		<input type="text" value="<%=loan.getLoansum()%>" name="loansum">
		<input type="text" value="<%=loan.getLoanamount()%>" name="loanamount">
		<input type="number" name="loanwithdrawal">
		<input type="submit" value="대출하기">
	</form>
	<a href="/account/check">로그아웃</a>
</body>
</html>