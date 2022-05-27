package BAEJOON.stage2;

import java.util.Scanner;

public class Quiz7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        sc.close();

        if (dice1==dice2&&dice2==dice3&&dice1==dice3) {
            System.out.printf("%d", 10000+dice1*1000);
        }
        else if (dice1==dice2) {
            System.out.printf("%d", 1000 + dice1 * 100);
        }
        else if (dice2==dice3) {
            System.out.printf("%d", 1000 + dice2 * 100);
        }
        else if (dice1==dice3) {
            System.out.printf("%d", 1000 + dice3 * 100);
        }
        else if (!(dice1==dice2&&dice2==dice3&&dice1==dice3)){
            if (dice1>dice2&&dice1>dice3) {
                System.out.printf("%d", dice1*100);
            }
            else if (dice2>dice1&&dice2>dice3) {
                System.out.printf("%d", dice2*100);
            }
            else if (dice3>dice1&&dice3>dice2) {
                System.out.printf("%d", dice3*100);
            }
        }
        /*
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        // 가장 큰 눈 찾기
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;

        // 3개가 모두 같은 경우
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        }
        // 2개가 같은 경우
        else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        }
        // 모두 다른 경우
        else {
            System.out.println(max * 100);
        }
         */
    }
}
