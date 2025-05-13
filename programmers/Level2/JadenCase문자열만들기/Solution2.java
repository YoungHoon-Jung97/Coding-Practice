package programmers.Level2.JadenCase���ڿ������;

//����:	https://school.programmers.co.kr/learn/courses/30/lessons/12951
//�з�:	��������
//Ǯ����: 2025-05-13

//Ǯ�� ����
//		��ù��° ���� ã��
//		��ù��° ���ڸ� �빮��, ������ �ҹ��� ��ȯ

public class Solution2 {

	public String solution(String s) {
		StringBuilder result = new StringBuilder();
		//��ù��° ���� ã��
		boolean isFirst = true;
		
		//��ù��° ���ڸ� �빮��, ������ �ҹ��� ��ȯ
		for (char c : s.toCharArray()) {
			result.append(isFirst ? Character.toUpperCase(c) : Character.toLowerCase(c));
			
			//��ù��° ���� ã��
			isFirst = (c == ' ');
		}
		
		return result.toString();

	}
}
