package updatequery;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attempts = Integer.parseInt(sc.next());
		BigInteger sum=BigInteger.ZERO;
		for (int currentAttempt = 0; currentAttempt < attempts; currentAttempt++) {
			BigInteger num=sc.nextBigInteger();
			sum=sum.add(num);
		}
		System.out.println(sum.toString().substring(0, 10));
		sc.close();
	}
}