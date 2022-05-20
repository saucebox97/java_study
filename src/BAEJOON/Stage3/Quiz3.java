package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int total = 0 ;
        int i = j;
//        System.out.printf("%d\n", j);
        while (i>0) {
            total += j;
            i--;
            j--;
        }
        System.out.printf("%d", total);
    }
}
