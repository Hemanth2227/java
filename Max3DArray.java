public class Max3DArray {
    public static void main(String[] args) {
        int[][][] array = {
            { {1, 5, 9}, {2, 6, 10} },
            { {3, 7, 11}, {4, 8, 12} }
        };
       
        int max = array[0][0][0]; // Start with the first element

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                }
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
