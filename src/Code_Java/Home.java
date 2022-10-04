package Code_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Home {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{{0,1}};

        boolean[] line = new boolean[matrix.length];
        boolean[] row = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    line[i] = true;
                    row[j] = true;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (line[i] || row[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
                }
            System.out.println();
            }
        }


}
