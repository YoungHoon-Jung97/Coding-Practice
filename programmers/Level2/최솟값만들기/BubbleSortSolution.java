package programmers.Level2.�ּڰ������;

//���� : https://school.programmers.co.kr/learn/courses/30/lessons/12941
//�з� : ��������(����)
//Ǯ���� : 2025-05-12

//Ǯ�� ����
//		�� A ���� ū�� ���� ��ġ
//		�� B ���� ������ ���� ��ġ
//		�� A,B �迭 ������� ���ؼ� ���ϱ�

public class BubbleSortSolution {
	public int solution(int []A, int []B)
    {
        int answer = 0;
        int length = A.length;
  
        for (int i = 0; i < length-1; i++) {
			
        	for (int j = 0; j < length-i-1; j++) {
				
        		if (A[j]>A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
        		
        		if (B[j]<B[j+1]) {
					int temp = B[j];
					B[j] = B[j+1];
					B[j+1] = temp;
				}
			}
		}
        
        for (int i = 0; i < length; i++) {
			answer += A[i]*B[i];
		}

        return answer;
    }
}
