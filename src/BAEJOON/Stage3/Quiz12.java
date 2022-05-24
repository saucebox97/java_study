package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int add = 0;
        add += input1;
        add += input2;
            if ((input1 == 0)&&(input2 == 0))break;
            System.out.printf("%d\n", add);
        }

    }
}
