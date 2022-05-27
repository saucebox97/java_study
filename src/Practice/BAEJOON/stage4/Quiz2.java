package BAEJOON.stage4;

import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];

        int index = 1;
        for (int i = 0; i < numbers.length; i++) {
            int num = sc.nextInt();
            if (num>100) break;
            numbers[i] = num;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>max) {
                max = numbers[i];
                index = i+1;
            }
        }
        System.out.printf("%d\n%d", max, index);
    }
}
