package peter.spring.web.controller;

import java.util.HashMap;
import java.util.Map;

import peter.spring.web.user.LoginController;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		//나중에 이 부분에 명령어(path)와 컨트롤러 객체가 추가됨
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
