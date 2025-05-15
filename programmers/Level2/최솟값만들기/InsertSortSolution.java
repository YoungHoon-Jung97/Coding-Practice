package programmers.Level2.최솟값만들기;

//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12941
//분류 : 연습문제(정렬)
//풀이일 : 2025-05-12

//풀이 조건
//		① A 가장 큰수 부터 배치
//		② B 가장 작은수 부터 배치
//		③ A,B 배열 순서대로 곱해서 더하기

/*
삽입정렬
	-현재 원소를 앞의 정렬된 부분과 비교하여 적절한 위치에 삽입
	
	시간 복잡도 분석
	
	최선		O(n)
	평균 		O(n²)
	최악 		O(n²)
	교환횟수	O(n) ~ O(n²)
*/

public class InsertSortSolution {
	public int solution(int []A, int []B)
    {
        int answer = 0;
        int length = A.length;
  
        for (int i = 1; i < length; i++) {
        	
        	int a = A[i];		//A배열의 비교값
        	int b = B[i];		//B배열의 비교값
        	
        	int j = i -1;		//A배열 사용
        	int k = i -1;		//B배열 사용
        	
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
