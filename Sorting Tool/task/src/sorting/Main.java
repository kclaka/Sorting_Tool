package sorting;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(final String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<String> arg = Arrays.asList(args);
        //System.out.println(arg);

        List<Long> intarr = new ArrayList<>();

        if (arg.contains("-sortingType")  || args[2].equals("-byCount")) {
            while (scanner.hasNextInt()) {
                Long num = scanner.nextLong();
                intarr.add(num);
            }
            byCount(intarr);

        }
//            naturalSort(intarr);
//
//        }


//        } else if (args[1].equals("long")) {
//                ArrayList<Long> arr = new ArrayList<>();
//                while (scanner.hasNextLong()) {
//                    long number = scanner.nextLong();
//                    // write your code here
//                    arr.add(number);
//
//                }
//                parseLong(arr);
//            } else if (args[1].equals("line")) {
//                ArrayList<String> arrLine = new ArrayList<>();
//                while (scanner.hasNext()) {
//                    String str = scanner.nextLine();
//                    //int line_len = str.length() - str.replaceAll(" ", "").length();
//                    arrLine.add(str);
//
//
//                }
//
//                parseLine(arrLine);
//
//
//            } else {
//                ArrayList<String> arrString = new ArrayList<>();
//
//                while (scanner.hasNext()) {
//                    String word = scanner.next();
//                    // write your code here
//                    arrString.add(word);
//                }
//
//                parseWord(arrString);
//
//            }



    }

    private static void sortInteger(ArrayList<Integer> num) {
        Collections.sort(num);
        System.out.println("Total numbers: " + num.size() + ".");
        System.out.print("Sorted data: " + num.toString().replace("[", "")
                .replace("]", "").replace(",", ""));

    }

    private static void parseLong(ArrayList<Long> longParam) {
        System.out.println("Total numbers: " + longParam.size() + ".");
        System.out.print("The greatest number: " + Collections.max(longParam));
        int freq = Collections.frequency(longParam, Collections.max(longParam));
        double percent = (double) freq / longParam.size() * 100;

        System.out.println(" (" + freq + " time(s), " + (int) percent + "%).");
    }

    private static void parseWord(ArrayList<String> stringParam) {
        System.out.println("Total words: " + stringParam.size() + ".");
        String max = Collections.max(stringParam, Comparator.comparing(String::length));
        System.out.print("The longest word: " + max);
        int freq = Collections.frequency(stringParam, Collections.max(stringParam));
        double percent = (double) freq / stringParam.size() * 100;

        System.out.println(" (" + freq + " time(s), " + (int) percent + "%).");
    }

    private static void parseLine(ArrayList<String> strLine) {
        System.out.println("Total lines: " + strLine.size() + ".");
        System.out.println("The longest line: ");
        String max = Collections.max(strLine, Comparator.comparing(String::length));
        System.out.print(max);
        int freq = Collections.frequency(strLine, Collections.max(strLine));
        double percent = (double) freq / strLine.size() * 100;
        System.out.println("\n(" + freq + " time(s), " + (int) percent + "%).");

    }

    private static void naturalSort(TreeMap<Integer, String> map){
        
    }



    private static void byCount(List<Long> num){
        System.out.println(String.format("Total numbers: %d.", num.size()));
        printByCountStats(num);

    }

    private static void  printByCountStats(List<Long> nums){
        TreeMap<Long, Integer> map = new TreeMap<>();

        for(Long i : nums){
            int count = map.getOrDefault(i, 0);
            map.put(i, count + 1);
        }



        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(s -> System.out.printf("%d: %d time(s), %d%%\n", s.getKey(), s.getValue(), getPercentage(nums.size(), s.getValue())));


    }

    private static int getPercentage(double size, double count){
        double ans = count/size * 100;
        return (int)(Math.round(ans));
    }


}
