package Methods;

import java.util.Scanner;

public class _2_sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

        int ans2 = sum3(20, 30);
        System.out.println(ans2);

        greeting();
    }

    static void greeting() {
        System.out.println("Hi Rohit");
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;  //return statement always at the end

//        System.out.println("This will never execute");
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }



    /*
       A.M return_type name (arguments) {
            // body
            return statement;
        }
     */
}
