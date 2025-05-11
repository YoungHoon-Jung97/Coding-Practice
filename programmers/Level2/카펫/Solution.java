package ī��;

//����:	https://school.programmers.co.kr/learn/courses/30/lessons/42842
//�з�:	����Ž��
//Ǯ����: 2025-05-11


//���� ����
//		�簡�� X ���� = ���� (brown + yellow)
//		�谡��X2 + (����-2)X2 = brown
//			= 2(���� + ����) - 4 = brown

public class Solution {
    public int[] solution(int brown, int yellow) {
    	
        int[] answer = new int[2];
        //�� ���� Ȯ��
        int extent = brown + yellow;
        int height, width, border;
 	
    	for (height = 3; height <extent; height++) {
    		if(extent%height==0) {
    			
    			width = extent/height;
    			//�� �ܰ� �簢�� ���� Ȯ��
    			border = (width + height) * 2 - 4;
    			
    			//�� �ܰ� �簢�� ���� �� brown �簢�� ���� Ȯ��
    			if(border==brown) {
    				
    				answer[0]= width;
    				answer[1]= height;
    				break;
    			}
    		}
    	}


        
        return answer;
    }
}