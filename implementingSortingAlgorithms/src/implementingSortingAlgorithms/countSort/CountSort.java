package implementingSortingAlgorithms.countSort;

public class CountSort {
	public static void countSort(int[] nums) {
		int min=nums[0];
		int max=nums[0];
		for(int x:nums) {
			if(x>max)
				max=x;
			else if(x<min)
				min=x;
		}
		int[] freq=new int[max-min+1];
		for(int x:nums) {
			freq[x-min]++;
		}
		int index=0;
		for(int i=0;i<freq.length;i++) {
			int val=freq[i];
			while(val>0){
				nums[index++]=i+min;
				val--;
			}
		}
	}
	
	public static void printArray(int[] nums){
		for (int i = 0; i < nums.length; i++)
			System.out.print("'"+nums[i]+"'");
	}
	
	public static void main(String[] args) {
		int[] nums= {14,78,9,7,4,5,6,2,0,4,7,89,9};
		countSort(nums);
		printArray(nums);
	}

}
