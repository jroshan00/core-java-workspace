package implementingSortingAlgorithms.quickSort;

public class QuickSort {
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int partition(int[] a, int low, int high) {
		int mid = low + (high - low) / 2;
		int pivot = a[mid];
		swap(a, mid, high);
		int i = low;
		for (int j = low; j < high; j++) {
			if (a[j] < pivot) {
				swap(a, i, j);
				i++;
			}
		}
		swap(a, i, high);
		return i;
	}

	public static void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int partitionPosition = partition(a, low, high);
			quickSort(a, low, partitionPosition - 1);
			quickSort(a, partitionPosition + 1, high);
		}

	}

	public static void main(String[] args) {
		int[] nums = { 10, 99, 1, 5, 7, 78 };
		quickSort(nums, 0, nums.length - 1);
		for (int x : nums) {
			System.out.print(x + " ");
		}
	}
}
