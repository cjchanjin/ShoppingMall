<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>	


</head>
<body>
<div align="center">
<div>
	<h1>자유 게시판</h1>
</div>
	<table border="1">
		<tr>
			<td>글번호</td>
			<td>${view.boardId }</td>
			<td>작성자</td>
			<td>${view.writer }</td>
			<td>작성일자</td>
			<td>${view.wDate }</td>
			<td>조회수</td>
			<td>${view.hit }</td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="7">${view.title }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="7" > ${view.contents }</td>
		</tr>
		<tr>
			<td>첨부파일</td>
			<td colspan="7">${view.fileName }</td>
		</tr>
	</table>
</div>
	<div align="center">
		<br />
		<button type="button" onclick="location.href='boardList.do' ">글목록</button>
		<button type="button" onclick="location.href='#' ">수정</button>
		<button type="button" onclick="boardDelete()">삭제</button>
		<button type="button" onclick="location.href='/shop' ">홈</button>
	</div>
	<div>
		<form id="frmDelete" name="frmDelete" action="boardDelete.do" method="post">
			<input type="hidden" name="boardId" value="${view.boardId }">
		</form>
	</div>
	
<script type="text/javascript">
	function boardDelete() {
		var form = document.getElementById("frmDelete");
		
		if(confirm("정말 삭제 하시겠습니까??") == true) {
			form.submit();
		} else{
			return;
		}
	}
	
</script>
	
</body>
</html>