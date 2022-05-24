package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        // 총알 있는 위치 true 없는 위치 false
        Scanner sc = new Scanner(System.in);
        System.out.print("게임 인원 (2 ~ 4명) ===> ");
        int input = sc.nextInt();
        String name;

        String[] player = new String[input];
        System.out.println("플레이어를 이름을 등록합니다.");
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%d번 플레이어 이름 : ", i+1);

            name = sc.next();
            player[i] = name;
        }

        System.out.printf("%s 참가!\n\n", Arrays.toString(player));

        System.out.print("실탄 개수 (1 ~ 5개) ==> ");
        int bullet = sc.nextInt();
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.\n");
        double rn = (int) (Math.random() * 6 ) + 1;
        int rnplay = (int) (Math.random() * input-1 );
        System.out.printf("총을 돌렸습니다. %s부터 시작합니다.\n", player[rnplay]);

        System.out.printf("[%s님의 턴!] 탄창 실린더를 무작위로 돌립니다.\n", player[rnplay]);
        System.out.println("# 엔터를 누르면 격발합니다. ");

        String shot = sc.next();


    }
}
