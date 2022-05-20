package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = 1;
        int j = 1;
        char star = '*';
        for (i= 1; i<=input; i++) {
            for (j=1; j<=input-i; j++) {
                System.out.print(" ");
            }
            for (j=input; j>input-i; j--) {
                System.out.printf("%c", star);
            }
            if (i==input) break;
                System.out.printf("\n");
        }

    }
}
