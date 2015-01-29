package updatequery;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class StringReplacer {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\mpuh_ipdr_update.txt")));
		PrintWriter writer = new PrintWriter("D:\\mpuhOutput.sql", "UTF-8");

		String data = "";

		while (true) {
			data = br.readLine();
			//System.out.println(data);
			if(data == null)
				break;
			if (data.length() == 95) {
				String date = data.substring(93, 93);
				char data1 = data.charAt(93);
				if (data != null) {
					if (data.contains("<xray>")) {
						data = data.replace("<xray>", data1+"");
						writer.println(data.substring(0, 88)+";");
					}
				}
			}else if (data.length() == 96) {
//				String xray = data.substring(92, 95);
				StringBuilder s=new StringBuilder();
				s.append(data.charAt(93));
				s.append(data.charAt(94));
				System.out.println(data+ " "+s.toString());
				if (data != null) {
					if (data.contains("<xray>")) {
						data = data.replace("<xray>", s.toString());
						writer.println(data.substring(0, 89)+";");
					}
				}
			}else if (data.length() == 98) {
				String date = "NULL";
				if (data != null) {
					if (data.contains("<xray>")) {
						data = data.replace("<xray>", date);
						writer.println(data.substring(0, 91)+";");
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