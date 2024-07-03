public class CheckPalindrome {

    public boolean isPalindrome(int x) {
        // My Code
//        String number = Integer.toString(x);
//        for (int i = 0; i < number.length(); i++) {
//            if (number.charAt(i) == number.charAt(number.length() - i - 1)) {
//                continue;
//            } else {
//                return false;
//            }
//        }
//        return true;

        // Fastest Code
        if(x<0){
            return false;
        }
        int palindrome = x;
        int ans = 0;
        while(palindrome > 0){
            int rem = palindrome%10;
            ans = (ans * 10) + rem;
            palindrome /= 10;
        }
        return ans == x;
    }

    public static void main(String[] args) {

        CheckPalindrome checkPalindrome = new CheckPalindrome();
        int x = 1234;
        System.out.println(checkPalindrome.isPalindrome(x));
        x = -121;
        System.out.println(checkPalindrome.isPalindrome(x));
        x = 121;
        System.out.println(checkPalindrome.isPalindrome(x));
        x = 10;
        System.out.println(checkPalindrome.isPalindrome(x));

    }

}
