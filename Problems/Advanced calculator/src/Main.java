import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        //String operator = args[0];
        // write your code here
       int[] a = {3, 0, 3, 9, 2, 1};



        int r = 7;

        for (int i = 0; i < a.length; i++) {
            r += a[i] * a[i];
        }

        int r1 = 13;
        r1 += a[a[0]];
        r1 -= a[a[a.length -1]];

        int r2 = 0;

        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] < a.length){
                r2 += a[i];
            }
        }


        System.out.println(r + " " +  r1 + " " + r2);




    }
}