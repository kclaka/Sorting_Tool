import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String url = scanner.next();

        String[] param = url.split("[=&?]");
        boolean printlast = false;
        String password = "";

        for (int i = 0; i < param.length; i++) {
            if (param[i].equals("pass") && !param[i + 1].equals("")) {
                printlast = true;
                password = param[i + 1];
                System.out.println("pass : " + param[i + 1]);
            }

            if (param[i].equals("port") && !param[i + 1].equals("")) {
                System.out.println("port : " + param[i + 1]);
            } else if (param[i].equals("port") && param[i + 1].equals("")) {
                System.out.println("port : not found");
            }


            if (param[i].equals("cookie") && !param[i + 1].equals("")) {
                System.out.println("cookie : " + param[i + 1]);
            } else if (param[i].equals("cookie") && param[i + 1].equals("")) {
                System.out.println("cookie : not found");
            }

            if (param[i].equals("host") && !param[i + 1].equals("")) {
                System.out.println("host : " + param[i + 1]);
            } else if (param[i].equals("host") && param[i + 1].equals("")) {
                System.out.println("host : not found");
            }

            if (param[i].equals("name") && !param[i + 1].equals("")) {
                System.out.println("name : " + param[i + 1]);
            } else if (param[i].equals("name") && param[i + 1].equals("")) {
                System.out.println("name : not found");
            }




        }

        if (printlast) {
            System.out.println("password : " + password);
        }


    }
}





//        if(!param[2].equals("")){
//            System.out.println("pass : " + param[2]);
//        }else{
//            System.out.println("pass : not found");
//        }
//
//        if(!param[4].equals("")){
//            System.out.println("port : " + param[4]);
//        }else{
//            System.out.println("port : not found");
//        }
//
//
//
//        if (!param[6].equals("")){
//            System.out.println("cookie : "+param[6]);
//        }else{
//            System.out.println("cookie : not found");
//        }
//
//        if(!param[8].equals("")){
//            System.out.println("host : " + param[8]);
//        }else{
//            System.out.println("host : not found");
//        }
//
//        if(!param[2].equals("")){
//            System.out.println("password : "+ param[2]);
//        }





