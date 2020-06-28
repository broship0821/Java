/*
 * package part2.ex3.데이터구조화;
 * 
 * import java.util.Scanner;
 * 
 * public class StructuredProgram{
 * 
 * 
 * public static void main(String[] args) {
 * 
 * 
 * //int[] koreans = new int[4]; // 만약 한과목만 다루지 않고 여러개의 과목을 다룬다면 그만큼 배열도 많아지고
 * 함수도 많아짐 // 그래서 이렇게 시험과목이라는 한 클래스(엔티티)에 다 모아둠 Exam exam = new Exam(); //
 * Exam이라는 클래스 생성 - 사용자가 원하는 데이터 구조를 정의하는 역활 // new Exam() - Exam exam은 Exam이라는
 * 클래스에서 exam이라는 변수를 생성한다는 뜻인데, 처음에는 무조건 null값을 참조하게 되었음, new Exam()을 통해서
 * Exam클래스를 실존하게 만들어줘야 해당 클래스를 참조해서 사용하게 되있음 exam.kor = 30; exam.eng = 40;
 * exam.math = 50;
 * 
 * // Exam이라는 클래스에서 빼다가 쓰기만 하면 됨
 * 
 * int menu; boolean keepLoop = true;
 * 
 * 
 * while(keepLoop) { menu = inputMenu(); switch(menu) { case 1:
 * inputKors(koreans); break; case 2: printKors(koreans); break; case 3:
 * System.out.println("Bye~~"); keepLoop = false; break;
 * 
 * default: System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
 * 
 * }
 * 
 * } }
 * 
 * static int inputMenu() {
 * 
 * Scanner scan = new Scanner(System.in);
 * 
 * System.out.println("┌───────────────┐");
 * System.out.println("│           메인 메뉴                   │");
 * System.out.println("└───────────────┘"); System.out.println("\t1. 성적입력 ");
 * System.out.println("\t2. 성적출력 "); System.out.println("\t3. 종료 ");
 * System.out.println("\t선택> "); int menu = scan.nextInt(); return menu; }
 * 
 * static void inputKors(int[] kors) {
 * 
 * Scanner scan = new Scanner(System.in); int kor; // 배열 남발하기 보단 이렇게 해서 정리하는게 더
 * 바람직함
 * 
 * System.out.println("┌───────────────┐");
 * System.out.println("│           성적  입력                  │");
 * System.out.println("└───────────────┘"); System.out.println();
 * 
 * for(int i=0; i<kors.length; i++) { do { System.out.printf("국어%d : ", i+1);
 * kor = scan.nextInt();
 * 
 * if(kor < 0 || 100 < kor) System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
 * 
 * }while(kor < 0 || 100 < kor); kors[i] = kor; }
 * System.out.println("─────────────────");
 * 
 * }
 * 
 * static void printKors(int[] kors) {
 * 
 * int total = 0; float avg; // i<3 으로 다 되있었는데 length로 하는게 한번에 바뀜 for(int i=0;
 * i<kors.length; i++) total += kors[i];
 * 
 * avg = (float)total / kors.length;
 * 
 * System.out.println("┌───────────────┐");
 * System.out.println("│           성적  출력                  │");
 * System.out.println("└───────────────┘"); System.out.println();
 * 
 * for(int i=0;i<kors.length;i++) System.out.printf("국어 %d : %3d\n", i+1,
 * kors[i]);
 * 
 * System.out.printf("총점 : %3d\n", total); System.out.printf("평균 : %6.2f\n",
 * avg); System.out.println("─────────────────");
 * 
 * }
 * 
 * 
 * }
 */