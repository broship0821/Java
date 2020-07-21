import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {

		//1. 배열 변수의 선언 
		int[] arr; //배열도 하나의 데이터 타입으로 보기때문에 데이터 타입 뒤에 [] 붙임
		int arr2[]; //c 스타일, 왠만하면 위에꺼 쓰기

		//2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성,
		arr = new int[5];
		
		//3. 배열의 초기화 - 배열 내부에 실제 값들을 저장
		//배열의 초기화는 인덱스를 통해 수행합니다.
		//인덱스란 배열 내부의 위치를 지정할 수 있는 값입니다.
		//인덱스는 0번부터 시작하여 1씩 순차적으로 증가
		
		arr[0] = 65; //int로 선언했기때문에 실수나 문자열 삽입 불가
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = 3;
		arr[4] = 100;
		//arr[5] = 77; 범위를 벗어나면 빨간줄 쳐지지 않음
		
		//4.배열의 총 크기 확인 -> 배열변수명.length
		System.out.println("arr배열의 길이: " + arr.length);
		
		//5.배열에 저장된 값을 참조(사용)하는 법.
		System.out.println("배열의 1번째 데이터: " + arr[0]);
		System.out.println("배열의 2번째 데이터: " + arr[1]);
		System.out.println("배열의 3번째 데이터: " + arr[2]);
		System.out.println("배열의 4번째 데이터: " + arr[3]);
		System.out.println("배열의 5번째 데이터: " + arr[4]);
		
		//6.배열의 반복문 처리
		//배열은 인덱스 번호를 제어변수로 활용하여 반복문을 쉽게 처리할 수 있음
		System.out.println("---------------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("배열의 %d번째 데이터: %d\n", i+1, arr[i]);
		}
		
		//7.배열 내부의 요소값을 문자열 형태로 한눈에 출력하기
		//System.out.println(arr); 이건 주소값 출력됨
		//Array.toString() 클래스 사용
		System.out.println(Arrays.toString(arr));
		//배열은 stack에 저장되는게 아니라 heap영역에 저장됨, 거기서 주소만 가져옴
		
		//8.배열의 선언과 생성을 동시에 하기
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		
		//배열은 자동으로 초기값 들어가 있음
		System.out.println("---------------------");
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		
		//9.배열의 생성과 동시에 초기화도 진행하는 방법
		char[] letters = new char[] {'A', 'B', 'C', 'D'};
		System.out.println(Arrays.toString(letters));
		
		//선언과 동시에 초기화 할때 딱 1번만 가능한 문법
		String[] names = {"홍길동", "고길동", "박길동"};
		System.out.println(Arrays.toString(names));
		
		//배열의 크기는 임의로 늘리거나 줄일 수 없음
//		names = {"홍길동", "고길동", "박길동", "이길동"}; //한번 선언하고 나서는 사용 불가
		names = new String[] {"홍길동", "고길동", "박길동", "이길동"}; //이렇게 새로 생성해 줘야됨
		
		
		
		
	}

}
