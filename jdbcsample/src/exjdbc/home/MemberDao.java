package exjdbc.home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;



public class MemberDao {
	private static int seq = 0;
	private static HashMap<Integer, Member> db = 
			new HashMap<Integer, Member>();
	
	
	
	//전체 목록을 가져오는 메서드
	List<Member> selectAll(){
		ArrayList<Member> ls = new ArrayList<Member>(); //이건 왜 ArrayList로 하고, 또왜 Iterator 써서 while문 썻을까
		Iterator<Integer> it = db.keySet().iterator();
		while(it.hasNext()) {
			ls.add(db.get(it.next()));
		}
		return ls;
	}
	
	//멤버 검색
	public Member selectMember(String id) {
		List<Member> ls = new ArrayList<Member>(db.values()); //이건 왜 List로 했을까, 또왜 향상for문 바로 썻을까
		for(Member tmp : ls) {
			if(tmp.getId().equals(id)){
				return tmp;
			}
		}
		return null;
	}
	
	//데이터베이스에 Member를 등록하는 메서드 작성
	public void insertMember(Member member) {
		member.setNum(++seq);
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
