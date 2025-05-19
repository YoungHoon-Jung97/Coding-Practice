package programmers.Level2.완전범죄;


public class Solution {
	
	private void swap(int[][] info , int index1, int index2) {
		
		int[] temp = info[index1];
		info[index1] = info[index2];
		info[index2] = temp;
	}

	public int solution(int[][] info, int n, int m) {
		int answer = 0;
		int aSum =0 ,bSum =0;
		int index = 0;
		
		for (int i = 0; i < info.length-1; i++) {
			int minindex = i;
			
			for (int j = i+1; j < info.length; j++) {
				if(info[minindex][1] > info[j][1]){
					minindex = j;
				}
			}
			
			swap(info,minindex,i);
		}
		
		for (int i =0; i < info.length; i++) {
			
			bSum += info[i][1]; 
			if (bSum >= m) {
				index = i;
				break;	
			}
			if (i == info.length-1) {
				return 0;
			}

		}
		
		for (int i = index; i < info.length; i++) {
			
			for (int j = index; j < info.length; j++) {
				if (info[index][0]>info[j][0]) {
					swap(info,index,j);
				}
			}
		}
		
		for (int i = index; i < info.length; i++) {
			aSum += info[i][0];
			if (aSum >= n) 
				return -1;
		}
		
		
		answer = aSum;
		//A가 남긴 흔적의 누적 개수의 최솟값 
		return answer;
	}
}
