import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static <list> void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();



        ArrayList<String> arr = new ArrayList<>();

        while (scanner.hasNext()) {
            String[] line = {scanner.nextLine()};
            String h = Arrays.toString(line).replace(']', ' ');
            h = h.substring(2).strip();
            arr.add(h);
            arr.remove(" ");
            arr.remove("");
            arr.remove("\n");
        }

        ArrayList<Integer> arr1 = new ArrayList<>();

        for (String i : arr) {
            String[] num = i.split(" ");
            for (String s : num) {
                arr1.add(Integer.parseInt(s));
            }
        }



        arr1.sort(Collections.reverseOrder());

        for (int i : arr1) {
            System.out.print(i + " ");
        }







    }


    
}
