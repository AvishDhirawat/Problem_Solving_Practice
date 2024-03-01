import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void main(String [] args){
        Test4 test4 = new Test4();
        test4.display("one two four zero nine seven zero four");
        test4.display(147023405);
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
        System.out.println(" ");
    }
    static List<Integer> arr1 = new ArrayList<>();
    static List<String> str1 = new ArrayList<>();
    static int l = 0;
    public List<String> recFunc(int n){

        if(n!=0) {
            l =  n % 10;
            if (l == 1) {
                str1.add("one");
            }
            else if (l == 2) {
                str1.add("two");
            }
            else if (l == 3) {
                str1.add("three");
            }
            else if (l == 4) {
                str1.add("four");
            }
            else if (l == 5) {
                str1.add("five");
            }
            else if (l == 6) {
                str1.add("six");
            }
            else if (l == 7) {
                str1.add("seven");
            }
            else if (l == 8) {
                str1.add("eight");
            }
            else if (l == 9) {
                str1.add("nine");
            }
            else if (l == 0) {
                str1.add("zero");
            }

            return recFunc(n/10);
        }
        return str1;
    }
    public void display(int n){
        List<String> str2 = recFunc(n);
        str2 = str2.reversed();
        System.out.println(str2);
        System.out.println("");
    }
}
