package InterviewPrep.array;

import java.util.ArrayList;
import java.util.List;

public class SubSetsOfArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> subSets1 = generateSubsetsUsingBitwiseOperator(nums);
		for (List<Integer> set : subSets1) {
			System.out.println(set);
		}
		System.out.println("=========================================");
		ArrayList<ArrayList<Integer>> subSets2=new ArrayList<>();
		generateSubsetsUsingBacktracking(nums,0,new ArrayList<>(),subSets2);
		for (List<Integer> set : subSets2) {
			System.out.println(set);
		}
	}

	/*
	 * Purpose : Generate subsets using bitmasking
	 * 
	 * Time Complexity : O(n*2^n) 
	 * Space Complexity : O(n·2^n) (for results) + O(1) recursion use
	 * 
	 * Use Case : Use bitmasking if you just need all subsets.
	 */
	public static List<List<Integer>> generateSubsetsUsingBitwiseOperator(int[] nums) {
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
	
	
	/*
	 * Generate subsets using recursion/backtracking
	 * 
	 * Time Complexity : O(n*2^n) 
	 * Space Complexity : O(n·2^n) + O(n) recursion stack
	 * 
	 * Use Case : Use backtracking if you want control (like subset size limits, pruning, conditions).
	 */
	public static void generateSubsetsUsingBacktracking(int[] nums, int index, ArrayList<Integer> current,
			ArrayList<ArrayList<Integer>> subsets) {
		if (index == nums.length) {
			subsets.add(new ArrayList<>(current));
			return;
		}

		// Including the index element
		current.add(nums[index]);
		generateSubsetsUsingBacktracking(nums, index + 1, current, subsets);

		// Excluding the index element
		current.remove(current.size() - 1);
		generateSubsetsUsingBacktracking(nums, index + 1, current, subsets);

	}

}
