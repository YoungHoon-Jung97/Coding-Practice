package programmers.Level2.최댓값과최솟값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/12939
//분류:	연습문제
//풀이일: 2025-05-12

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String strNums = "";
		Solution solution = new Solution();
		
		
		System.out.print("숫자을  나열하세요( 숫자는 공백 구분 ) : ");
		strNums = bf.readLine();
		
		solution.solution(strNums);
		
	}
}
