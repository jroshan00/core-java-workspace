package implemetingCollectionFramework.assessmentPrograms;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Program13 {
	
	static Scanner sc=new Scanner(System.in);
	public static List<Integer> sequenceDigits(int low,int high){
		List<Integer> resultList=new ArrayList<>();
		for(int i=1;i<=9;i++) {
			int num=i;
			for(int j=i+1;j<=9;j++) {
				num=num*10+j;
				if(num>=low && num<=high) {
					resultList.add(num);
				}
			}
		}
		resultList.sort(Comparator.naturalOrder());
		return resultList;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the low value : ");
		int low=sc.nextInt();
		System.out.println("Enter the high value : ");
		int high=sc.nextInt();
		List<Integer> list=sequenceDigits(low, high);
		System.out.println(list);
	}

}
