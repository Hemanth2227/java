public class Transpose {
    public static void main(String[] args) {

        //  Original matrix 
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

	 //  Get number of rows and columns
        int rows = matrix.length;     
        int cols = matrix[0].length;   	

	//  Create a new matrix for transpose 
                int[][] transposed = new int[cols][rows];

	 // Use nested loops t Swap rows and columns
	        for (int i = 0; i < rows; i++) {      
                for (int j = 0; j < cols; j++) {   
                transposed[j][i] = matrix[i][j];  
            }
        }

               for (int i = 0; i < cols; i++) {       
            for (int j = 0; j < rows; j++) {   
                System.out.print(transposed[i][j] + " ");        
      }
            System.out.println();  
        }
    }
}
