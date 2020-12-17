package lambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex07makeStream {

	public static void main(String[] args) {
		//collection으로 스트림만들기
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream(); //list를 사용하여 새로운 스트림생성
		intStream.forEach(System.out::print);
//		intStream.forEach(System.out::print); //스트림은 일회용임, 두번째 사용시 에러남
		
		intStream = list.stream();
		intStream.forEach(System.out::print);//이렇게 한번 더 만들어줘야됨
		System.out.println();
		System.out.println("--------------------");
		
		//배열로 스트림만들기
		Stream<String> strStream1 = Stream.of("a", "b", "c", "d");
		Stream<String> strStream2 = Stream.of(new String[] {"a", "b", "c", "d"});
		Stream<String> strStream3 = Arrays.stream(new String[] {"a", "b", "c", "d"},0,2);
		strStream1.forEach(System.out::println);
		strStream2.forEach(System.out::println);
		strStream3.forEach(System.out::println);
		//기본형 stream
		int[] intArr = {1,2,3,4,5};
		IntStream intStream2 = Arrays.stream(intArr);
//		intStream2.forEach(System.out::print);
		//intStream 안쓰고 Stream<Integer> 쓰면 집어넣을떄 Integer[]을 집어넣어야됨
		Integer[] integerArr = {1,2,3,4,5};
		Stream<Integer> intStream3 = Arrays.stream(integerArr);
//		intStream3.forEach(System.out::print);
		System.out.println(intStream2.sum()); //기본형은 count이외에도 sum, avg등 함수 사용 가능
		System.out.println(intStream3.count());//객체형은 count만 사용 가능
		
		System.out.println("----------------------------------");
		//랜덤 스트림 만들기
		IntStream randomStream1 = new Random().ints(); //ints()는 무한스트림이기때문에 limit을 사용하거나 괄호안에 매개변수로 숫자쓰면됨
		randomStream1.limit(5).forEach(System.out::println);
		//길이 지정
		System.out.println("-----");
		IntStream randomStream2 = new Random().ints(5); 
		randomStream2.forEach(System.out::println);
		//범위 지정
		System.out.println("-----");
		IntStream randomStream3 = new Random().ints(5,10); //5~9사이의 난수 생성
		randomStream3.limit(5).forEach(System.out::println);
		//길이 및 범위 지정
		System.out.println("-----");
		IntStream randomStream4 = new Random().ints(5,5,10); //5~9사이의 난수 생성
		randomStream4.forEach(System.out::println);
		

	}

}
