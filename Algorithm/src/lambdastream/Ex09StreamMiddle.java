package lambdastream;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex09StreamMiddle {

	public static void main(String[] args) {
		//skip(): 건너뛰기
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.skip(3).forEach(System.out::print);//앞에서 3개 건너뛰고 출력
		System.out.println();
		//distinct(): 중복제거, filter(): 조건에 맞는것만 남김, 두개 연달아쓰면 &&
		intStream = IntStream.of(1,1,2,2,3,3,4,4,5,5);
		intStream.distinct().forEach(System.out::print);
		System.out.println();
		intStream = IntStream.rangeClosed(1, 10);
		intStream.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::print);
		System.out.println();
		//sorted(): 정렬, 매개변수로 정렬기준 넣기 매개변수 없으면 스트림 요소의 기본정렬
		Stream<Student> studentStream = Stream.of(
					new Student("일자바",3,300),
					new Student("이자바",1,200),
					new Student("삼자바",2,100),
					new Student("사자바",2,150),
					new Student("오자바",1,200),
					new Student("육자바",3,290),
					new Student("칠자바",3,180)
				);
		//기본정렬
//		studentStream.sorted().forEach(System.out::print); 
		//기본정렬로 하지 말고 내가 준 반별정렬로 해라
//		studentStream.sorted(Comparator.comparing(Student::getBan)).forEach(System.out::print);
		//위에걸 람다식으로
		studentStream.sorted(Comparator.comparing((s)->s.getBan())).forEach(System.out::print);
		

	}

}

class Student implements Comparable<Student> {
	private String name;
	private int ban;
	private int total;
	
	public Student(String name, int ban, int total) {
		this.name = name;
		this.ban = ban;
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotal() {
		return total;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", total=" + total + "]\n";
	}

	@Override
	public int compareTo(Student o) {
		// 총점 내림차순 정령
		return o.getTotal() - this.getTotal();
	}
}
