package register;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		//검색
		Member m = dao.selectMember("hong");
		System.out.println(m);
		
		//추가
		Member m4 = new Member(++dao.seq, "peter", "1234", "피터");
		dao.insertMember(m4);
		
		//바꿀 번호 입력
		int num = 2;
		Member m2 = new Member(num, "qwer", "1234", "QQ");
		dao.updateMember(num, m2);
		
		//삭제
		dao.deleteMember(3);
		
		System.out.println("-----------------------------------------------");
		
		List<Member> ret = dao.selectAll();
		for(Member tmp : ret) {
			System.out.println(tmp);
		}
		
		
		
		

	}

}
