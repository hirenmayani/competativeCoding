package updatequery;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class SherlockandArray {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		int attempts = Integer.parseInt(reader.readLine());
		for (int currentAttempt = 0; currentAttempt < attempts; currentAttempt++) {
			int arraySize = Integer.parseInt(reader.readLine());
			String line = reader.readLine();
			String[] strs = line.trim().split("\\s+");
			int[] array = new int[arraySize];
			for (int i = 0; i < arraySize; i++) {
				array[i] = Integer.parseInt(strs[i]);
			}

			BigInteger ans = BigInteger.ZERO;
			for (int i = 0; i < arraySize; i++) {
				ans = fact(array[i]);
				System.out.print(ans.toString().length()+" ");
			}
			System.out.println();
		}
		reader.close();
	}

	public static BigInteger fact(int num1) {
		Integer num = new Integer(num1);
		BigInteger ans = BigInteger.ONE;

		for (Integer i = 1; i <= num; i++) {
			ans = ans.multiply(BigInteger.valueOf(i.intValue()));
		}
		return ans;
	}

}