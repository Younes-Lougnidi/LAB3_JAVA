package Exercice6;


public class median{
    public static int[] sortIntegersAsc(int[] arr){
        if(arr == null || arr.length == 0 ){
            return new int[] {};
        }
        int[] arr2 = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i ++){
            arr2[i] = arr[i];
        }
        for(int i = 0 ; i < arr.length - 1 ; i ++){
            for(int j = i ; j >= 0 ; j--){
                if (arr2[j+1] < arr2[j]) {
                    int temp = arr2[j+1];
                    arr2[j+1] = arr2[j];
                    arr2[j] = temp;
                }
                else{
                    break;
                }
            }
        }
        return  arr2;
    }

    public static int medianMethod(int[] arr){
        int[] sorted_arr = sortIntegersAsc(arr);
        int medIdx = Math.round((float) arr.length /2) - 1;
        return sorted_arr[medIdx];
    }

    public static void main(String[] args){
        int[] arr1 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int[] arr2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.print("The median of the array [");
        for(int i = 0 ; i < arr1.length; i ++){
            if( i == arr1.length - 1 ){
                System.out.print(arr1[i]);
            }
            else{
                System.out.print(arr1[i] +", ");
            }

        }
        System.out.println("] is : " + medianMethod(arr1));
        System.out.print("The median of the array [");
        for(int i = 0 ; i < arr2.length; i ++){
            if( i == arr1.length - 1 ){
                System.out.print(arr2[i]);
            }
            else{
                System.out.print(arr2[i] +", ");
            }

        }
        System.out.println("] is : " + medianMethod(arr2));    }
}