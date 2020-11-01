import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String[] ticket_number = scanner.next().split("");




        String[] first_apart = Arrays.copyOfRange(ticket_number, 0, 3);
        String[] second_apart = Arrays.copyOfRange(ticket_number, 3, 6);

        int sum1 = 0;
        int sum2 = 0;

        for (String k : first_apart){
            sum1 += Integer.parseInt(k);
        }

        for (String l : second_apart){
            sum2 += Integer.parseInt(l);
        }

        if (sum1 == sum2){
            System.out.println("Lucky");
        }else {
            System.out.println("Regular");
        }






//        int i = 0, sum1 = 0; int sum2 = 0;
//
//        while (i <= 2){
//            sum1 = sum1 + Integer.parseInt(ticket_number[i]);
//            i++;
//        }
//
//        int k = 2;
//
//        while (k <= 5){
//            sum2 = sum2 + Integer.parseInt(ticket_number[k]);
//            k++;
//        }
//
//        if (sum1 == sum2){
//            System.out.println("Lucky");
//        }else {
//            System.out.println("Regular");
//        }


    }
}