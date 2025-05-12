package programmers.Level2.최댓값과최솟값;

//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/12939
//분류:	연습문제
//풀이일: 2025-05-12

//풀이 조건
//		① 배열의 가장 처음 숫자로 비교를 시작

public class Solution {
	
	public String solution(String s) {
        String answer = "";
        String[] strNumArry ;
        int max ,min;
        
        //문자열 → 문자 배열
        strNumArry = s.split(" ");
        int[] numArry = new int[strNumArry.length];
        
        max = min = Integer.parseInt(strNumArry[0]);
        
        for (int i=0; i<strNumArry.length; i++) {
			numArry[i] = Integer.parseInt(strNumArry[i]);
			
			//최솟값 찾기
			if(numArry[i]<min) {
				min = numArry[i];
			}
			
			//최댓값 찾기
			if(numArry[i]>max) {
				max = numArry[i];
			}
			
		}
       
        answer = min+ " "+max; 
        
        return answer;
    }
}
