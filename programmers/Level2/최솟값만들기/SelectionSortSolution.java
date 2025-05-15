package programmers.Level2.최솟값만들기;

//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12941
//분류 : 연습문제(정렬)
//풀이일 : 2025-05-12

//풀이 조건
//		① A 가장 큰수 부터 배치
//		② B 가장 작은수 부터 배치
//		③ A,B 배열 순서대로 곱해서 더하기

/*
선택 정렬
	-가장 큰 수, 가장 작은 수를 맨 앞에 위치 시킨다.
	
	시간 복자도 분석
	
	최선		O(n²)
	평균 		O(n²)
	최악 		O(n²)
	교환횟수	O(n)
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
        결과 확인
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
