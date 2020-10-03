package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q07PhysExamSearch {
	
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return "PhyscData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
		}
		
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = {
				new PhyscData("홍길동1", 162, 1.3),
				new PhyscData("홍길동2", 168, 1.2),
				new PhyscData("홍길동3", 169, 1.1),
				new PhyscData("홍길동4", 171, 1.0),
				new PhyscData("홍길동5", 173, 0.8),
				new PhyscData("홍길동6", 174, 0.7),
				new PhyscData("홍길동7", 175, 0.3)
		};
		System.out.print("찾을 시력 입력: ");
		double vision = sc.nextDouble();
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);
		
		if(idx < 0)
			System.out.println("없습니다.");
		else {
			System.out.println(idx + "번째 인덱스에 있습니다");
			System.out.println("찾은 데이터: " + x[idx]);
		}

	}

}
