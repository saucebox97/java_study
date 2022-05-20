package BAEJOON.stage2;

import java.util.Scanner;

public class Quiz3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        if(num%4==0) {
            if(num%400==0) {
                System.out.println("1");
            }
            else if(num%100!=0) {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
        else {
            System.out.println("0");
        }
        /*
         if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
         */
    }
}
