package programmers.Level2.�ùٸ���ȣ;

import java.util.Scanner;

//����:	https://school.programmers.co.kr/learn/courses/30/lessons/12909
//�з�:	����/ť
//Ǯ����: 2025-05-08

public class Main {

	public static void main(String[] args) {
		
		//���� ����
		Scanner scanner = new Scanner(System.in);
		Solution solution = new Solution();
		String s = "";
		boolean answer;
		
		System.out.print("'(' �Ǵ� ')' �̷���� ���ڿ��� �Է��ϼ���. : ");
		s = scanner.next();
		
		answer = solution.solution(s);
		
		//���
		System.out.println("answer : "+ answer);
	}
}
