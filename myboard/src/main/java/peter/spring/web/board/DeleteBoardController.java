package peter.spring.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import peter.spring.web.board.impl.BoardDAO;
import peter.spring.web.controller.Controller;

public class DeleteBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 삭제 처리");
		int seq = Integer.parseInt(request.getParameter("seq"));
		BoardVO vo = new BoardVO();
		vo.setSeq(seq);
		BoardDAO dao = new BoardDAO();
		dao.deleteBoard(vo);
		return "getBoardList.do";
	}

}
