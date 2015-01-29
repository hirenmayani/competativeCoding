package updatequery;

import java.util.Scanner;

public class CopyOfMaxPathSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attempts = Integer.parseInt(sc.next());
		int maxPathLength = 0;
		for (int currentAttempt = 0; currentAttempt < attempts; currentAttempt++) {
			long num=sc.nextLong();

			long temp=num;
			int deleted=0;
			boolean inside=false;
			while(temp>8)
			{
				if( temp%8 == 0)
				{
					inside=true;
					break;
				}
				temp/=10;
				deleted++;
			}
			if(!inside)
				System.out.println("-1");
			else
				System.out.println(deleted);
		}
		sc.close();
	}
}