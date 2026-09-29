package Exercice4;

public class copyColumns{
    public static void copyColumnsMethod(int[][] mat, int a ,int b){
        // mat is the two dimentional matrix
        // a is the index of the first column
        // b is the index of the second column
        // we're going to copy the contents of the column a into the column b

        for(int i = 0 ; i < mat.length ; i ++ ){
            mat[i][b] = mat[i][a];
        }
    }
    public static void main(String[] args) {
        int[][] mat = new int[6][8];
        int last_element = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                mat[i][j] = last_element + 1 + j;
            }
            last_element = mat[i][7];
        }
        System.out.println("The original matrix : ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 7) {
                    System.out.print(mat[i][j] + "\n");
                } else {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        copyColumnsMethod(mat,1,4);
        // the second column has index 1
        // the fifth column has index 4
        System.out.println("The changed matrix : ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 7) {
                    System.out.print(mat[i][j] + "\n");
                } else {
                    System.out.print(mat[i][j] + ", ");
                }
            }

        }
    }
}