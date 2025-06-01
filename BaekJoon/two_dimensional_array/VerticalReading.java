package two_dimensional_array;

import java.util.Scanner;

public class VerticalReading {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[][] words = new String[5][15];
		StringBuffer word = new StringBuffer();
		String result = "";
		
		for (int i = 0; i < 5; i++) {
			String str = scanner.nextLine();
			for (int j = 0; j < str.length(); j++) {
				words[i][j] =String.valueOf(str.charAt(j));
			}
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (words[j][i]!= null) {
					word.append(words[j][i]);
				}
			}
		}
		result = word.toString();
		System.out.print(result);
	}
}
