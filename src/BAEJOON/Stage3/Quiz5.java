package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int total = 0 ;
        int i = 1;
//        System.out.printf("%d\n", j);
        while (j>0) {
            System.out.printf("%d\n", i);
            j--;
            i++;
        }
    }
}
