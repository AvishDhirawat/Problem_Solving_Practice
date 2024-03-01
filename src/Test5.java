import java.util.List;

public class Test5 {

    public static void main(String [] args){
        Test5 test4 = new Test5();
        test4.display("one two four zero nine eight one one zero five");
        test4.display(14723435);
    }
    public void display(String s){
        String [] listS = s.split(" ");
        int len = listS.length;
        int [] arr = new int[len];
        for (int i=0; i<len; i++){
            if (listS[i].equalsIgnoreCase("one")) {
                arr[i] = 1;
            }
            else if (listS[i].equalsIgnoreCase("two")) {
                arr[i] = 2;
            }
            else if (listS[i].equalsIgnoreCase("three")) {
                arr[i] = 3;
            }
            else if (listS[i].equalsIgnoreCase("four")) {
                arr[i] = 4;
            }
            else if (listS[i].equalsIgnoreCase("five")) {
                arr[i] = 5;
            }
            else if (listS[i].equalsIgnoreCase("six")) {
                arr[i] = 6;
            }
            else if (listS[i].equalsIgnoreCase("seven")) {
                arr[i] = 7;
            }
            else if (listS[i].equalsIgnoreCase("eight")) {
                arr[i] = 8;
            }
            else if (listS[i].equalsIgnoreCase("nine")) {
                arr[i] = 9;
            }
            else  if (listS[i].equalsIgnoreCase("zero")) {
                arr[i] = 0;
            }
        }
        for (int i=0; i<len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public void display(int n){
        int len = 0;
        int m = n;
        while(m!=0) {
            m = m/10;
            len++;
        }
        int [] arr = new int[len];
        int i = 0;
        while(n!=0) {
            arr[len - 1 - i] = n % 10;
            n = n / 10;
            i++;
        }
        String [] listS = new String[len];
        for (int j=0; j<len; j++) {
            if (arr[j] == 1) {
                listS[j] = "one";
            }
            else if (arr[j] == 2) {
                listS[j] = "two";
            }
            else if (arr[j] == 3) {
                listS[j] = "three";
            }
            else if (arr[j] == 4) {
                listS[j] = "four";
            }
            else if (arr[j] == 5) {
                listS[j] = "five";
            }
            else if (arr[j] == 6) {
                listS[j] = "six";
            }
            else if (arr[j] == 7) {
                listS[j] = "seven";
            }
            else if (arr[j] == 8) {
                listS[j] = "eight";
            }
            else if (arr[j] == 9) {
                listS[j] = "nine";
            }
            else if (arr[j] == 10) {
                listS[j] = "ten";
            }

        }
        for (int j=0; j<len; j++) {
            System.out.print(listS[j] + " ");
        }
        System.out.println("");
    }
}
