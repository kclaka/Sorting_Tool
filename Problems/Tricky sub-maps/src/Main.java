import java.util.*;
import java.util.stream.Collectors;

class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        // Write your code here
        int i = 0;
        int first = map.firstKey();
        int last = map.lastKey();
//        TreeMap<Integer, String> map_copy = new TreeMap<>(map);

        var map_copy = map.descendingMap();
        NavigableMap<Integer, String> sub_map = new TreeMap<>();


        //System.out.println(map_copy.subMap(first + 4, 0));


        //System.out.println(map_copy);

        if (first % 2 != 0) {
            sub_map.putAll(map_copy.subMap(first + 4, first - 1));
            sub_map = sub_map.descendingMap();
        } else {
            sub_map.putAll(map_copy.subMap(last, last - 5));
            sub_map = sub_map.descendingMap();
        }

        //System.out.println(sub_map);

        return sub_map;
    }
}

/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}