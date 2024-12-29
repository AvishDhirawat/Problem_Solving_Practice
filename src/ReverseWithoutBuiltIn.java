public class ReverseWithoutBuiltIn {
    public static String reverseWithoutBuiltIn(String str) {
        char [] strChar = str.toCharArray();
        int left = 0, right = strChar.length - 1;
        while (left < right) {
            char temp = strChar[left];
            strChar[left] = strChar[right];
            strChar[right] = temp;
            left++;
            right--;
        }
        return new String(strChar);
    }
    public static void main(String args[]) {
        ReverseWithoutBuiltIn reverseWithoutBuiltIn = new ReverseWithoutBuiltIn();
        String res = ReverseWithoutBuiltIn.reverseWithoutBuiltIn("Hello World");
        System.out.println(res);
    }
}
