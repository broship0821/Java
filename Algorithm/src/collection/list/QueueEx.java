package collection.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
	//최근 목록 보여주기
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //최근 5개까지 보여주기
	
	public static void main(String[] args) {
		System.out.println("help: 도움말");
		
		while(true) {
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			
			try {
				String input = sc.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println("help: 도움말");
					System.out.println("q, Q: 프로그램 종료");
					System.out.println("history: 최근 목록");
				} else if(input.equalsIgnoreCase("history")) {
					save(input);
					
					LinkedList list = (LinkedList)q;
					
					final int size = list.size();
					for(int i=0;i<size;i++)
						System.out.println((i+1) + ". " + list.get(i));
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("입력오류");
			}
		}
	}

	private static void save(String input) {
		if(!"".equals(input))
			q.offer(input);
		
		if(q.size()>MAX_SIZE)
			q.poll();
		
	}
}
