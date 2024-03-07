public class MajorityElement {
    public static int majorityElement(int[] v) {
        // Write your code here // Better Approach
//        Map<Integer, Integer> arrayMap = new HashMap<>();
//
//        for (int i = 0; i < v.length; i++) {
//            if (arrayMap.containsKey(v[i])) {
//                arrayMap.put(v[i], arrayMap.get(v[i]) + 1);
//            } else {
//                arrayMap.put(v[i], 1);
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> mapElement: arrayMap.entrySet()){
//            if(mapElement.getValue() > v.length/2){
//                return mapElement.getKey();
//            }
//        }
//        return -1;

        // Optimal Solution - Moore's Voting Algorithm
        int count = 0;
        int element = 0;
        for (int i = 0; i < v.length; i++) {
            if (count == 0) {
                element = v[i];
            }
            if (v[i] == element) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        int result = majorityElement(arr);
        System.out.println(result);
    }
}

