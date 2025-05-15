package programmers.Level2.�ּڰ������;

//���� : https://school.programmers.co.kr/learn/courses/30/lessons/12941
//�з� : ��������(����)
//Ǯ���� : 2025-05-12

//Ǯ�� ����
//		�� A ���� ū�� ���� ��ġ
//		�� B ���� ������ ���� ��ġ
//		�� A,B �迭 ������� ���ؼ� ���ϱ�

/*
������
	-�ǹ� ���� ���ؼ� �ǹ����� ���� ���� ū ������ ��� �и��� ������.
	
	�ð� ���ڵ� �м�
	
	�ּ�		O(n )
	��� 		O(n log n)
	�־� 		O(n��)
	��ȯȽ��	O(n)
*/


public class QuickSortSolution {
	
	private static int i=0;
	
	//������ ����Լ�
	private static void quickSort(int[] arr ,int start, int end) {
		
		//��Ƽ�� �ǹ���ġ
		int part2 = partition(arr, start, end);
		
		//���� ��Ƽ���� 2�� �̻��� ���� ����Լ� ȣ��
		if(start < part2 - 1) {
			quickSort(arr, start, part2 - 1);
		}
		
		//������ ��Ƽ�� 2�� �̻��� ���� ����Լ� ȣ��
		if (part2 < end) {
			quickSort(arr, part2, end);
		}
		
	}
	
	//���� ��ġ���ϴ� �Լ�
	private static int partition(int[] arr, int start, int end) {
		
		//�ǹ� ����
		int pivot = arr[(start + end)/2];
		
		//���۰��� ������ ������ ã��
		while (start <= end) {
			while (arr[start] < pivot) start++;
			while (arr[end] > pivot) end--;
			if(start <= end) {
				swap(arr, start,end);
				start++;
				end--;
				System.out.println("pivot : "+ pivot);
				System.out.printf("[\n���� %d ��°]: \n",++i);
				for (int num : arr) {
					System.out.print(num+ " ");
				}
				System.out.println();
			}
		}
		
		return start;
	}
	
	//���� �Լ�
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
