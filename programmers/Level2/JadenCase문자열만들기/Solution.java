package programmers.Level2.JadenCase���ڿ������;

import java.util.ArrayList;

//����:	https://school.programmers.co.kr/learn/courses/30/lessons/12951
//�з�:	��������
//Ǯ����: 2025-05-13

//Ǯ�� ����
// 		�繮�ڿ��� ���� �ҹ��ڷ� ����
//		���ĭ�� index��ȣ ����
//		�鹮�ڿ�(String)�� �������� ���ڿ�(String) �迭�� �и�
//		�깮�ڿ�(String) �迭�� ���ڿ�(String)�� ����(char) �迭�� �и�
//		�빮��(char)�迭�� ���� ù ����(char)�� �빮�ڷ� ����
//		�칮��(char)�� �ٽ� ��ġ�� ���ڿ�(string)�� �ٽ� ��ħ
//		��index��ȣ ��ġ�� �ٽ� ���� ����

public class Solution {

	public String solution(String s) {
		
		String result = "";
		//�繮�ڿ��� ���� �ҹ��ڷ� ����
		s = s.toLowerCase();
		
		char target = ' ';
		int count = 0; 
		int index = s.indexOf(target);
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		
		//���ĭ�� index��ȣ ����
		while(index != -1) {
			count ++;
			indexList.add(index);
			index = s.indexOf(target,index+1);
		}
		
		//�鹮�ڿ�(String)�� �������� ���ڿ�(String) �迭�� �и�
		String[] strArry = s.split("\\s+");

		for (int i=0;i<strArry.length;i++) {
			String str =strArry[i];
			//�깮�ڿ�(String) �迭�� ���ڿ�(String)�� ����(char) �迭�� �и�
			char[] temp = str.toCharArray();
			//�빮��(char)�迭�� ���� ù ����(char)�� �빮�ڷ� ����
			temp[0] = Character.toUpperCase(temp[0]);
			
			//�칮��(char)�� �ٽ� ��ġ�� ���ڿ�(string)�� �ٽ� ��ħ
			str = new String(temp);
			result += str;

		}

		//��index��ȣ ��ġ�� �ٽ� ���� ����
		for (Integer indexs : indexList) {
			result = result.substring(0, indexs) + " " + result.substring(indexs);
		}
		
		return result;
	}
}
