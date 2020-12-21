package lambdastream;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex10StreamMiddle2 {

	public static void main(String[] args) {
		//map(): 스트림의 요소 변환하기
		File[] fileArr = {
				new File("Ex1.java"),
				new File("Ex1.ppt"),
				new File("Ex1.txt"),
				new File("Ex2.java"),
				new File("Ex1"),
				new File("Ex1.exe")
		};
		Stream<File> fileStream = Stream.of(fileArr);
		//map() 으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> fileNameStream = fileStream.map(File::getName); //(f) -> f.getName()
		fileNameStream.forEach(System.out::println);//모든파일의 이름 출력
		
		fileStream = Stream.of(fileArr); //스트림 다시 생성
		fileStream.map(File::getName) //Stream<File> -> Stream<String>
		.filter(s->s.indexOf('.')!=-1) //확장자가 없는 것은 제외
		.map(s->s.substring(s.indexOf('.')+1)) //확장자(.오른쪽것들)만 추출
		.map(String::toUpperCase) //모두 대문자로 변환
		.distinct() //중복제거
		.forEach(System.out::println); //모든 확장자를 대문자로 출력
		System.out.println();
		System.out.println("---------------------");
		
		//peek(): 스트림의 요소를 소비하지 않고 엿보기
		//중간중간 작업 결과 확인(디버깅)
		fileStream = Stream.of(fileArr); //스트림 다시 생성
		fileStream.map(File::getName) //Stream<File> -> Stream<String>
		.filter(s->s.indexOf('.')!=-1) //확장자가 없는 것은 제외
		.peek(s->System.out.printf("filename=%s\n",s))
		.map(s->s.substring(s.indexOf('.')+1)) //확장자(.오른쪽것들)만 추출
		.peek(s->System.out.printf("확장자=%s\n",s))
		.map(String::toUpperCase) //모두 대문자로 변환
		.distinct() //중복제거
		.forEach(System.out::println); //모든 확장자를 대문자로 출력
		System.out.println();
		System.out.println("---------------------");
		
		//flatMap(): 스트림의 스트림을 스트림으로 변환
		//문자열 배열의 스트림을 하나의 문자열 스트림으로 변환
		Stream<String[]> strArrStrm = Stream.of(
					new String[] {"abc","def","jkl"},
					new String[] {"ABC","QWE","JKL"}
				);
		//map과flatMap 차이
//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
				"Believe or not It is true",
				"Do or do not There is no try"
		};
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line->Stream.of(line.split(" +")))
		.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);

	}

}
