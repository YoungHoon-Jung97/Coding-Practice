package programmers.Level2.최솟값만들기;

import java.util.Arrays;

//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12941
//분류 : 연습문제(정렬)
//풀이일 : 2025-05-12

//풀이 조건
//		① A 가장 큰수 부터 배치
//		② B 가장 작은수 부터 배치
//		③ A,B 배열 순서대로 곱해서 더하기

public class Solution {
	public int solution(int []A, int []B)
    {
        int answer = 0;
        
        int length = A.length;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
			answer += A[i]*B[length-1-i];
		}

        return answer;
    }
}
