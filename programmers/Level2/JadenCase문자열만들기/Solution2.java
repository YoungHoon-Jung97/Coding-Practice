package programmers.Level2.JadenCase문자열만들기;

//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/12951
//분류:	연습문제
//풀이일: 2025-05-13

//풀이 조건
//		①첫번째 문자 찾기
//		②첫번째 문자만 대문자, 나머지 소문자 변환

public class Solution2 {

	public String solution(String s) {
		StringBuilder result = new StringBuilder();
		//①첫번째 문자 찾기
		boolean isFirst = true;
		
		//②첫번째 문자만 대문자, 나머지 소문자 변환
		for (char c : s.toCharArray()) {
			result.append(isFirst ? Character.toUpperCase(c) : Character.toLowerCase(c));
			
			//①첫번째 문자 찾기
			isFirst = (c == ' ');
		}
		
		return result.toString();

	}
}
