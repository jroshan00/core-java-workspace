package implementingSortingAlgorithms.insertionSort;

public class InsertionSort {
	
	public static void insertionSort(int[] nums) {
		for(int i=1;i<nums.length;i++) {
			int key=nums[i];
			int j=i-1;
			while(j>=0 && nums[j]>key){
				nums[j+1]=nums[j];
				j--;
			}
			nums[j+1]=key;
		}
	}
	
	public static void printArray(int[] nums){
		for (int i = 0; i < nums.length; i++)
			System.out.print("'"+nums[i]+"'");
	}
	
	public static void main(String[] args) {
		int[] nums= {14,78,9,7,4,5,6,2,0,4,7,89,9};
		insertionSort(nums);
		printArray(nums);
	}
	
}