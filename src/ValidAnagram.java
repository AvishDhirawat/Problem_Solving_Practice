public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for (char value : ch) {
            freq[value - 'a']++;
        }
        for (char c : ch2) {
            freq[c - 'a']--;
        }
        for (int j : freq) {
            if (j != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String [] args) {
        ValidAnagram validAnagram = new ValidAnagram();

        String s = "anagram";
        String t = "nagram";
        System.out.println(validAnagram.isAnagram(s, t));
        s = "rat";
        t = "car";
        System.out.println(validAnagram.isAnagram(s, t));
    }
}
