package programmers.Level2.올바른괄호;

import java.util.Iterator;

//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/12909
//분류:	스택/큐
//풀이일: 2025-05-08

//풀이 조건
//	①문자열의 갯수가 짝수여야 한다.
//	②'(' , ')' 갯수는 같아야 한다.
//	③무조선 '(' 부터 시작해야 한다.


public class Solution {
	
	boolean solution(String s) {
		
		//변수 선언
		boolean answer = true;
		String[] str = s.split("");
		int countOpen = 0;
		int countClose = 0;
		
		//[실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		//System.out.println("Hello Java");
		
		//①문자열의 갯수 짝수 확인
		if (str.length%2 != 0)
			answer = false;
		
		for (String string : str) {
			
			if (string.equals("(")){
				countOpen++;
				
			}else if (string.equals(")")){
				countClose++;
				
				//③'(' 부터 시작 확인
				if(countClose > countOpen) {
					answer = false;
					break;
				}
				
			}
			// "(" 또는 ")" 문자 확인
			else {
				answer = false;
				break;
			}
		}
		
		if(countOpen != countClose )
			answer = false;
		
		return answer;
	}
}
