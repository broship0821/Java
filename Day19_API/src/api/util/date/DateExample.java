package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		/*
		 Date 클래스는 날짜를 표현하기 위해 사용하는 클래스입니다.
		 Date 클래스를 기본 생성자로 선언하면 컴퓨터의 현재 날짜를 읽어서
		  객체로 만들어 줌
		 
		 */
		Date date = new Date();
		System.out.println(date);
		
		//SimpleDateFormat 클래스는 날짜를 원하는 형식으로 표현하기 위한 클래스
		
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 E요일 입니다. 오늘은 1년 중 D번째 날입니다.");
		System.out.println(sdf.format(date));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
