package 카펫;

//문제:	https://school.programmers.co.kr/learn/courses/30/lessons/42842
//분류:	완전탐색
//풀이일: 2025-05-11


//과정 설명
//		①가로 X 세로 = 넓이 (brown + yellow)
//		②가로X2 + (세로-2)X2 = brown
//			= 2(가로 + 세로) - 4 = brown

public class Solution {
    public int[] solution(int brown, int yellow) {
    	
        int[] answer = new int[2];
        //① 넓이 확인
        int extent = brown + yellow;
        int height, width, border;
 	
    	for (height = 3; height <extent; height++) {
    		if(extent%height==0) {
    			
    			width = extent/height;
    			//② 외각 사각형 갯수 확인
    			border = (width + height) * 2 - 4;
    			
    			//② 외각 사각형 갯수 와 brown 사각형 갯수 확인
    			if(border==brown) {
    				
    				answer[0]= width;
    				answer[1]= height;
    				break;
    			}
    		}
    	}


        
        return answer;
    }
}