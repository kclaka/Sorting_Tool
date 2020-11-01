import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int num_input = scanner.nextInt();

        int[] input = new int[num_input];

        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.println(input.length - 1);
    }
}