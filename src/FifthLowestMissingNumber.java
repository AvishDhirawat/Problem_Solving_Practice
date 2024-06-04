import java.util.HashSet;
import java.util.Set;

public class FifthLowestMissingNumber {
    public long findMissingInteger(int[] arr, long k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            seen.add(num);
        }

        long count = 0;
        long missing = 1;
        while (count < k) {
            if (!seen.contains((int) missing)) {
                count++;
            }
            missing++;
        }
        return missing - 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 3, 4};
        long k = 5;
        FifthLowestMissingNumber fifthLowestMissingNumber = new FifthLowestMissingNumber();
        long result = fifthLowestMissingNumber.findMissingInteger(arr, k);
        System.out.println(result);
    }
}
