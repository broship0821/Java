package register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//데이터베이스에 접근하는 객체
public class MemberDao {
	private static int seq = 0;
	private static HashMap<Integer, Member> db = 
			new HashMap<Integer, Member>();
	
	static {
		Member m1 = new Member(++seq,"ghdrlfehd1", "1234", "홍길동");
		db.put(seq, m1);
		Member m2 = new Member(++seq,"tester", "1234", "종이컵");
		db.put(seq, m2);
		Member m3 = new Member(++seq,"hacker", "1234", "핵커다");
		db.put(seq, m3);
	}
	
	//전체 목록을 가져오는 메서드
	List<Member> selectAll(){
		ArrayList<Member> ls = new ArrayList<Member>();
		Iterator<Integer> it = db.keySet().iterator();
		while(it.hasNext()) {
			ls.add(db.get(it.next()));
		}
		return ls;
	}
	
	//멤버 검색
	public Member selectMember(String id) {
		List<Member> ls = new ArrayList<Member>(db.values());
		for(Member tmp : ls) {
			if(tmp.getId().equals(id)){
				return tmp;
			}
		}
		return null;
	}
	
	//데이터베이스에 Member를 등록하는 메서드 작성
	public void insertMember(Member member) {
		member.setNumber(++seq);
		db.put(seq, member);
	}

	//데이터베이스에 Member정보를 수정하는 메서드 작성
	public void updateMember(int seq, Member member) {
		db.put(seq, member);
	}
	
	//데이터베이스에 Member정보를 삭제하는 메서드 작성
	public void deleteMember(int seq) {
		//seq번호에 해당되는 멤버 삭제
		db.remove(seq);
	}
}




