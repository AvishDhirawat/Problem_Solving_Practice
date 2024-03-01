import java.util.Arrays;

public class sortColors {
    public static int [] sortColors(int[] nums) {
//        int arr[] = new int[nums.length];
//        Arrays.fill(arr, 1);
//        int i=0, j = 0, k = nums.length-1;
//        while(i<nums.length) {
//            if(nums[i]==0){
//                arr[j] = nums[i];
//                j++;
//            }
//            if(nums[i] == 2){
//                arr[k] = nums[i];
//                k--;
//            }
////            if(i>=nums.length){
////                arr[j] = 1;
////                j++;
////            }
//            i++;
//        }
//        return arr;
        int mid = 0;
        int low = 0;
        int high = nums.length-1;
        if(nums.length<2){
            return nums;
        }
        while(mid <= high){
            if(nums[low] == 0 && mid == low){
                mid++;
                low++;
            }
            else if(nums[mid] == 2){
//                nums[mid] = nums[high] + nums [mid];
//                nums[high] = nums[mid] - nums[high];
//                nums[mid] = nums[mid] - nums[high];
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
            else if(nums[mid] == 0){
                nums[mid] = nums[low] + nums [mid];
                nums[low] = nums[mid] - nums[low];
                nums[mid] = nums[mid] - nums[low];
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
        }
        return nums;
    }

    public static void main(String [] args){
        int arr[] = {2, 2};
        int result[] = sortColors(arr);
        for (int element: result) {
            System.out.println(element);
        }
    }
}
