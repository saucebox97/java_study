package BAEJOON.stage4;

import java.util.Scanner;

public class Quiz3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 세 정수를 입력
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        // 세 수의 곱
        int total = num1*num2*num3;
        // 0부터 9까지의 등장횟수를 저장할 배열
        int[] count = new int[10];
        // 자리수 별로 숫자를 쪼개서 배열에 넣기

        while (total > 0) {
            // 1의 자리수를 구하기 ex) 3645853
            int lastPosNum = total % 10;
            count[lastPosNum]++; // 1의자리 숫자에 해당하는 배열카운트 증가

            // 한자리수 줄이기
            total /= 10;
        }
//        System.out.println(Arrays.toString(count));

        for (int x : count) {
            System.out.println(x);
        }

    }
}
