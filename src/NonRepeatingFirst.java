import java.util.HashMap;

public class NonRepeatingFirst {
    public static char firstNonRepeating(String str) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (!countMap.containsKey(c)) {
                countMap.put(c, 0);
            } else {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("Hey There Delailah!"));
        System.out.println(firstNonRepeating("Delailah! How are you?"));
        System.out.println(firstNonRepeating("Dailh! How are you?"));
    }
}
