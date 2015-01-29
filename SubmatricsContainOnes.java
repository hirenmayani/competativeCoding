//remove comment
package updatequery;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubmatricsContainOnes {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		int attempts = Integer.parseInt(reader.readLine());
		for (int currentAttempt = 0; currentAttempt < attempts; currentAttempt++) {
			int arraySize= Integer.parseInt(reader.readLine());
			String line = reader.readLine();
			String[] strs = line.trim().split("\\s+");
			int[] array=new int[arraySize];
			
			for(int i=0;i<arraySize;i++)
			{
				array[i]=Integer.parseInt(strs[i]);
			}

		}
		reader.close();
	}
}