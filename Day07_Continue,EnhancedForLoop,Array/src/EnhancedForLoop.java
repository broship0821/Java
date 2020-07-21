
public class EnhancedForLoop {

	public static void main(String[] args) {

		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
		for(int i=0;i<week.length;i++) {
			System.out.printf("%s요일\n", week[i]);
		}
		System.out.println("-----------------------");
		
		//Enhanced for문, 전체 범위를 사용할 경우 향상된 for문 사용하는게 좋음, 단 전범위만 사용 가능
		for(String day : week) {// ":" 우항에는 반복할 배열 작성, 좌항에는 배열 데이터 타입 이랑 변수 작성
			System.out.printf("%s요일\n", day);
		}
		
		System.out.println("-----------------------");
		
		/*
		 1. scores라는 이름으로 int 배열을 하나 선언해서 점수 데이터를 바로 저장
		 {96, 88, 74, 63, 100, 55}
		 
		 2. 향상 for문(forEach)을 사용하여 총점과 평균을 구해보세요
		 총점(int), 평균(double, 소수점 둘째 자리까지 표현)
		 */
		
	int[] scores = {96, 88, 74, 63, 100, 55};
	int total = 0;
	double avg = 0.0;
	 
	for(int num : scores) {
		total += num;
	}
	avg = (double)total/scores.length;
	
	System.out.printf("총점: %d\n평균: %.2f\n", total, avg);
		
	}

}
