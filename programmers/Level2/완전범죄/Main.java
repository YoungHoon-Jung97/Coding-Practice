package ¿ÏÀü¹üÁË;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] info = {{1,2},{2,3},{2,1}};
		Solution solution = new Solution();
		
		int result = solution.solution(info, 1, 7);
		
		System.out.println("result =" + result);
	}
}

