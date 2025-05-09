package programmers.Level2.�ùٸ���ȣ;

import java.util.Iterator;

//����:	https://school.programmers.co.kr/learn/courses/30/lessons/12909
//�з�:	����/ť
//Ǯ����: 2025-05-08

//Ǯ�� ����
//	�繮�ڿ��� ������ ¦������ �Ѵ�.
//	��'(' , ')' ������ ���ƾ� �Ѵ�.
//	�鹫���� '(' ���� �����ؾ� �Ѵ�.


public class Solution {
	
	boolean solution(String s) {
		
		//���� ����
		boolean answer = true;
		String[] str = s.split("");
		int countOpen = 0;
		int countClose = 0;
		
		//[����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		//System.out.println("Hello Java");
		
		//�繮�ڿ��� ���� ¦�� Ȯ��
		if (str.length%2 != 0)
			answer = false;
		
		for (String string : str) {
			
			if (string.equals("(")){
				countOpen++;
				
			}else if (string.equals(")")){
				countClose++;
				
				//��'(' ���� ���� Ȯ��
				if(countClose > countOpen) {
					answer = false;
					break;
				}
				
			}
			// "(" �Ǵ� ")" ���� Ȯ��
			else {
				answer = false;
				break;
			}
		}
		
		if(countOpen != countClose )
			answer = false;
		
		return answer;
	}
}
