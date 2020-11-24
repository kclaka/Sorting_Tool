package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(final String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        List<String> arg = Arrays.asList(args);


        List<Long> intarr = new ArrayList<>();
        List<String> stringarr = new ArrayList<>();

        if ((arg.contains("sortingType"))  && !((arg.contains("byCount"))  || arg.contains("natural"))){
            System.out.println("No sorting type defined!");
        }else if(( arg.contains("dataType"))  &&   !((arg.contains("long")) || arg.contains("word"))) {
            System.out.println("No data type defined!");
        }else if (arg.contains("long") && arg.contains("byCount")  || arg.contains("outputFile")) {
            if(arg.contains("inputFile") && arg.contains("outputFile")){
                filenaame(scanner, arg, intarr);
            }else{
                while (scanner.hasNextInt()) {
                    Long num = scanner.nextLong();
                    intarr.add(num);
                }
                byCount(intarr);
            }

        } else if (arg.contains("long") || arg.contains("natural")) {
            if(arg.contains("inputFile") && arg.contains("outputFile")){
                filenaame(scanner, arg, intarr);
            }else{
                while (scanner.hasNextInt()) {
                    Long num = scanner.nextLong();
                    intarr.add(num);
                }
                naturalSort(intarr);
            }


        } else if (arg.contains("word") && arg.contains("byCount")) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                stringarr.add(word);
            }

            byCount(stringarr);
        } else if (arg.contains("line")) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                stringarr.add(line);
            }

            parseLine(stringarr);
        }


    }

    private static void filenaame(Scanner scanner, List<String> arg, List<Long> intarr) throws IOException {
        String infilename = arg.get(arg.indexOf("inputFile") + 1);
        String outfilename = arg.get(arg.indexOf("outputFile") + 1);
        File file = new File(infilename);

        Scanner scanFile = new Scanner(file);
        while (scanFile.hasNext()){
            Long num = scanner.nextLong();
            intarr.add(num);
        }
        writeToFile(intarr, outfilename);
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

    private static void parseLine(List<String> strLine) {
        System.out.println("Total lines: " + strLine.size() + ".");
        printByCountStats(strLine);

    }

    private static <T extends Comparable<? super T>> void naturalSort(List<T> lst) {
        if (lst.get(0) instanceof String) {
            System.out.println(String.format("Total words: %d.", lst.size()));
        } else {
            System.out.println(String.format("Total numbers: %d.", lst.size()));
        }
        printbyNaturalSort(lst);

    }

    private static <T extends Comparable<? super T>> void printbyNaturalSort(List<T> lst) {
        Collections.sort(lst);
        System.out.print("Sorted data: ");
        String result = "";

        for (T k : lst) {
            result += k + " ";
        }

        System.out.println(result.strip());

    }


    private static <T> void byCount(List<T> lst) {
        if (lst.get(0) instanceof String) {
            System.out.println(String.format("Total words: %d.", lst.size()));
        } else {
            System.out.println(String.format("Total numbers: %d.", lst.size()));
        }
        printByCountStats(lst);


    }


    private static <T> void printByCountStats(List<T> nums) {
        TreeMap<T, Integer> map = new TreeMap<>();

        for (T t : nums) {
            int count = map.getOrDefault(t, 0);
            map.put(t, count + 1);
        }

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(s -> System.out.printf("%s: %d time(s), %d%%\n", s.getKey(), s.getValue(), getPercentage(nums.size(), s.getValue())));


    }

    private static <T> void writeToFile(List<T> nums, String filename) throws IOException {
        TreeMap<T, Integer> map = new TreeMap<>();
        File file = new File(filename);
        file.mkdirs();
        file.createNewFile();
        PrintWriter printWriter = new PrintWriter(file);

        for (T t : nums) {
            int count = map.getOrDefault(t, 0);
            map.put(t, count + 1);
        }

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(s -> printWriter.printf("%s: %d time(s), %d%%\n", s.getKey(), s.getValue(), getPercentage(nums.size(), s.getValue())));


    }

    private static int getPercentage(double size, double count) {
        double ans = count / size * 100;
        return (int) (Math.round(ans));
    }


}