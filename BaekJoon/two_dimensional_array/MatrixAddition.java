package two_dimensional_array;

import java.util.Scanner;
public class MatrixAddition{
    public static void main(String[] args){
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("행렬을 입력하세요 : ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] procession = new int[n+n][m];
        
        System.out.println("데이터 값을 입력하세요 : ");
        
        for (int i = 0; i < 2*n; i++) {
        	for (int j = 0; j < m; j++) {
				procession[i][j] = scanner.nextInt();
			}
			
		}
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
                if(j != m-1)
				    System.out.print(procession[i][j]+procession[n+i][j]+" ");
                else
                    System.out.print(procession[i][j]+procession[n+i][j]);
			}
            if(i!=n-1)
			    System.out.println();
		}
        
    }
}
