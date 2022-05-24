package BAEJOON.stage4;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 입력받은 정수의 개수
        int min = 0;
        int max = 0;
        int[] numbers = new int[count]; //입력받은 정수를 저장할 배열
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            numbers[i] = num;
        }
        min = numbers[0];
        max = numbers[0];
        for (int i = 0; i < count; i++) {
            if (numbers[i]<min) {
                min = numbers[i];
            }
            if (numbers[i]>max) {
                max = numbers[i];
            }
        }
        System.out.printf("%s %s", min, max);

    }
}
