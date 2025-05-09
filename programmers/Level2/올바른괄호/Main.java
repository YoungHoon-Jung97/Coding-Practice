package programmers.Level2.올바른괄호;

import java.util.Scanner;

//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/12909
//분류:	스택/큐
//풀이일: 2025-05-08

public class Main {

	public static void main(String[] args) {
		
		//변수 선언
		Scanner scanner = new Scanner(System.in);
		Solution solution = new Solution();
		String s = "";
		boolean answer;
		
		System.out.print("'(' 또는 ')' 이루어진 문자열을 입력하세요. : ");
		s = scanner.next();
		
		answer = solution.solution(s);
		
		//결과
		System.out.println("answer : "+ answer);
	}
}
