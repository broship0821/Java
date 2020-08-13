package register;

import java.util.List;

public class Main {
	static void printAll(MemberDao dao) {
		// 전체목록보기
		System.out.println("---------------");
		List<Member> ret = dao.selectAll();
		for (Member tmp : ret) {
			System.out.println(tmp);
		}
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		printAll(dao);
		//삽입하기
		Member member = 
				new Member(0, "test_id", "test_pw", "test_name");
		dao.insertMember(member);
		printAll(dao);
		
		//검색하기
		Member searchMember = dao.selectMember("tester");
		System.out.println(searchMember.getName());
		printAll(dao);
		
		//수정하기
		searchMember.setPw("4321");
		dao.updateMember(searchMember.getNumber(), searchMember);
		printAll(dao);
		
		//삭제하기
		dao.deleteMember(dao.selectMember("hacker").getNumber());
		printAll(dao);
		
		
		
	}
}
