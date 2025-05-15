package programmers.Level2.�ּڰ������;

//���� : https://school.programmers.co.kr/learn/courses/30/lessons/12941
//�з� : ��������(����)
//Ǯ���� : 2025-05-12

//Ǯ�� ����
//		�� A ���� ū�� ���� ��ġ
//		�� B ���� ������ ���� ��ġ
//		�� A,B �迭 ������� ���ؼ� ���ϱ�

/*
��������
	-���� ���Ҹ� ���� ���ĵ� �κа� ���Ͽ� ������ ��ġ�� ����
	
	�ð� ���⵵ �м�
	
	�ּ�		O(n)
	��� 		O(n��)
	�־� 		O(n��)
	��ȯȽ��	O(n) ~ O(n��)
*/

public class InsertSortSolution {
	public int solution(int []A, int []B)
    {
        int answer = 0;
        int length = A.length;
  
        for (int i = 1; i < length; i++) {
        	
        	int a = A[i];		//A�迭�� �񱳰�
        	int b = B[i];		//B�迭�� �񱳰�
        	
        	int j = i -1;		//A�迭 ���
        	int k = i -1;		//B�迭 ���
        	
        	while(j >=0 && A[j]>a) {
        		A[j+1] = A[j];
        		j--;
        	} 
        	
        	while(k>=0 && B[k]<b) {
        		B[k+1] = B[k];
        		k--;
        	} 
			
        	A[j+1] = a;
        	B[k+1] = b;
		}

        for (int i = 0; i < length; i++) {
			answer += A[i]*B[i];
		}

        return answer;
    }
}
