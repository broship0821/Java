package register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//데이터베이스에 접근하는 객체
public class MemberDao {

	//데이터베이스에 해당하는 역활
	static int seq = 0;
	private static HashMap<Integer, Member> db = new HashMap<>();

	static {
		Member m1 = new Member(++seq, "hong", "1234", "홍길동");
		db.put(seq, m1);
		Member m2 = new Member(++seq, "tester", "1234", "테스터");
		db.put(seq, m2);
		Member m3 = new Member(++seq, "hacker", "1234", "해커");
		db.put(seq, m3);
	}
	
	//전체 목록을 가져오는 메서드
	public List<Member> selectAll(){
		ArrayList<Member> ls = new ArrayList<>();
		Iterator<Integer> it = db.keySet().iterator();
		while(it.hasNext()) {
			ls.add(db.get(it.next()));
		}
		return ls;
	}
	
	//멤버 검색하는 메서드
	public Member selectMember(String id) {
		//id문자열과 같은 멤버를 찾아서 해당 맴버를 반환
		
		Member m = null;
		
		for(int i=0; i<db.size();i++) {
			m = db.get(i+1);
			if(m.getId().equals(id)) {
				break;
			}
			if(i==db.size()-1) {
				System.out.println("해당 ID가 없습니다.");
				m = null;
			}
		}
		
		return m;
	}
	
	//데이터베이스에 Member를 등록하는 메서드 작성
	public void insertMember(Member member) {
		db.put(member.getNumber(), member);
	}
	
	//데이터베이스에 Member정보를 수정하는 메서드 작성
	public void updateMember(int seq, Member member) {
		db.remove(seq); //동일한 key 집어넣으면 중복 불가이기에 값만 바뀜, 삭제할 필요 없음
		db.put(seq, member);
		
	}
	
	//데이터베이스에 Member정보를 삭제하는 메서드 작성
	public void deleteMember(int seq) {
		//seq번호에 해당되는 멤버 삭제
		db.remove(seq);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
