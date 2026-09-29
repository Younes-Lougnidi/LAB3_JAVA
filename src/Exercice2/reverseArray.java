package Exercice2;

public class reverseArray{
    public static void reverse(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }

        System.out.print("The original array is : [");
        for(int i = 0 ; i < arr.length; i ++){
            if( i == arr.length - 1 ){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] +", ");
            }
        }
        System.out.println("]");


        for(int i = 0 ; i < Math.round((float) arr.length / 2) ; i ++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.print("The reversed array is : [");
        for(int i = 0 ; i < arr.length; i ++){
            if( i == arr.length - 1 ){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] +", ");
            }

        }
        System.out.println("]");
    }
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7};
        reverse(arr);
    }
}