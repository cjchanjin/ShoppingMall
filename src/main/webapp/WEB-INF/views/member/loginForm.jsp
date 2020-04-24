<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<div class="wrapp" align="center">
	<div>
		<h1>로 그 인</h1><br />
	</div>
	<div>
		<form action="loginCheck.do" id="frm" method="post">
			아이디 : <input type="text" id="id" name="id"/><br/>
			패스워드 : <input type="password" id="pw" name="pw"/><br/>
			<input type="submit" value="로그인">
			<input type="button" value="홈가기" onclick="location.href='/'">
		</form>
	</div>
</div>
</body>
</html>