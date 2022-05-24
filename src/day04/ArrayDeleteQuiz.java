package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        Scanner sc = new Scanner(System.in);

        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(tvxq));
        System.out.println("- 삭제할 학생의 별명을 입력하세요!");
        String input;
        int idx = 0;
        loop: while (true) {
            input = sc.nextLine();
            for (int i = 0; i < tvxq.length; i++) {
                if (input.equals(tvxq[i])) {
                    idx = i;
                    break loop;
                }
            }

            System.out.printf("해당 별명(%s)은(는) 존재하지 않습니다.\n", input);
        }

        for (int i = idx; i < tvxq.length-1; i++) {
            tvxq[i] = tvxq[i+1];
        }
        // System.out.println("중간: " + Arrays.toString(tvxq));
        String[] temp = new String[tvxq.length - 1];
        for (int i = 0; i < tvxq.length-1; i++) {
            temp[i] = tvxq[i];
        }
        // System.out.println("옮김: " + Arrays.toString(temp));

        tvxq = temp; temp = null;
        System.out.printf("%s의 별명을 삭제합니다.\n" ,input);
        System.out.println("*삭제 후 정보: " + Arrays.toString(tvxq));
    }
}
