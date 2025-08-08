package implementingList.programSeries;

import java.util.List;

public class Problem1 {
	/*
	 * Write a java program to generate sequential sublist of a list having n elements.
	 * 
	 * for example :
	 * 
	 * Given list-> [1,2,3,4]
	 * 
	 * Output :
	 * 
	 * [1]
	 * [1, 2]
	 * [1, 2, 3]
	 * [1, 2, 3, 4]
	 * [2]
	 * [2, 3]
	 * [2, 3, 4]
	 * [3]
	 * [3, 4]
	 * [4]
	 * 
	 */
	public static void main(String[] args) {
		List<Integer> list= List.of(11,78,21);
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<=list.size();j++)
				System.out.println(list.subList(i, j));
		}
		
	}

}
