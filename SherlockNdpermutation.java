package updatequery;

import java.math.BigInteger;
import java.util.Scanner;

public class SherlockNdpermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attempts = Integer.parseInt(sc.next());
		for (int currentAttempt = 0; currentAttempt < attempts; currentAttempt++) {
			int zeros = sc.nextInt();
			int ones = sc.nextInt();
			
			BigInteger total_possible=fact(zeros+ones).divide((fact(zeros).multiply(fact(ones))));
			BigInteger startWithOne=total_possible.multiply(BigInteger.valueOf(ones)).divide((BigInteger.valueOf(ones).add(BigInteger.valueOf(ones))));
			
			BigInteger final_ans = startWithOne.mod(BigInteger.valueOf(1000000007));
			System.out.println(final_ans);
		}
		sc.close();
	}
	
	public static BigInteger fact(int num1)
	{
		Integer num= new Integer(num1);
		BigInteger ans=BigInteger.ONE;
		
		for(Integer i=1;i<=num;i++)
		{
			ans=ans.multiply(BigInteger.valueOf(i.intValue()));
		}
		return ans;
	}
}