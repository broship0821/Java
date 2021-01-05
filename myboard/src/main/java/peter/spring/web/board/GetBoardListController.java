package peter.spring.web.board;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import peter.spring.web.board.impl.BoardDAO;
@Controller
public class GetBoardListController {

	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 목록 검색 처리");
		//1. 사용자 입력 정보 추출: 검색 기능은 나중에 구현
		
		//2. 데이터 베이스 연동 처리
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		//3. 응답 화면 구성
		mav.addObject("boardList", boardList);
		mav.setViewName("getBoardList.jsp");
		return mav;
	}

}
