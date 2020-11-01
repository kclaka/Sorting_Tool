import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//
//        int rad = scanner.nextInt();
//
//        double s = Math.PI * Math.pow(rad, 2);
//
//        System.out.println(s);


        char[]  name =  {'K', 'E', 'N', 'N', 'Y'};

        String names = String.valueOf(name);

        char[] namefrom = names.toCharArray();

        String thesame = new String(namefrom);

        String hello = "Hi";

        String[] g = hello.split("");

        String str = "Hello, Java";

        int i = str.length() - 1;
        while (i >= 1) {
            System.out.print(str.charAt(i));
            i--;
        }
    }
}