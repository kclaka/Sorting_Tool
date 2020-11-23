import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (scanner.hasNext()) {
            try {
                input = scanner.nextLine();
                int num = Integer.parseInt(input);
                if (num == 0) {
                    break;
                } else {
                    System.out.println(num * 10);
                }
            } catch (Exception e) {
                System.out.println("Invalid user input: " + input);
            }
        }
    }
}