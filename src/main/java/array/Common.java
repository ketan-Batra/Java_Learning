package array;

public class Common {

    /***************************************
    * Create a program to Find Second Largest Element in Array
    * @param arr - Integer Array
    * ***************************************/

    public static void findSecondLargestElementArray(int[] arr){
        int firstLargest = 0;
        int secondLargest = 0;

        int arrLength = arr.length;

        for(int i = 0 ; i< arrLength ; i ++){
            if (arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
        }

        System.out.println("First Largest Element : "+
                firstLargest +"\nSecond Largest Element : "+secondLargest);
    }

    /***************************************
     * Create a program to Find Max and Min Element in Array
     * @param arr - Integer Array
     * ***************************************/
    public static void findMaxMinElementArray(int[] arr){
         int max = arr[0];
         for(int i = 1; i < arr.length; i++){
             if(arr[i]>max){
                 max = arr[i];
             }
         }
         int min = arr[0];
         for(int i =1 ; i<arr.length; i++){
             if(arr[i]<min){
                 min = arr[i];
             }
         }
        System.out.println("Max Element : "+
                max +"\nMin Element : "+min);
    }

    public static void main(String[] args){

        int[] array = {2,4,7,1,9,5,10};

        findSecondLargestElementArray(array);
        findMaxMinElementArray(array);
    }
}
