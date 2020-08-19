package collection.list;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackQueue {
	
	static Queue que = new LinkedList();

	public static void main(String[] args) {

		Stack st = new Stack();
		Queue q = new LinkedList(); //큐는 인터페이스라 링크드리스트 클래스로 생성
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=== Stack ===");
		while(!st.empty()) { //스택이 빌 때까지
			System.out.println(st.pop()); //스택 요소 하나씩 꺼냄 LIFO
		}
		

		System.out.println("=== Queue ===");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //큐 요소 하나씩 꺼냄 FIFO
		}
		
		System.out.println("-----------------------------------------------");
		
		//Stack을 활용한 괄호 개수 맞는지 확인하는 프로그램
		
		Stack stack = new Stack();
		
		String expression = "((2+8)*7-2)"; //공식
		
		System.out.println("수식: " + expression);
		
		try {
			for(int i=0; i<expression.length();i++) {
				char ch = expression.charAt(i);
				
				if(ch=='(') {
					stack.push(ch);
				}
				else if(ch==')') {
					stack.pop();
				}
			}
			if(stack.empty()) {
				System.out.println("괄호가 맞게 설정되었습니다.");
			}
			else {
				System.out.println("괄호가 틀립니다.(여는 괄호 확인)");
			}
		}
		catch(EmptyStackException e) {
			System.out.println("괄호가 틀립니다.(닫는 괄호 확인)");
		}
		
		System.out.println("-----------------------------------------------");
		
		//Queue를 활용한 최근 명령어 확인 방법
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("help를 입력하면 도움말을 확인할 수 있습니다.");
		
		while(true) {
			System.out.print(">>>");
			String input = sc.nextLine().trim();
			
			if(input.equals("")) continue; //빈문자열은 다시 물어봄
			
			if(input.equalsIgnoreCase("help")) { //소대문자 상관없이 실행
				System.out.println("help: 도움말");
				System.out.println("q 또는 Q: 프로그램 종료");
				System.out.println("history: 최근 명령어 확인");
			}
			else if(input.equalsIgnoreCase("q")) {
				break;
			}
			else if(input.equalsIgnoreCase("history")) {
				save(input); //일단 명령어 저장
				
				//히스토리 출력
				LinkedList list = (LinkedList) que; //queue에는 메서드가 별로 없음
				final int SIZE = list.size();
				for(int i=0; i<SIZE;i++) { //여기서 크기는 변하지 않기 때문에 상수로 표현해주면 시스템 부하량 감소
					System.out.println((i+1) + ": " + list.get(i));
				}
			}
			else { //명령어 저장
				save(input);
				System.out.println(input);
			}
			
		}
		System.out.println("프로그램이 종료되었습니다");
		
	}

	private static void save(String input) {
		//queue에 저장하는 메서드
		que.offer(input);
		
		if(que.size() > 5) { //최대 5개 까지만 출력
			que.remove();
		}
		
	}

}
