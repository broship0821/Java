package api.lang.string;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		
		String s1 = "hello java";
		
		//charAt(index): 문자열의 특정 인덱스의 단일 문자를 리턴
		
		System.out.println(s1.charAt(2));
		
		//substring(index): 문자열의 특정 범위의 문자를 추출
		
		String s2 = s1.substring(6); //index 6번부터 끝까지 추출
		System.out.println(s2);
		
		//0~5번 미만까지 추출(끝값이 미만으로 처리됨)
		String s3 = s1.substring(0,5);
		System.out.println(s3);
		
		//length(): 문자열의 총 길이를 리턴
		System.out.println(s1.length());
		
		//indexOf(문자열): 특정 단어의 인덱스를 리턴.
		int idx = s1.indexOf("o");
		System.out.println(idx);
		
		idx = s1.indexOf("java");
		System.out.println(idx); //단어를 검색하면 시작점만 알려줌
		
		idx = s1.indexOf("k");
		System.out.println(idx); //없으면 -1 리턴
		
		//toLowerCase(), toUpperCase()
		String s4 = "Hello JAVA WoRlD";
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		
		//trim(): 문자열의 앞, 뒤 공백을 제거
		String name = "      peter          ";
		System.out.println(name.trim());
		
		//replace(old, new)
		//기본 문자열 내부의 old 문자값을 전부 찾아 new 문자열로 대체
		String java = "java, study java, program java, coffee, java";
		System.out.println(java.replace("java", "자바"));
		System.out.println(java.replace(",", ""));
		
		//split(구분문자열)
		//문자열을 구분문자열을 기준으로 분리하여 String[]로 리턴
		String pet = "멍멍이, 야옹이, 짹짹이";
		String[] pets = pet.split(", ");
		System.out.println(Arrays.toString(pets));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
