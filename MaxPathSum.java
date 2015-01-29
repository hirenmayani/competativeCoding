package updatequery;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPathSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attempts = Integer.parseInt(sc.next());
		int maxPathLength = 0;
		for (int currentAttempt = 0; currentAttempt < attempts; currentAttempt++) {
			int height = Integer.parseInt(sc.next());
			int[][] array = new int[height][height];
			for (int i = 0; i < height; i++) {
				for (int j = 0; j <= i; j++) {
					array[i][j] = sc.nextInt();
				}
			}
			for (int i = 1; i < height; i++) {
				for (int j = 0; j <= i; j++) {
					if (j == 0) {
						array[i][j] += array[i - 1][j];
					}
					else if( j == i  )
					{
						array[i][j] += array[i - 1][j-1];
					}
					else
					{
						array[i][j]+=Math.max(array[i-1][j], array[i-1][j-1]);
					}
				}
			}
			Arrays.sort(array[height-1]);
			maxPathLength=array[height-1][height-1];
			System.out.println(maxPathLength);
			maxPathLength = 0;
		}
		sc.close();
	}
}