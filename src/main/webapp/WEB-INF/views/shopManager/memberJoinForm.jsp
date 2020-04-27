<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div { font-weight: bold; font-size:23px;}
	font {font-size:15px;}
</style>

</head>
<body>
<div align="center">
	<h1>회원가입</h1>
</div>
<div id="oBox"  align="center">
	<form id="frm" name="frm" action="memberJoinOk.do" method="post">
	<div id="cBox" align="center">
		<div>사업자등록번호 <font color="red">(필수)</font>
			<input type="text"  id="mRegister" name="mRegister" required placeholder="ex) 503-81-99597">
		</div>
		<div>사업자 ID <font color="red">(필수)</font>
			<input type="text"  id="mAdminId" name="mAdminId" required>
		</div>
		<div>비밀번호 <font color="red">(필수)</font>
			<input type="password"  id="mAdminPassword" name="mAdminPassword" required>
		</div>
		<div>비밀번호 확인<font color="red">(필수)</font>
			<input type="password"  id="mAdminPassword" name="mAdminPassword" required>
		</div>
		<div>상호명 <font color="red">(필수)</font>
			<input type="text"  id="mName" name="mName" required>
		</div>
		<div>대표자명 <font color="red">(필수)</font>
			<input type="text"  id="mCeo" name="mCeo" required>
		</div>
		<div>업태 <font color="red">(필수)</font>
			<input type="text"  id="mBusinessType" name="mBusinessType" required>
		</div>
		<div>종목 <font color="red">(필수)</font>
			<input type="text"  id="mBusinessCategory" name="mBusinessCategory" required>
		</div>
		<div>회사 주소 <font color="red">(필수)</font>
			<input type="text"  id="mAddress" name="mAddress" required>
		</div>
		<div>회사 연락처
			<input type="text"  id="mTel" name="mTel" >
		</div>
		<div>휴대폰 연락처
			<input type="text"  id="mCellphone" name="mCellphone" >
		</div>
		<div>회사 이메일주소 <font color="red">(필수)</font>
			<input type="email"  id="mEmail" name="mEmail" required>
		</div>
		<div><br /></div>
		<div>
			<button type="submit" id="btnSave" name="btnSave">등록</button>
			<button type="reset" id="btnReset" name="btnReset">초기화</button>
			<button type="button" id="btnHome" name="btnHome" onclick="location.href='/shop' ">홈</button>
		</div>
		</div>
	</form>
</div>
</body>
</html>