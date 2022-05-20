package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = 1;
        int j = 1;
        int k = 1;
        char star = '*';
        for (i= 1; i<=input; i++) {
            for (j=1; j<=k; j++) {
                System.out.printf("%c", star);
            }
            k++;
            System.out.printf("\n");
        }

    }
}
