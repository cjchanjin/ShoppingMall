package co.cjpark.shop.board.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.cjpark.shop.board.dao.BoardDao;
import co.cjpark.shop.board.service.BoardService;
import co.cjpark.shop.board.service.BoardVo;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;
	@Override
	public ArrayList<BoardVo> select() {
		return boardDao.select();
	}

	@Override
	public BoardVo getSelect(int boardId) {
		// TODO Auto-generated method stub
		return boardDao.getSelect(boardId);
	}

	@Override
	public int insert(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return boardDao.insert(boardVo);
	}

	@Override
	public int update(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return boardDao.update(boardVo);
	}

	@Override
	public int delete(int boardId) {
		// TODO Auto-generated method stub
		return boardDao.delete(boardId);
	}

}
