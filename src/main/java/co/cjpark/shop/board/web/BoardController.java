package co.cjpark.shop.board.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

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
		model.addAttribute("view", vo);
		
		return "board/boardContents";
	}
	
	//게시글 작성 폼
	@RequestMapping("/boardInputForm.do")
	public String boardInputForm() {
		return "board/boardInputForm";
				
	}
	
	//작성글 등록 하기
	@RequestMapping("/boardInput.do")
	public String boardInput(BoardVo boardVo, Model model) {
		System.out.println(boardVo.getWriter() + boardVo.getwDate() + boardVo.getTitle() + boardVo.getContents());
		int n = boardService.insert(boardVo);

		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String view;
		if(n != 0) {
			list = boardService.select();
			model.addAttribute("board", list);
			view = "board/boardList"; 
		} else {
			view=null;
		}
		
		return view;
	}
	
	//작성글 삭제
	@RequestMapping("/boardDelete.do")
	public String boardDelete(BoardVo boardVo, Model model) {
		int n = boardService.delete(boardVo.getBoardId());
		System.out.println(boardVo.getBoardId());
		
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		String view;
		if(n != 0) {
			list = boardService.select();
			model.addAttribute("board", list);
			view = "board/boardList"; 
		} else {
			view=null;
		}
		
		return view;
	}
	
}	