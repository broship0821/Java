package exception.basic;

public class FinallyExample {

	public static void main(String[] args) {

		String[] pets = {"강아지", "고양이", "짹짹이"};
		
		
		for(int i=0;i<4;i++) {
			
			try {
				System.out.println(pets[i] + " 키우고 싶다~");
			}
			catch(Exception e) {
				System.out.println("애완동물 정보가 없습니다.");
			}
			finally { //오류가 나던 안나던 실행됨(scanner사용할때 sc.close()를 이곳에 자주 사용함, 사용 완료한 유틸리티들을 여기서 다 닫아줌)
				System.out.println("finally로 실행되는 문장");
				System.out.println("-----------------------");
			}
		}
		

	}

}
