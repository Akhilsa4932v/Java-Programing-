
//rotate a matrix 90 deg #leetcode48.
public class Rotate90deg {


    public static void rotate(int[][] matrix) {
        int n = matrix.length;

    // Transpose the matrix (swap rows and columns)
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    // Reverse each row
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - 1 - j];
            matrix[i][n - 1 - j] = temp;
        }
    }
}

public static void main(String[] args){
    int matrix[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
    };
    rotate(matrix);
}


//     7 4 1 
//     8 5 2
//     9 6 3
}


