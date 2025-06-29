package implementingSortingAlgorithms.bubbleSort;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			int count=0;
			for(int j=0;j<nums.length-1-i;j++){
				if(nums[j]>nums[j+1]){
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					count++;
				}
			}
			if(count==0)
				break;
		}
		return nums;
	}
	
	public static void printArray(int[] nums){
		for (int i = 0; i < nums.length; i++)
			System.out.print("'"+nums[i]+"'");
	}
	
	public static void main(String[] args) {
		int nums[]= {81,20,10,44,50,68,79,89};
		nums=bubbleSort(nums);
		printArray(nums);
	}
}
