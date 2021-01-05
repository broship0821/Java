package peter.spring.web.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import peter.spring.web.board.impl.BoardDAO;

@Controller
public class DeleteBoardController {
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 삭제 처리");
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("글 삭제 처리");
//		int seq = Integer.parseInt(request.getParameter("seq"));
//		BoardVO vo = new BoardVO();
//		vo.setSeq(seq);
//		BoardDAO dao = new BoardDAO();
//		dao.deleteBoard(vo);
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("redirect:getBoardList.do");
//		return mav;
//	}

}
