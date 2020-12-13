package lambdastream;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex06MethodReference {

	public static void main(String[] args) {
		//클래스이름::메소드이름
		
		Function<String, Integer> f1 = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		Function<String, Integer> f2 = (s) -> Integer.parseInt(s);
		Function<String, Integer> f3 = Integer::parseInt;
		
		System.out.println(f1.apply("100")+100);
		System.out.println(f2.apply("100")+100);
		System.out.println(f3.apply("100")+100);
		
		System.out.println("----------------------");
		//Supplier는 입력X, 출력만
		Supplier<MyClass> s2 = () -> new MyClass();
		Supplier<MyClass> s3 = MyClass::new;
		MyClass mc = s2.get();
		System.out.println(mc);
		System.out.println(s3.get());
		
		//기본생성자는 Supplier로, 매개변수 있는 생성자는 Function써서 <1,2> 첫번째 값이 생성자 매개변수랑 같은 타입이여야함
		//<생성자에 매개변수로 들어갈값, 생성할 클래스>
		Function<Integer, MyClass> ff = (i) -> new MyClass(i);
		Function<Integer, MyClass> ff2 = MyClass::new;
		MyClass mc2 = ff.apply(100);
		System.out.println(mc2.iv);
		System.out.println(ff2.apply(100).iv);
		
		System.out.println("----------------------");
		//배열생성 Function<1,2> 해서 1에는 배열길이, 2는 데이터형식
		Function<Integer, int[]> arr = (i) -> new int[i];
		Function<Integer, int[]> arr2 = int[]::new;
		System.out.println(arr.apply(99).length);
		int[] intArr = arr2.apply(88);
		System.out.println(intArr.length);
		
		

	}

}

class MyClass {
	int iv;
	public MyClass() {
	}
	public MyClass(int iv) {
		this.iv = iv;
	}
}
