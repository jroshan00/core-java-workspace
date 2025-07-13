package implementingSortingAlgorithms.mergeSort;

public class MergeSort {
	public static void divide(int[] nums, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			divide(nums, low, mid);
			divide(nums, (mid + 1), high);
			merge(nums, low, mid, high);
		}
	}

	public static void merge(int[] nums, int low, int mid, int high) {
		int[] merged = new int[high - low + 1];
		int index1 = low;
		int index2 = mid + 1;
		int mergeIndex = 0;
		while (index1 <= mid && index2 <= high) {
			if (nums[index1] < nums[index2]) {
				merged[mergeIndex++] = nums[index1++];
			} else {
				merged[mergeIndex++] = nums[index2++];
			}
		}
		while (index1 <= mid) {
			merged[mergeIndex++] = nums[index1++];
		}
		while (index2 <= high) {
			merged[mergeIndex++] = nums[index2++];
		}

		for (int i = low, j = 0; j < merged.length; j++, i++) {
			nums[i] = merged[j];
		}
	}

	public static void main(String[] args) {
		int[] nums = { 18, 20, 10, 8 };
		System.out.println("Before sorting : ");
		for (int x : nums) {
			System.out.print(x + " ");
		}
		System.out.println("\nAfter sorting :");
		divide(nums, 0, nums.length - 1);
		for (int x : nums) {
			System.out.print(x + " ");
		}
	}
}
