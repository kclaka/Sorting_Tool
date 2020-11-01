import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();


        while (scanner.hasNext()) {
            String line = scanner.next();
            list.add(Integer.parseInt(line));
        }

        int n = list.get(list.size() - 1);
        list.remove(list.size() - 1);


        nearest(list, n);

    }


    public static void nearest(ArrayList<Integer> a, int n) {
        Collections.sort(a);

        ArrayList<Integer> out = new ArrayList<>();

        for (int i : a) {
            out.add(Math.abs(n - i));
        }

        int minDistance =  Collections.min(out);

        for (int i : a) {
            if (Math.abs(n - i) == minDistance) {
                System.out.print(i + " ");
            }


        }


    }



}
