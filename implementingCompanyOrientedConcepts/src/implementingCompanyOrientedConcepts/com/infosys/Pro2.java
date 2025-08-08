package implementingCompanyOrientedConcepts.com.infosys;

import java.util.*;
import java.util.Scanner;

public class Pro2 {
	static final int MAX_A = 100_005;
	static final int MOD = 1_000_000_7;

	// Updated method signature as requested
	public static int getAns(int N, List<Integer> A) {
		long[] freq = new long[MAX_A];
		long totalSum = 0;

		// Fill frequency array and compute total sum
		for (int i = 0; i < N; i++) {
			int num = A.get(i);
			freq[num]++;
			totalSum += num;
		}

		long maxDiff = Long.MIN_VALUE;
		int minG = -1;

		// Try every G from 2 to MAX_A
		for (int g = 2; g < MAX_A; g++) {
			long sumG = 0;
			for (int multiple = g; multiple < MAX_A; multiple += g) {
				sumG += freq[multiple] * multiple;
			}

			long diff = 2 * sumG - totalSum;

			if (diff > maxDiff) {
				maxDiff = diff;
				minG = g;
			} else if (diff == maxDiff && g < minG) {
				minG = g;
			}
		}

		long result = (maxDiff % MOD) * (minG % MOD) % MOD;
		return (int) result;
	}

	// Main method for input and testing
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}

		System.out.println(getAns(N, A));
	}

}
