package co.cjpark.shop.board.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("boardVo")		독립적으로 하는애들 ex 'calculator' 같은
//@Service("boardVo")		추천하는 방법(구체적으로 무엇을 해야하는 것들->서비스 객체)
public class BoardVo {
	private int boardId;
	private String writer;
	private String wDate;
	private String title;
	private String contents;
	private int hit;
	private String fileName;

	public BoardVo() {
		// TODO Auto-generated constructor stub
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getwDate() {
		return wDate;
	}

	public void setwDate(String wDate) {
		this.wDate = wDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
