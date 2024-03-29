import java.util.Scanner; 
public class TwoDArray {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int n;
      
      
      n = scnr.nextInt();
      int[] matrixA = new int[n];        // Matrix A
      int[][] matrixB = new int[n][n];   // Matrix B 
      int[] matrixC = new int[n];        // Matrix C

      for (int i = 0 ; i < n ; i++ ) {
            matrixA [i] += scnr.nextInt();     
        }

        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < n ; col++) {
            matrixB[row][col] = scnr.nextInt();
            }
        }

        for (int row = 0; row < n ; row ++) {
        	for (int col = 0; col <n ; col++) {
        		matrixC[row] += matrixA [col] * matrixB [col] [row];
        	}
        	
        }

        for (int j : matrixC ) {
        	System.out.println(j);
     
        }
   }
   
}
