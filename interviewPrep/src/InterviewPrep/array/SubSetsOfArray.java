package InterviewPrep.array;

import java.util.ArrayList;
import java.util.List;

public class SubSetsOfArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> subSets = subSets(nums);
		for (List<Integer> set : subSets) {
			System.out.println(set);
		}
	}

	public static List<List<Integer>> subSets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		int n = nums.length;
		int noOfPossibleSubSets = 1 << n;

		// Loop through all possible subsets using bitmasking
		for (int i = 0; i < noOfPossibleSubSets; i++) {
			ArrayList<Integer> subset = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				// Check if j-th bit is set in i
				if ((i & (1 << j)) != 0) {
					subset.add(nums[j]);
				}
			}
			res.add(subset);
		}
		return res;
	}

}
