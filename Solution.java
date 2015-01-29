package updatequery;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxD = sc.nextInt();
		sc.close();
		int[] maxVals = new int[maxD];
		for (int i = 2; i < maxD; i++) {
			int sqrt = (int) Math.sqrt(i);
			if (sqrt * sqrt != i) {
				maxVals[i] = findX(i);
			} 
		}
		int index=1,j = maxVals[1];
		for (int i = 1; i < maxD; i++) {
			if (maxVals[i] > j) {
				index = i;
				j=maxVals[i];
			}
		}
		System.out.println(index);
	}

	static int findX(int D) {
		int i = 2;
		int X = -1;
		boolean breaker =false;
		while (!breaker) {
			for (int j = 1; j < i; j++) {
				if ((i * i) - (D * j * j) == 1) {
					X = i;
					breaker=true;
					break;
				}
			}
			i++;
		}
		return X;

	}
}
