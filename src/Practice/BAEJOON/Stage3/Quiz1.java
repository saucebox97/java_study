package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = 1;
        while (j<10) {
            System.out.printf("%d * %d = %d\n", i, j, i*j);
            j++;
        }
    }
}
