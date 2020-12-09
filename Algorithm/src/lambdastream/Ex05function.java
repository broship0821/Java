package lambdastream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex05function {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) list.add(i);
		
		//list의 모든 요소 출력
		list.forEach(i -> System.out.print(i + ",")); //consumer만 가능, 모든 요소에 consumer 실행
		System.out.println();
		
		//2,3의 배수 제거
		list.removeIf(x -> x%2==0 || x%3==0); //predicate만 가능, true나오면 제거
		System.out.println(list);
		
		list.replaceAll(i -> i*10); //모든 요소를 변환하여 대체
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		map.forEach((k,v) -> System.out.print("{"+k+","+v+"},"));
		//이러면 map 출력할때 이터레이터 필요 없음

	}

}
