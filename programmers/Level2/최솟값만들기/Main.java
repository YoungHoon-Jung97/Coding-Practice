package programmers.Level2.최솟값만들기;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/12939
//분류:	연습문제
//풀이일: 2025-05-12

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Solution solution = new Solution();
		int length = 0;
		int aLength = -1,bLength= -1;
		
		System.out.print("배열의 길이를 입력하세요(숫자): ");
		length = Integer.parseInt(bf.readLine());
		
		int[] A =new int[length];
		int[] B =new int[length];
		
		while(aLength != length || bLength != length || aLength<0 || bLength<0) {
			
			System.out.println("\nA배열, B배열의 길이는 같아야 합니다.");
			System.out.print("A배열의 숫자를 나열하세요( 숫자는 공백 구분 ) : ");
			A = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			aLength=A.length;
			
			
			System.out.print("B배열의 숫자를 나열하세요( 숫자는 공백 구분 ) : ");
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
