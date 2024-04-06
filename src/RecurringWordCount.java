import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RecurringWordCount {


    public static void RecurringWordCount(String input) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
//        input = input.replaceAll(" ", "");
//        input = input.toLowerCase();

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print characters with count greater than 1 (recurring characters)
        System.out.println("Recurring characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        String input = "My Name is Ronak Talati";
        RecurringWordCount(input);
    }
}

//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class RecurringWordCount {
//    public static void RecurringWordCount(String input) {
//        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
//
//        // Count occurrences of each character
//        for (char c : input.toCharArray()) {
//            if (Character.isLetter(c)) { // Consider only letters, ignoring spaces and other characters
//                charCountMap.put(Character.toLowerCase(c), charCountMap.getOrDefault(Character.toLowerCase(c), 0) + 1);
//            }
//        }
//
//        // Print characters with their counts
//        System.out.println("Occurrences of all letters:");
//        for (char c = 'a'; c <= 'z'; c++) {
//            int totalCount = charCountMap.getOrDefault(c, 0) + charCountMap.getOrDefault(Character.toUpperCase(c), 0);
//            if (totalCount > 0) {
//                System.out.println(c + "" + Character.toUpperCase(c) + " - " + totalCount + " times");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String input = "My Name is Ronak Talati";
//        RecurringWordCount(input);
//    }
//}
