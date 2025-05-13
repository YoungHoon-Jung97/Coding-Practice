package programmers.Level2.JadenCase문자열만들기;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/12951
//분류:	연습문제
//풀이일: 2025-05-13


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Solution solution = new Solution();
		
		
		System.out.print("문자열을 입력하세요: ");
		String s =bf.readLine();
	
		String result = solution.solution(s);
		
		System.out.println("result : " + result);
	}
}
