import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] ProductExceptSelf(int[] nums) {
        // int n = nums.length;
        // int[] left = new int[n];
        // int[] right = new int[n];
        // int[] answer = new int[n];

        // left[0] = 1;
        // for (int i = 1; i < n; i++) {
        //     left[i] = left[i - 1] * nums[i - 1];
        // }

        // right[n - 1] = 1;
        // for (int i = n - 2; i >= 0; i--) {
        //     right[i] = right[i + 1] * nums[i + 1];
        // }

        // for (int i = 0; i < n; i++) {
        //     answer[i] = left[i] * right[i];
        // }

        // return answer;

        int[] ans = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= postfix;
            postfix *= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] output = ProductExceptSelf(input);
        System.out.println(Arrays.toString(output));
    }
}
