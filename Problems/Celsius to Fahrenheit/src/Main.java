import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        double celcius = scanner.nextDouble();

        double f = celcius * 1.8 + 32;
        System.out.println(f);
    }
}