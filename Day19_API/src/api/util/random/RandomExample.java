package api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		/*
		 Random 클래스는 난수를 얻어내기 위한 다양한 메서드를 제공하며
		 Math 클래스의 Random()메서드 보다 다양하고 쉽게 난수값을 얻도록 해줌
		 */

		Random r = new Random();
		
		//실수 난수값 발생: 0.0<= ~ <1.0
		double d = r.nextDouble();
		System.out.println("실수 랜덤값: " + d);
		
		//정수 난수값 발생
		int i = r.nextInt(); //int의 전체 범위로 난수를 리턴
		System.out.println(i);
		
		//0이상 6미만(0~5)
		i = r.nextInt(6);
		System.out.println(i);
		
		//10이상 101미만(10~100)
		i = r.nextInt(101-10) + 10;
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
