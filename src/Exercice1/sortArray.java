package Exercice1;

public class sortArray{
    public static void printArray(int[] arr){
        if(arr == null || arr.length == 0 ){
            return;
        }
        for(int i = 0 ; i < arr.length ; i ++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
        if(arr == null || arr.length == 0 ){
            return new int[] {};
        }
        int[] arr2 = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i ++){
            arr2[i] = arr[i];
        }
        for(int i = 0 ; i < arr.length - 1 ; i ++){
            for(int j = i ; j >= 0 ; j--){
                if (arr2[j+1] > arr2[j]) {
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
    public static void main(String[] args){
        int[] arr = new int[] {15,26,81,106,5,97,55};
        System.out.println("The original array is :");
        printArray(arr);
        System.out.println("\nThe sorted array is :");
        int[] arr2 = sortIntegers(arr);
        printArray(arr2);
    }
}
