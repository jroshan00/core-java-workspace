package usingMapProgramSeries;

public class TwoSum {
	
	
	//Using Array
	public static int[] twoSum(int[] a,int target) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {};
	}
	
	//Using Collections
	
	
	public static void main(String[] args) {
		int[] array=new int[] {3,4,5,8,3};
		int[] result=twoSum(array,6);
		for(int x:result) {
			System.out.print(x+ " ");
		}
	}

}
