import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double x = scanner.nextDouble();
//        System.out.println(f(x));

        int[] arr = {2,2,2,2,2,2,2,2,2,2};

        System.out.println(f45(arr, 3, 7));
    }

    public static double f(double x) {
        //call your implemented methods here.
        if(x <= 0){
            return f1(x);
        }else if(x >= 1){
            return f3(x);
        }else{
            return f2(x);
        }



    }

    //implement your methods here
    public static double f1(double x){
        return Math.pow(x, 2) + 1;
    }

    public static double f2(double x){
        return 1/Math.pow(x, 2);
    }

    public static double f3(double x){
        return Math.pow(x, 2) - 1;
    }

    public static int f45(int[] array, int left, int right){
        if (left == right){
            if(array[left] % 2 == 0){
                return 1;
            }else{
                return 0;
            }
        }else{
            int middle = (left + right) / 2;
            return f45(array, left, middle)
                    + f45(array, middle + 1, right);
        }
    }










}