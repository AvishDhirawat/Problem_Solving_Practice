public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int []nums, long k){
        long sum = 0;
        // long maxn = Integer.MIN_VALUE;
        int maxLength=0;
        int ansStart=0;
        int ansEnd=0;
        int start = 0;
        for(int i=0; i<nums.length; i++){
            // if(sum==0) //Added just incase we are asked to return the subarray.(Optional)
            //     start = i;
            sum += nums[i];

            // if(sum > maxn) {
            //     maxn = sum;
            //     ansStart = start; // Update the start and end index for subarray to return it.(Optional)
            //     ansEnd = i;
            // }

            if(sum>k){
                sum = 0;
                start = i;
                i--;
            }
            if(sum == k){
                ansStart = start; // Update the start and end index for subarray to return it.(Optional)
                ansEnd = i;
                if((ansEnd - ansStart) > maxLength)
                    maxLength = ansEnd - ansStart;
            }
        }
        return maxLength+1;
    }
    public static void main(String [] args){
//        int k = 17;
        int k = 3;
//        int [] nums = {8, 15, 17, 0, 11};
        int [] nums = {1, 2, 3, 1, 1, 1, 1};
        int soln = longestSubarrayWithSumK(nums,k);
        System.out.println(soln);
    }
}
