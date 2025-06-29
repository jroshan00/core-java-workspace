package implementingSortingAlgorithms.selectionSort;

public class SelectionSort {
	
	public static void selectionSort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<nums.length;j++){
				if(nums[j]<nums[minIndex]) {
					minIndex=j;
				}
			}
			int temp=nums[i];
			nums[i]=nums[minIndex];
			nums[minIndex]=temp;
		}
	}
	
	public static void printArray(int[] nums){
		for (int i = 0; i < nums.length; i++)
			System.out.print("'"+nums[i]+"'");
	}
	
	public static void main(String[] args) {
		int[] nums= {14,78,9,7,4,5,6,2,0,4,7,89,9};
		selectionSort(nums);
		printArray(nums);
	}
}
