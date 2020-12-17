package lambdastream;

import java.util.stream.Stream;

public class Ex08iterate_generate {

	public static void main(String[] args) {
		//람다식을 사용하여 스트림만들기(무한스트림)
		//iterate(): 이전요소를 seed로 해서 다음 요소를 계산한다
		Stream<Integer> intStream1 = Stream.iterate(0, n -> n+2);//(단항연산자 넣어야됨)
		intStream1.limit(10).forEach(System.out::println);//이것도 무한스트림이라 짤라줘야됨
		
		
		//generate()는 seed를 사용하지 않는다, 이전 요소랑 상관없음
		Stream<Integer> oneStream = Stream.generate(() -> 1);//(Supplier 주기만함)
		oneStream.limit(10).forEach(System.out::println);

	}

}
