package programmers.Level2.�ִ񰪰��ּڰ�;

//����:	https://school.programmers.co.kr/learn/courses/30/lessons/12939
//�з�:	��������
//Ǯ����: 2025-05-12

//Ǯ�� ����
//		�� �迭�� ���� ó�� ���ڷ� �񱳸� ����

public class Solution {
	
	public String solution(String s) {
        String answer = "";
        String[] strNumArry ;
        int max ,min;
        
        //���ڿ� �� ���� �迭
        strNumArry = s.split(" ");
        int[] numArry = new int[strNumArry.length];
        
        max = min = Integer.parseInt(strNumArry[0]);
        
        for (int i=0; i<strNumArry.length; i++) {
			numArry[i] = Integer.parseInt(strNumArry[i]);
			
			//�ּڰ� ã��
			if(numArry[i]<min) {
				min = numArry[i];
			}
			
			//�ִ� ã��
			if(numArry[i]>max) {
				max = numArry[i];
			}
			
		}
       
        answer = min+ " "+max; 
        
        return answer;
    }
}
