package ex02.io.printstream;
public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		// 얘내들은 왜 초기화 안시켜줘도 되는거지??
		// - 메인 클래스 안에있는 맴버변수라서 자동으로 기본값으로 설정됨, 함수 안에 있는 지역변수만 초기화 시켜주면 됨
		total = kor1 + kor2 + kor3;
		avg = total / 3;

		// 성적 출력 부분----------------------------------
		System.out.print("┌────────────────────┐");
		System.out.print("│        성적 출력                 │");
		System.out.print("└────────────────────┘");
		System.out.print("국어1 : 0");
		System.out.print("국어2 : 0");
		System.out.print("국어3 : 0");
		System.out.print("총점 : 0");
		System.out.print("평균 : 0.00");
		System.out.print("──────────────────────");
	}
}