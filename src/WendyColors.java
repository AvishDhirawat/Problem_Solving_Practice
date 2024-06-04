public class WendyColors {
    public static String gameWinner(String colors) {
        int charCount = 1;
        int count = 0;
        int removalCount = 0;
        for (int i = 0; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == colors.charAt(i + 1)) {
                count++;
            } else {
                if (count > 2) {
                    removalCount = count - 2;
                }
                count = 1;
            }
        }
        if(removalCount%2 == 1){
            return "wendy";
        }
        return "bob";
    }

    public static void main(String[] args) {
        String str = "wwwbbbbwww";
//        String str = "WBWBWBWBW";
        String result = gameWinner(str);

        System.out.println(result);
    }
}
