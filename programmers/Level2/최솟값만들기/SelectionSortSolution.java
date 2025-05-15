package programmers.Level2.�ּڰ������;

//���� : https://school.programmers.co.kr/learn/courses/30/lessons/12941
//�з� : ��������(����)
//Ǯ���� : 2025-05-12

//Ǯ�� ����
//		�� A ���� ū�� ���� ��ġ
//		�� B ���� ������ ���� ��ġ
//		�� A,B �迭 ������� ���ؼ� ���ϱ�

/*
���� ����
	-���� ū ��, ���� ���� ���� �� �տ� ��ġ ��Ų��.
	
	�ð� ���ڵ� �м�
	
	�ּ�		O(n��)
	��� 		O(n��)
	�־� 		O(n��)
	��ȯȽ��	O(n)
*/

public class SelectionSortSolution {
	public int solution(int []A, int []B)
    {
        int answer = 0;
        int length = A.length;
  
        for(int i=0; i<length-1; i++) {
        	
        	int minIndex = i;
        	int maxIndex = i;
        	
        	for (int j = i+1; j < length; j++) {
				if (A[minIndex]> A[j]) {
					minIndex = j;
				}
				
				if (B[maxIndex]< B[j]) {
					maxIndex = j;
				}
			}
        	
			int temp = A[i];
			A[i] = A[minIndex];
			A[minIndex] = temp;
			
			temp = B[i];
			B[i] = B[maxIndex];
			B[maxIndex] = temp;
        	
        }
        
        /*
        ��� Ȯ��
        System.out.print("A : ");
        for (int i = 0; i < length; i++) {
        	System.out.print(A[i]+" ");
		}
        
        System.out.println();
        System.out.print("B : ");
        for (int i = 0; i < length; i++) {
        	System.out.print(B[i]+" ");
		}
        */ 
        
        for (int i = 0; i < length; i++) {
			answer += A[i]*B[i];
		}

        return answer;
    }
}
