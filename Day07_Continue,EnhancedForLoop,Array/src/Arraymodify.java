import java.util.Arrays;
import java.util.Scanner;

public class Arraymodify {

	public static void main(String[] args) {

		String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));

		foods[2] = "짜장면";
		foods[0] = "탕수육";
		System.out.println(Arrays.toString(foods));
		
		//배열의 index번호 탐색
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요: ");
		String name = sc.next();
		//향상 for문은 인덱스번호를 알수 없음
//		for(String food : foods) {
//			if(food.equals(name)) {
//				food = "핫도그";
//			}
//		}
		
		
		
		//없는 음식 검색했을때 없는 음식입니다 라고 출력하기!!!!!!
		
		int flag = 0;
		
		for(int i=0;i<foods.length;i++) {
			if(foods[i].equals(name)) {
				System.out.println("탐색 완료!");
				System.out.println(name + "의 인덱스 번호: " + i + "번");
				break;
			}
			flag++;
		}
		
		if(flag == foods.length) {
			System.out.println("없는 음식입니다.");
		}
		
		
		//다른 방법------------------------------------------------------
		for(int i=0;i<foods.length;i++) {
			if(foods[i].equals(name)) {
				System.out.println("탐색 완료!");
				System.out.println(name + "의 인덱스 번호: " + i + "번");
				break;
			}else if(i == foods.length-1) {
				System.out.println("없는 음식입니다.");
			}
		}
		
		
		//다른 방법------------------------------------------------------
		int i;
		
		for(i=0;i<foods.length;i++) {
			if(foods[i].equals(name)) {
				System.out.println("탐색 완료!");
				System.out.println(name + "의 인덱스 번호: " + i + "번");
				break;
			}
		}
		
		if(i == foods.length) {
			System.out.println("없는 음식입니다.");
		}
		
		
		//다른 방법------------------------------------------------------
		boolean bool = true;
		
		for(i=0;i<foods.length;i++) {
			if(foods[i].equals(name)) {
				System.out.println("탐색 완료!");
				System.out.println(name + "의 인덱스 번호: " + i + "번");
				bool = false;
				break;
			}
		}
		
		if(bool) {
			System.out.println("없는 음식입니다.");
		}
		
	}

}
