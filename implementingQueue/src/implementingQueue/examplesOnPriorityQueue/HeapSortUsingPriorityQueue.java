package implementingQueue.examplesOnPriorityQueue;

//import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapSortUsingPriorityQueue {
	public static void main(String[] args) {
		int[] nums= {15,7,8,9,85,56,5,6,5,55,66,56,5};
		//nums=Arrays.stream(nums).sorted().toArray();
		heapSort(nums);
		for (int num:nums) {
			System.out.print(num+" ");
		}
	}
	
	public static void heapSort(int[] nums) {
		Queue<Integer> queue=new PriorityQueue<>();
		for(int num:nums) {
			queue.offer(num);
		}
		int index=0;
		while(!queue.isEmpty()){
			if(index<nums.length) {
				nums[index++]=queue.remove();
			}
		}
	}
}
