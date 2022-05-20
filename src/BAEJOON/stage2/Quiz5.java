package BAEJOON.stage2;

import java.util.Scanner;

public class Quiz5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        if (hour==0) {
            if (minute>=45) {
                System.out.printf("%d %d", hour, minute-45);
            }
            else {
                System.out.printf("%d %d", hour+23, minute-45+60);
            }
        }
        else if(hour<24) {

            if(minute>=45) {
                System.out.printf("%d %d", hour, minute-45);
            }

            else{
                System.out.printf("%d %d", hour-1, minute-45+60);
            }
        }
    }
}
