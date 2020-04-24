package co.cjpark.shop.board.service;

import java.util.ArrayList;

public interface BoardService {
	public ArrayList<BoardVo> select();
	public BoardVo getSelect(int boardId);
	public int insert(BoardVo boardVo);
	public int update(BoardVo boardVo);
	public int delete(int boardId);
}
