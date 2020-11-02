import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Collection<String> knownWords = new HashSet<>();

        while (n > 0) {
            knownWords.add(scanner.next().toLowerCase());
            n--;
        }

        int k = scanner.nextInt();

        Collection<String> checkWords = new HashSet<>();

        while (k >= 0) {
            String input = scanner.nextLine().toLowerCase();
            String[] str = input.split("\\s+");
            checkWords.addAll(Arrays.asList(str));
            k--;
        }

        for (String s : checkWords) {
            if (!knownWords.contains(s) && !s.equals("")) {
                System.out.println(s);
            }
        }


    }
}