import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class StringSearch {

    /*
     * Complete the 'findSubstrings' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int findSubstrings(String s) {
        // Write your code here
        int n = s.length();
        Map<Character, Integer> lastIndex = new HashMap<>();
        int left = 0;
        int count = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (lastIndex.containsKey(currentChar)) {
                left = Math.max(left, lastIndex.get(currentChar) + 1);
            }
            lastIndex.put(currentChar, right);
            count += (right - left + 1);
        }

        return count;

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "bcada";

        int result = StringSearch.findSubstrings(s);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }

}
