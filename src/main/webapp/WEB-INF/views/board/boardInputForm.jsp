<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardInputForm</title>
</head>
<body>
<div align="center">
<div>
	<h1>자유 게시판</h1>
</div>
	<form id="frm" name="frm" action="boardInput.do" method="post">
	<table border="1">
		<tr>
			<td>작성자</td>
			<td><input type="text" id="writer" name="writer" required></td>
			<td>작성일자</td>
			<td><input type="date" id="wDate" name="wDate" required></td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="3"><input type="text" id="title" name="title" required></td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="3"><input type="text" id="contents" name="contents" required></td>
		</tr>
		<tr>
			<td>첨부파일</td>
			<td colspan="3"><input type="file" id="fileName" name="fileName"></td>
		</tr>
	</table>
		<div align="center">
			<br />
			<button type="submit">등록</button>
			<button type="reset" >초기화</button>
			<button type="button" onclick="location.href='boardList.do' ">글목록</button>
			<button type="button" onclick="location.href='/shop' ">홈</button>
		</div>
	</form>
</div>

<script>
   //글 등록 재확인 
function checkInput() {
      if (confirm("확인버튼을 누르시면 저장이 완료 됩니다") == true){    //확인
         location.href="boardInput.do";
      }else{   //취소
          return;
      }
   }
</script>

</body>
</html>