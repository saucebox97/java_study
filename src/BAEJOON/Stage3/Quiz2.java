package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int total=0;
//        System.out.printf("%d\n", j);
        while (j>0) {
            int i = sc.nextInt();
            int k = sc.nextInt();
            total += (i+k);
            System.out.printf("%d\n", total);
            j--;
            total=0;
        }
    }
}
