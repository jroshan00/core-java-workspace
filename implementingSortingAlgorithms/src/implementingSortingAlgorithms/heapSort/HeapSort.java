package implementingSortingAlgorithms.heapSort;

public class HeapSort {
	
	public static void heapSort(int[] a) {
		int n=a.length;
		
		for(int i=(n/2)-1;i>=0;i--){
			heapify(a, n,i);
		}
		for(int i=n-1;i>=0;i--) {
			swap(a,0,i);
			heapify(a, i, 0);
		}
	}
	public static void heapify(int[] a,int n,int i) {
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n && a[left]>a[largest]) {
			largest=left;
		}
		if(right<n && a[right]>a[largest]) {
			largest=right;
		}
		if(i!=largest) {
			swap(a,i,largest);
			heapify(a,n,largest);
		}
	}
	public static void swap(int[] a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String[] args) {
		int[] a= {15,7,5,6,54,112,565};
		
		System.out.println("Before sorting : ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("\n------------------------------");
		System.out.println("After sorting : ");
		heapSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
