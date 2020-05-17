package ex19.array;

public class Program3 {

	public static void main(String[] args) {
		int[] nums = {5,2,3,6,4,1};
		int index = -1;
		
		for(int i=0;i<6;i++)
			if(nums[i]==1) {
				index = i;
				break;
			}
		System.out.print(index);
	}

}
