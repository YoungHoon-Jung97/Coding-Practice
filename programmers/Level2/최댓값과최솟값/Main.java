package programmers.Level2.�ִ񰪰��ּڰ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//����:	https://school.programmers.co.kr/learn/courses/30/lessons/12939
//�з�:	��������
//Ǯ����: 2025-05-12

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String strNums = "";
		Solution solution = new Solution();
		
		
		System.out.print("������  �����ϼ���( ���ڴ� ���� ���� ) : ");
		strNums = bf.readLine();
		
		solution.solution(strNums);
		
	}
}
