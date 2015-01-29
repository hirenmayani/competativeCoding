package updatequery;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyOfStringReplacer {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\5thjan.sql")));
		PrintWriter writer = new PrintWriter("D:\\output.sql", "UTF-8");

		String data = "";

		while (true) {
			data = br.readLine();
			System.out.println(data);
			if(data == null)
				break;
			if (data.length() == 95) {
				String date = data.substring(73, 94);
				if (data != null) {
					if (data.contains("<DATE>")) {
						data = data.replace("<DATE>", date);
						writer.println(data.substring(0, 88)+";");
					}
				}
			}else if (data.length() == 96) {
				String date = data.substring(74, 95);
				if (data != null) {
					if (data.contains("<DATE>")) {
						data = data.replace("<DATE>", date);
						writer.println(data.substring(0, 89)+";");
					}
				}
			}else if (data.length() == 79) {
				String date = "NULL";
				if (data != null) {
					if (data.contains("<DATE>")) {
						data = data.replace("<DATE>", date);
						writer.println(data.substring(0, 71)+";");
					}
				}
			}else if (data.length() == 78) {
				String date = "NULL";
				if (data != null) {
					if (data.contains("<DATE>")) {
						data = data.replace("<DATE>", date);
						writer.println(data.substring(0, 70)+";");
					}
				}
			}else if (data.length() == 77) {
				String date = "NULL";
				if (data != null) {
					if (data.contains("<DATE>")) {
						data = data.replace("<DATE>", date);
						writer.println(data.substring(0, 69)+";");
					}
				}
			}else if (data.length() == 76) {
				String date = "NULL";
				if (data != null) {
					if (data.contains("<DATE>")) {
						data = data.replace("<DATE>", date);
						writer.println(data.substring(0, 68)+";");
					}
				}
			}else if (data.length() == 75) {
				String date = "NULL";
				if (data != null) {
					if (data.contains("<DATE>")) {
						data = data.replace("<DATE>", date);
						writer.println(data.substring(0, 67)+";");
					}
				}
			} else {
				break;
			}
		}

		br.close();
		writer.close();
	}
}