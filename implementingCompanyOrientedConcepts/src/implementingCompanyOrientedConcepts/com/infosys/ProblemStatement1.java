package implementingCompanyOrientedConcepts.com.infosys;

import java.util.Scanner;

public class ProblemStatement1 {
	/*
	 * Problem Statement 1 :
	 * 
	 * Khaled has an array A of N elements. It is guaranteed that N is even. He
	 * wants to choose at most N/2 elements from array A. It is not necessary to
	 * choose consecutive elements. Khaled is interested in XOR of all the elements
	 * he chooses. Here, XOR denotes the bitwise XOR operation.
	 * 
	 * For example:
	 * 
	 * If A=[2,4,6,8], then khaled can choose the subset [2,4,8] to achieve XOR=(2
	 * XOR 4 XOR 8)=14.
	 * 
	 * Khaled wants to maximize the XOR of all the elements he chooses. Your task is
	 * to help khaled to find the max XOR of a subset that he can achieve by
	 * choosing at most N/2 elements?
	 * 
	 * Input format:
	 * 
	 * -> The first line contains an integer, N, denoting the number of elements in
	 * A. -> Each line i of the N subsequent lines(where 0<=i<=N) contains an
	 * integer describing A[i].
	 * 
	 * Constraints
	 * 
	 * -> 1<=N<=120 
	 * -> 1<=A[i]<=10^6
	 * 
	 * Sample Input 1
	 * 
	 * 2 
	 * 1 
	 * 2
	 * 
	 * Sample Output 1
	 * 
	 * 2
	 * 
	 * Explanation:
	 * 
	 * N=2, A=[1,2] khaled can choose the subset[2]. The XOR of the elements in the
	 * subset is 2. And the number of elements in the subset is 1 which is less than
	 * N/2.
	 * 
	 * Sample Input 2
	 * 
	 * 4 
	 * 1 
	 * 2 
	 * 4 
	 * 7
	 * 
	 * Sample Output 2
	 * 
	 * 7
	 * 
	 * Explanation:
	 * 
	 * N=4, A=[1,2,4,7] Khaled can choose the subset [7]. The xor of the elements in
	 * the subset is 7, and the n
	 */

	public static void main(String[] args) {
		final int N = 120, M = 1 << 20;
//		System.out.println(M);
//		System.out.println(Math.pow(2, 20));
		int dp[] = new int[M];
		char res[] = new char[M];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for (int i = 1; i < M; i++)
			dp[i] = Integer.MAX_VALUE;

		for (int i = 0; i < n; ++i) {
			if (arr[i] == 0)
				continue;
			for (int j = 0; j < M; ++j) {
				res[j] = 0;
//				System.out.println(res[j]);
			}
   
			for (int k = 0; k < M; ++k) {
				if (res[k] == 1)
					continue;
				if (dp[k] > dp[k ^ arr[i]])
					dp[k] = dp[k ^ arr[i]] + 1;

				else if (dp[k ^ arr[i]] > dp[k])
					dp[k ^ arr[i]] = dp[k] + 1;

				res[k ^ arr[i]] = 1; 
			}
		}

		int j = M - 1, k = (n >> 1);
//		System.out.println(dp[j]);
		while (dp[j] > k) {
			--j;
			//System.out.println(j);
		}
		System.out.println(j);
	}

}
