package implemetingCollectionFramework.assessmentPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program22 {
	/*
	 * Given an integer numRows, return the first numRows of Pascal's triangle. In
	 * Pascal's triangle, each number is the sum of the two numbers directly above
	 * it as shown:
	 * 
	 * Example 1: Input: numRows = 5 Output:
	 * [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
	 * 
	 * Example 2: Input: numRows = 1 Output: [[1]]
	 * 
	 * Constraints: 1 <= numRows <= 30
	 * 
	 */

	public static List<List<Integer>> generate(int numRows) {
		List<Integer> l=new ArrayList<>();
		List<List<Integer>> result=new ArrayList<>();
		
		if(numRows==1) {
			l.add(1);
			result.add(l);
			return result;
		}
		if(numRows==2) {
			l.add(1);
			l.add(1);
			result.clear();
			result.add(l);
			return result;
		}
		return null;
	}

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
			try {
				System.out.println("Enter the row value :");
			int numRows=sc.nextInt();
			System.out.println(generate(numRows));
			}
			finally{
				sc.close();
			}
		}
		

	}

}
