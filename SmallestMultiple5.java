package updatequery;

import java.util.Scanner;

public class SmallestMultiple5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attempts = Integer.parseInt(sc.next());
		for (int currentAttempt = 0; currentAttempt < attempts; currentAttempt++) {
			int num = sc.nextInt();
			long ans=2;
			if(num==1)
				ans=1;
			for (int i = 2; i <= num; i++) {
				int temp1=2;
				if(ans%i == 0)
					continue;
				while(temp1<=i)
				{
					long tempans=ans*temp1;
					if(tempans%i == 0)
					{
						ans=tempans;
						break;
					}
					else
					{
						temp1++;
					}
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}