import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        StringBuilder sb = new StringBuilder();

        sb.append(word);

        sb = sb.reverse();

        if (word.equals(sb.toString())){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}