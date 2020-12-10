package lambdastream;

import java.util.function.Function;

public class Ex06MethodReference {

	public static void main(String[] args) {
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

	}

}
