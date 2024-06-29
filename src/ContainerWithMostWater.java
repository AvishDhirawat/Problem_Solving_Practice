public class ContainerWithMostWater {
    public int maxArea(int[] height) {
//        int i = 0, j = height.length - 1;
//        int ans = 0;
//        while (i < j) {
//            int t = Math.min(height[i], height[j]) * (j - i);
//            ans = Math.max(ans, t);
//            if (height[i] < height[j]) {
//                ++i;
//            } else {
//                --j;
//            }
//        }
//        return ans;
        int n = height.length;

        int i = 0;
        int j = n -1;
        int water = 0;

        while(i < j)
        {
            int h = Math.min(height[i], height[j]);

            water = Math.max(water, h *(j -i));

            //Increasing i if i is less than equal to h.
            while(height[i] <= h && i < j) {i++;}
            //Decreasing j is j is less than equal to h
            while(height[j] <= h && i < j) {j--;}
        }

        return water;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        int[] nums1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(nums1));
        int[] nums2 = {0, 1, 1};
        System.out.println(solution.maxArea(nums2));
        int[] nums3 = {1,1};
        System.out.println(solution.maxArea(nums3));

    }
}
