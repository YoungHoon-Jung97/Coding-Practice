package programmers.Level2.최솟값만들기;

//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12941
//분류 : 연습문제(정렬)
//풀이일 : 2025-05-12

//풀이 조건
//		① A 가장 큰수 부터 배치
//		② B 가장 작은수 부터 배치
//		③ A,B 배열 순서대로 곱해서 더하기

/*
퀵정렬
	-피벗 값을 정해서 피벗보다 작은 값과 큰 값으로 계속 분리해 나간다.
	
	시간 복자도 분석
	
	최선		O(n )
	평균 		O(n log n)
	최악 		O(n²)
	교환횟수	O(n)
*/


public class QuickSortSolution {
	
	private static int i=0;
	
	//퀵정렬 재귀함수
	private static void quickSort(int[] arr ,int start, int end) {
		
		//파티션 피벗위치
		int part2 = partition(arr, start, end);
		
		//왼쪽 파티션이 2개 이상일 때만 재귀함수 호출
		if(start < part2 - 1) {
			quickSort(arr, start, part2 - 1);
		}
		
		//오른쪽 파티션 2개 이상일 때만 재귀함수 호출
		if (part2 < end) {
			quickSort(arr, part2, end);
		}
		
	}
	
	//비펏 위치구하는 함수
	private static int partition(int[] arr, int start, int end) {
		
		//피벗 설정
		int pivot = arr[(start + end)/2];
		
		//시작값과 끝값의 교차점 찾기
		while (start <= end) {
			while (arr[start] < pivot) start++;
			while (arr[end] > pivot) end--;
			if(start <= end) {
				swap(arr, start,end);
				start++;
				end--;
				System.out.println("pivot : "+ pivot);
				System.out.printf("[\n정렬 %d 번째]: \n",++i);
				for (int num : arr) {
					System.out.print(num+ " ");
				}
				System.out.println();
			}
		}
		
		return start;
	}
	
	//스왑 함수
	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public int solution(int []A, int []B)
    {
        int answer = 0;
 
        quickSort(A,0,A.length-1);
        i=0;
        quickSort(B,0,B.length-1);
        
        for(int k=0; k<A.length; k++) {
        	answer +=A[i] * B[B.length-i] ;
        	
        }

        return answer;
    }
}
