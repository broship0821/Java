package Hash;

import java.util.Collections;
import java.util.LinkedList;

public class Solution1 {
	
	
	public static String solution(String[] participant, String[] completion) {
		
		LinkedList<String> list  = new LinkedList<>();
//		for(int i=0; i<participant.length;i++) {
//			list.add(participant[i]);
//		}
		Collections.addAll(list, participant);
		
		for(int i=0;i<completion.length;i++) {
			int result = list.indexOf(completion[i]);
			list.remove(result);
		}
		String answer = list.get(0);
		return answer;
	}
	
	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		String result = solution(participant, completion);
		System.out.println(result);
		
	}
}
