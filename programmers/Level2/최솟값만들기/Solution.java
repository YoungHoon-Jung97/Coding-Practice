package programmers.Level2.�ּڰ������;

import java.util.Arrays;

//���� : https://school.programmers.co.kr/learn/courses/30/lessons/12941
//�з� : ��������(����)
//Ǯ���� : 2025-05-12

//Ǯ�� ����
//		�� A ���� ū�� ���� ��ġ
//		�� B ���� ������ ���� ��ġ
//		�� A,B �迭 ������� ���ؼ� ���ϱ�

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
