import java.util.Arrays;

public class InfyInterviewOne {
    public static int smallestPositiveNum(int [] arr){
        Arrays.sort(arr);
        for (int i = 0; i<arr.length-1; i++){
            if(arr[i] + 1 != arr[i+1] && arr[i] > 0){
                return arr[i]+1;
            }
        }
        return -1;
    }
    public static void main(String [] args) {
        int[] arr = {12,13,1,2,3,-11,-12};
//        int[] arr = {-1,0,1,2,4,5};
        System.out.println(smallestPositiveNum(arr));
    }
}
//Q2. There is an integer array arr[]. Your task is to find the smallest positive number missing from the array.
// -1 0 1 2 4 5 Ans = 3