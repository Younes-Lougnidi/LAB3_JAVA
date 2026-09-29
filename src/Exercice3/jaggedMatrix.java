package Exercice3;

public class jaggedMatrix{
    public static void jaggedMatrixMethod(int len){
        int[][] arr = new int[len][len];
        int last_element = 0;
        for(int i = 0 ; i < len ; i ++ ){
            for(int j = 0 ; j < i + 1 ; j ++){
                arr[i][j] =  last_element + 1 + j;
            }
            last_element = arr[i][i];
        }
        for(int i = 0 ; i < len ; i ++ ){
            for(int j = 0 ; j < i + 1 ; j ++){
                if(j == i){
                    System.out.print(arr[i][j] + "\n");
                }
                else {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Testing the methode implementation: ");
        jaggedMatrixMethod(5);
    }

}