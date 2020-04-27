package co.cjpark.shop.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import co.cjpark.shop.board.service.BoardService;
import co.cjpark.shop.board.service.BoardVo;
import co.cjpark.shop.common.Dao;

@Repository("boardDao")
public class BoardDao implements BoardService {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-dd");
	
//	@Autowired
//	private BoardVo boardVo;
	@Resource(name="boardVo")
	BoardVo boardVo;
	
	private final String SELECT_ALL="select * from board";
	private final String SELECT = "select * from board where boardid=?";
	private final String INSERT = "insert into board values (b_num.nextval, ?, ?, ?, ?, 0, ?)";
	private final String DELETE = "delete from board where boardid=?";
	
	public ArrayList<BoardVo> select() {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		try {
			conn = Dao.getConnection();
			psmt = conn.prepareStatement(SELECT_ALL);
			rs = psmt.executeQuery();
			while(rs.next()) {
				boardVo = new BoardVo();
				boardVo.setBoardId(rs.getInt("boardId"));
				boardVo.setWriter(rs.getString("writer"));
				boardVo.setTitle(rs.getString("title"));
				boardVo.setwDate(sf.format(rs.getDate("wDate")));
				boardVo.setHit(rs.getInt("hit"));
				boardVo.setFileName(rs.getString("fileName"));
				list.add(boardVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public BoardVo getSelect(int boardId) {
		BoardVo vo = new BoardVo();
		try {
			conn = Dao.getConnection();
			psmt = conn.prepareStatement(SELECT);
			psmt.setInt(1, boardId);
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setBoardId(rs.getInt("boardId"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setwDate(sf.format(rs.getDate("wDate")));	//Date ->String parse
				vo.setContents(rs.getString("contents"));
				vo.setHit(rs.getInt("hit"));
				vo.setFileName(rs.getString("fileName"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public int insert(BoardVo boardVo) {
		int n = 0;
		
		try {
			psmt = conn.prepareStatement(INSERT);
			psmt.setString(1, boardVo.getWriter());
			psmt.setString(2, boardVo.getwDate());
			psmt.setString(3, boardVo.getTitle());
			psmt.setString(4, boardVo.getContents());
			psmt.setString(5, boardVo.getFileName());
			n = psmt.executeUpdate();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int update(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int boardId) {
		int n = 0;
		try {
			psmt = conn.prepareStatement(DELETE);
			psmt.setInt(1, boardId);
			n = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n;
	}
}
