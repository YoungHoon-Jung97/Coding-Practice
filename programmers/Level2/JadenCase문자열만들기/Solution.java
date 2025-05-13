package programmers.Level2.JadenCase문자열만들기;

import java.util.ArrayList;

//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/12951
//분류:	연습문제
//풀이일: 2025-05-13

//풀이 조건
// 		①문자열을 전부 소문자로 변경
//		②빈칸의 index번호 추출
//		③문자열(String)을 공백으로 문자열(String) 배열로 분리
//		④문자열(String) 배열의 문자열(String)을 문자(char) 배열로 분리
//		⑤문자(char)배열의 가장 첫 문자(char)을 대문자로 변경
//		⑥문자(char)을 다시 합치고 문자열(string)도 다시 합침
//		⑦index번호 위치에 다시 공백 삽입

public class Solution {

	public String solution(String s) {
		
		String result = "";
		//①문자열을 전부 소문자로 변경
		s = s.toLowerCase();
		
		char target = ' ';
		int count = 0; 
		int index = s.indexOf(target);
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		
		//②빈칸의 index번호 추출
		while(index != -1) {
			count ++;
			indexList.add(index);
			index = s.indexOf(target,index+1);
		}
		
		//③문자열(String)을 공백으로 문자열(String) 배열로 분리
		String[] strArry = s.split("\\s+");

		for (int i=0;i<strArry.length;i++) {
			String str =strArry[i];
			//④문자열(String) 배열의 문자열(String)을 문자(char) 배열로 분리
			char[] temp = str.toCharArray();
			//⑤문자(char)배열의 가장 첫 문자(char)을 대문자로 변경
			temp[0] = Character.toUpperCase(temp[0]);
			
			//⑥문자(char)을 다시 합치고 문자열(string)도 다시 합침
			str = new String(temp);
			result += str;

		}

		//⑦index번호 위치에 다시 공백 삽입
		for (Integer indexs : indexList) {
			result = result.substring(0, indexs) + " " + result.substring(indexs);
		}
		
		return result;
	}
}
