package ī��;

import java.util.Scanner;

//����:	https://school.programmers.co.kr/learn/courses/30/lessons/42842
//�з�:	����Ž��
//Ǯ����: 2025-05-11

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Solution solution = new Solution();
		int brown = 0, yellow = 0;
		
		while (brown <8 || brown >5000) {
			System.out.print("brown�� ������ �Է��ϼ��� :");
			brown = scanner.nextInt();
		}
		
		
		while (yellow <1 || yellow>2000000) {
			System.out.print("yellow�� ������ �Է��ϼ��� :");
			yellow = scanner.nextInt();
		}
		
		//Ȯ��
		//System.out.println("brown �� ���� : "+brown);
		//System.out.println("yellow �� ���� : "+yellow);
		
		int[] lengths = solution.solution(brown, yellow);
		
		for (int length : lengths) {
			System.out.println("���� :"+length);
		}
		
	}
	
}
