package programmers.Level2.JadenCase���ڿ������;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//����:	https://school.programmers.co.kr/learn/courses/30/lessons/12951
//�з�:	��������
//Ǯ����: 2025-05-13


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Solution solution = new Solution();
		
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String s =bf.readLine();
	
		String result = solution.solution(s);
		
		System.out.println("result : " + result);
	}
}
