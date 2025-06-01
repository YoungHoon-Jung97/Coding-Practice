package two_dimensional_array;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] array = new int[9][9];
		int n = 0,m = 0;
		int max = -1;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(array[i][j]>max) {
					max = array[i][j];
					n = i+1;
					m = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(n+" "+m);
	}

}
