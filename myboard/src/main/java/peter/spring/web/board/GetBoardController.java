package peter.spring.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import peter.spring.web.board.impl.BoardDAO;

@Controller
public class GetBoardController {
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 상세 보기 처리");
		mav.addObject("board", boardDAO.getBoard(vo));
		mav.setViewName("getBoard.jsp");
		return mav;
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("글 상세 보기 처리");
//		//1. 검색할 게시글 번호 추출
//		String seq = request.getParameter("seq");
//		//2. 데이터베이스 연동처리
//		BoardVO vo = new BoardVO();
//		vo.setSeq(Integer.parseInt(seq));
//		
//		BoardDAO boardDAO = new BoardDAO();
//		BoardVO board = boardDAO.getBoard(vo);
//		
//		//3. 응답화면 구현
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("board", board);
//		mav.setViewName("getBoard");
//		
//		return mav;
//	}

}
