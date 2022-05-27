package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int i = 1;
        for (i= 1; i<=input1; i++) {
            int num = sc.nextInt();
            if (num<input2) {
                System.out.printf("%d ", num);
            }
        }
    }
}
