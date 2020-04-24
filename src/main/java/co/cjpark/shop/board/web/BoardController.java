package co.cjpark.shop.board.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.cjpark.shop.board.service.BoardService;
import co.cjpark.shop.board.service.BoardVo;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;		//서비스임플에서 지정한 이름을 사용 (어노테이션에 지정함)
	
	//전체 리스트 보기
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		list = boardService.select();
		model.addAttribute("board", list);
		
		return "board/boardList";
	}
	
	//게시글 하나 보기
	@RequestMapping("/boardGetList.do")
	public String boardList(@RequestParam("bid") String id,  Model model) {
		BoardVo vo = new BoardVo();
		int boardId = Integer.parseInt(id);
		vo = boardService.getSelect(boardId);
		model.addAttribute("vo", vo);
		
		return "board/boardContents";
	}
}
