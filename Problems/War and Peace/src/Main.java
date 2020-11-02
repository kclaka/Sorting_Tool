import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        while (scanner.hasNext()) {
            input.add(scanner.next().toLowerCase());
        }

        for (String s : input) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
        }

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}