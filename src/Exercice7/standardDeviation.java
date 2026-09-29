package Exercice7;

public class standardDeviation{
    public static double stdev(int[] arr){
        if(arr == null || arr.length == 0) {
            return 0.0;
        }
        double average = 0.0;
        for(int i = 0 ; i < arr.length ; i ++ ){
            average += (double) arr[i]/arr.length;
        }
        double sum = 0.0;
        for(int i = 0 ; i < arr.length; i ++){
            sum +=( Math.pow(arr[i] - average , 2) ) / (arr.length - 1 );
        }
        return Math.sqrt(sum);
    }

    public static void main(String[] args){
        int[] a = new int[] {1,-2,4,-4,9,-6,16,-8,25,-10};
        System.out.print("The standard deviation of the array [");
        for(int i = 0 ; i < a.length; i ++){
            if( i == a.length - 1 ){
                System.out.print(a[i]);
            }
            else{
                System.out.print(a[i] +", ");
            }

        }
        System.out.println("] is : " + stdev(a));
    }
}