/*
 * package part2.ex3.�����ͱ���ȭ;
 * 
 * import java.util.Scanner;
 * 
 * public class StructuredProgram{
 * 
 * 
 * public static void main(String[] args) {
 * 
 * 
 * //int[] koreans = new int[4]; // ���� �Ѱ��� �ٷ��� �ʰ� �������� ������ �ٷ�ٸ� �׸�ŭ �迭�� ��������
 * �Լ��� ������ // �׷��� �̷��� ��������̶�� �� Ŭ����(��ƼƼ)�� �� ��Ƶ� Exam exam = new Exam(); //
 * Exam�̶�� Ŭ���� ���� - ����ڰ� ���ϴ� ������ ������ �����ϴ� ��Ȱ // new Exam() - Exam exam�� Exam�̶��
 * Ŭ�������� exam�̶�� ������ �����Ѵٴ� ���ε�, ó������ ������ null���� �����ϰ� �Ǿ���, new Exam()�� ���ؼ�
 * ExamŬ������ �����ϰ� �������� �ش� Ŭ������ �����ؼ� ����ϰ� ������ exam.kor = 30; exam.eng = 40;
 * exam.math = 50;
 * 
 * // Exam�̶�� Ŭ�������� ���ٰ� ���⸸ �ϸ� ��
 * 
 * int menu; boolean keepLoop = true;
 * 
 * 
 * while(keepLoop) { menu = inputMenu(); switch(menu) { case 1:
 * inputKors(koreans); break; case 2: printKors(koreans); break; case 3:
 * System.out.println("Bye~~"); keepLoop = false; break;
 * 
 * default: System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
 * 
 * }
 * 
 * } }
 * 
 * static int inputMenu() {
 * 
 * Scanner scan = new Scanner(System.in);
 * 
 * System.out.println("����������������������������������");
 * System.out.println("��           ���� �޴�                   ��");
 * System.out.println("����������������������������������"); System.out.println("\t1. �����Է� ");
 * System.out.println("\t2. ������� "); System.out.println("\t3. ���� ");
 * System.out.println("\t����> "); int menu = scan.nextInt(); return menu; }
 * 
 * static void inputKors(int[] kors) {
 * 
 * Scanner scan = new Scanner(System.in); int kor; // �迭 �����ϱ� ���� �̷��� �ؼ� �����ϴ°� ��
 * �ٶ�����
 * 
 * System.out.println("����������������������������������");
 * System.out.println("��           ����  �Է�                  ��");
 * System.out.println("����������������������������������"); System.out.println();
 * 
 * for(int i=0; i<kors.length; i++) { do { System.out.printf("����%d : ", i+1);
 * kor = scan.nextInt();
 * 
 * if(kor < 0 || 100 < kor) System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
 * 
 * }while(kor < 0 || 100 < kor); kors[i] = kor; }
 * System.out.println("����������������������������������");
 * 
 * }
 * 
 * static void printKors(int[] kors) {
 * 
 * int total = 0; float avg; // i<3 ���� �� ���־��µ� length�� �ϴ°� �ѹ��� �ٲ� for(int i=0;
 * i<kors.length; i++) total += kors[i];
 * 
 * avg = (float)total / kors.length;
 * 
 * System.out.println("����������������������������������");
 * System.out.println("��           ����  ���                  ��");
 * System.out.println("����������������������������������"); System.out.println();
 * 
 * for(int i=0;i<kors.length;i++) System.out.printf("���� %d : %3d\n", i+1,
 * kors[i]);
 * 
 * System.out.printf("���� : %3d\n", total); System.out.printf("��� : %6.2f\n",
 * avg); System.out.println("����������������������������������");
 * 
 * }
 * 
 * 
 * }
 */