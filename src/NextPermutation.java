import java.util.*;

public class NextPermutation {

    // Coding Ninja
    public static List<Integer> nextGreaterPermutation(List<Integer> permutation) {
        int n = permutation.size();

        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            Collections.reverse(permutation);
            return permutation;
        }

        for (int i = n - 1; i > ind; i--) {
            if (permutation.get(i) > permutation.get(ind)) {
                int tmp = permutation.get(i);
                permutation.set(i, permutation.get(ind));
                permutation.set(ind, tmp);
                break;
            }
        }

        List<Integer> sublist = permutation.subList(ind + 1, n);
        Collections.reverse(sublist);

        return permutation;
    }

    // LeetCode
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int bp = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                bp = i;
                break;
            }
        }

        if (bp == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > bp; i--) {
            if (nums[i] > nums[bp]) {
                int tmp = nums[i];
                nums[i] = nums[bp];
                nums[bp] = tmp;
                break;
            }
        }

        reverse(nums, bp + 1, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        List<Integer> permutation = Arrays.asList(new Integer[]{2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(permutation);

        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        NextPermutation.nextPermutation(nums);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}
