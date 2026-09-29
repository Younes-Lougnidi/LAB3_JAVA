package Exercice5;

public class matrixAdd{
    public static int[][] matrixAddMethod(int[][] A , int[][] B){
        if(A == null || B == null){
            return  null;
        }
        if(A.length == 0 ){
            return new int[][] {};
        }
        int[][] result = new int[A.length][A[0].length];
        for(int i = 0 ; i < A.length ; i ++ ){
            for(int j = 0 ; j < A[0].length; j ++ ){
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] A = new int[][]{{1,2,3,4,5},
                                {6,7,8,9,2},
                                {9,7,8,6,3}};
        int[][] B = new int[][]{{5,2,6,7,5},
                                {6,1,3,2,9},
                                {4,8,8,6,5}};

        int[][] result = matrixAddMethod(A,B);

        System.out.println("The first matrix : ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (j == A[0].length -1) {
                    System.out.print(A[i][j] + "\n");
                } else {
                    System.out.print(A[i][j] + ", ");
                }
            }
        }
        System.out.println("The second matrix : ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (j == A[0].length - 1) {
                    System.out.print(B[i][j] + "\n");
                } else {
                    System.out.print(B[i][j] + ", ");
                }
            }
        }
        System.out.println("The result matrix : ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (j == result[0].length - 1) {
                    System.out.print(result[i][j] + "\n");
                }
                else {
                    System.out.print(result[i][j] + ", ");
                }
            }
        }


    }
}