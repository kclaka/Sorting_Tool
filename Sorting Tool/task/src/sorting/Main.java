package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Long, Integer> map = new HashMap<Long, Integer>();

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            // write your code here
            if (map.containsKey(number)){
                int value = map.get(number);
                map.put(number, value + 1);
            } else {
                map.put(number, 1);
            }

        }

        int total = map.values().stream().reduce(0, Integer::sum);
        Long max = Collections.max(map.keySet());



        System.out.println("Total numbers: " + total+".");
        System.out.println("The largest number: "+max+" ("+map.get(max)+" time(s)).");
    }
}
