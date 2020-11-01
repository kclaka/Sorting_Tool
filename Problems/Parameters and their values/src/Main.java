class Problem {

    public static void main(String[] args) {
        // Write your code here
        for (int i = 0; i < args.length - 1; i++) {
            System.out.println(args[i]+"="+args[i+1]);
            i++;
        }
    }
}