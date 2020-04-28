<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>회원목록</h1>
</div>
<div align="center">
	<c:forEach var="vo" items="${list }">
	=============================<br>
		사업자 등록번호 : ${vo.mRegister } <br>
		ID : ${vo.mAdminId } <br>
		회사명 : ${vo.mName }<br>
		대표자명 : ${vo.mCeo }<br>
		업태 : ${vo.mBusinessType } <br>
		종목 : ${vo.mBusinessCategory } <br>
		주소 : ${vo.mAddress }<br>
		연락처 : ${vo.mTel }<br>
		휴대폰 : ${vo.mCellphone }<br>
		이메일 : ${vo.mEmail }<br>
		권한 : ${vo.mAuthority }<br>
		사용자 수 : ${vo.mEmployeeNum }<br>
	=============================	<br>	
	</c:forEach>
	<div>
		<button type="button" id="btnHome" name="btnHome" onclick="location.href='/shop' ">홈</button>
	</div>
</div>
</body>
</html>