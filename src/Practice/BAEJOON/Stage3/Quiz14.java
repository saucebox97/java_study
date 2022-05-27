package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int copy = 0;
        copy = num;
        while(true) {
            int total = copy/10 + copy%10;
            copy = (copy%10)*10 + total%10;
            i++;
            if (copy==num) break;
        }
        System.out.printf("%d\n", i);
    }
}
