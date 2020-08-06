package api.lang.stringbuilder;

public class StrBuilderExample {

	public static void main(String[] args) {

		String str = "hello";
		System.out.println("str의 주소값: " + str.hashCode());
		
		str = "hello world";
		System.out.println("str의 주소값: " + str.hashCode());
		
		str = "hello!";
		System.out.println("str의 주소값: " + str.hashCode());
		//String은 문자열을 교체할때마다 기존 객체를 버리고 새로운 객체를 만들어서 참조함,
		//속도가 현저히 느려짐
		
		System.out.println("----------------------------");
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
		
		//문자열을 맨끝에 추가하는 메서드: append(문자열)
		sb.append(" world");
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
		
		//문자열을 특정 인덱스에 삽입하는 메서드: insert(인덱스, 삽입할 문자열)
		sb.insert(6, "my ");
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
		
		//특정 인덱스 범위의 문자열을 교체하는 메서드: replace(begin, end, 문자열) end는 미만으로 인식됨
		sb.replace(6, 8, "your");
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
		
		//문자열 내의 특정 단어를 삭제하는 메서드: delete(begin, end)
		sb.delete(6, 11);
		System.out.println(sb);
		System.out.println("sb의 주소값: " + sb.hashCode());
		
		
		
	}

}
