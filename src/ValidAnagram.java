public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
    // Doesn't work on LeetCode
//        if(s.contains(t)) {
//            return true;
//        }
//        return false;

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for(int i=0;i<ch.length;i++){
            freq[ch[i]-'a']++;
        }
        for(int i=0;i<ch2.length;i++){
            freq[ch2[i]-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
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
