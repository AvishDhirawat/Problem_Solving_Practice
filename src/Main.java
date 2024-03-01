import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}