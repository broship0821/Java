package peter.spring.web.controller;

import java.util.HashMap;
import java.util.Map;

import peter.spring.web.board.DeleteBoardController;
import peter.spring.web.board.GetBoardController;
import peter.spring.web.board.GetBoardListController;
import peter.spring.web.board.InsertBoardController;
import peter.spring.web.board.UpdateBoardController;
import peter.spring.web.user.LoginController;
import peter.spring.web.user.LogoutController;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
		//나중에 이 부분에 명령어(path)와 컨트롤러 객체가 추가됨
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
