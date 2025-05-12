package programmers.Level2.�ּڰ������;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//����:	https://school.programmers.co.kr/learn/courses/30/lessons/12939
//�з�:	��������
//Ǯ����: 2025-05-12

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Solution solution = new Solution();
		int length = 0;
		int aLength = -1,bLength= -1;
		
		System.out.print("�迭�� ���̸� �Է��ϼ���(����): ");
		length = Integer.parseInt(bf.readLine());
		
		int[] A =new int[length];
		int[] B =new int[length];
		
		while(aLength != length || bLength != length || aLength<0 || bLength<0) {
			
			System.out.println("\nA�迭, B�迭�� ���̴� ���ƾ� �մϴ�.");
			System.out.print("A�迭�� ���ڸ� �����ϼ���( ���ڴ� ���� ���� ) : ");
			A = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			aLength=A.length;
			
			
			System.out.print("B�迭�� ���ڸ� �����ϼ���( ���ڴ� ���� ���� ) : ");
			B = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			bLength=B.length;
			
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		System.out.print("A = ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		System.out.print("B = ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		
		solution.solution(A, B);
		
		
	}
}
