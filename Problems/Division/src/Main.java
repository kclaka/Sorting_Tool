import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        // write your code here
        return (double)a/b;
    }

    public static int hash(int v){
        return v % 13;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        System.out.println(hash(23));
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));

    }
}