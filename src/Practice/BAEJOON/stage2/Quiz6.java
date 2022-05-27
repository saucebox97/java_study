package BAEJOON.stage2;

import java.util.Scanner;

public class Quiz6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int duck = sc.nextInt();
        int remain;
        remain = ((duck+minute)/60);
        sc.close();
        if (hour==0) {
            if (minute+duck<60) {
                System.out.printf("%d %d", hour, minute+duck);
            }
            else if (minute+duck>=60) {
                System.out.printf("%d %d", hour+remain, (minute+duck)-(remain*60));
            }
        }
        else if (hour+remain<24) {
            if (minute+duck<60) {
                System.out.printf("%d %d", hour, minute+duck);
            }
            else if (minute+duck>=60) {
                System.out.printf("%d %d", hour+remain, (minute+duck)-(remain*60));
            }
        }
        else {
            if (minute+duck<60) {
                System.out.printf("%d %d", hour, minute+duck);
            }
            else if (minute+duck>=60) {
                System.out.printf("%d %d", hour+remain-24, (minute+duck)-(remain*60));
            }
        }
        /*
        int H = sc.nextInt(), M = sc.nextInt();
        int timer = sc.nextInt();
        sc.close();

        // timer를 시간과 분으로 분해하여
        // H값과 M값에 더해준다.
        H += timer / 60;
        M += timer % 60;

        // 분값 보정
        if (M >= 60) {
            H++;
            M -= 60;
        }

        // 시간값 보정
        if (H >= 24) {
            H -= 24;
        }

        System.out.printf("%d %d\n", H, M);

         */
    }
}
