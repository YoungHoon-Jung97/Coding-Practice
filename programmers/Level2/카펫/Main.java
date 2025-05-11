package 카펫;

import java.util.Scanner;

//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/42842
//분류:	완전탐색
//풀이일: 2025-05-11

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Solution solution = new Solution();
		int brown = 0, yellow = 0;
		
		while (brown <8 || brown >5000) {
			System.out.print("brown의 갯수를 입력하세요 :");
			brown = scanner.nextInt();
		}
		
		
		while (yellow <1 || yellow>2000000) {
			System.out.print("yellow의 갯수를 입력하세요 :");
			yellow = scanner.nextInt();
		}
		
		//확인
		//System.out.println("brown 의 갯수 : "+brown);
		//System.out.println("yellow 의 갯수 : "+yellow);
		
		int[] lengths = solution.solution(brown, yellow);
		
		for (int length : lengths) {
			System.out.println("길이 :"+length);
		}
		
	}
	
}
