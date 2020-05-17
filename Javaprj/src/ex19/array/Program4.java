package ex19.array;

public class Program4 {

	public static void main(String[] args) {
		int[] nums = {5,2,3,6,4,1};
		
		int temp;
		temp = nums[0];
		nums[0] = nums[5];
		nums[5] = temp;
		//int[] num = new int[1];
		//num[0] = nums[0];
		//nums[0] = nums[5];
		//nums[5] = num[0];
		
		for(int i=0;i<6;i++)
			System.out.print(nums[i]);
		
		
	}

}
