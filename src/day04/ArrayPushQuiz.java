package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void main(String[] args) {

        String[] foodList = new String[0];
//        String[] foodList = {};
        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf(">> ");
            String food = sc.nextLine();

            if (food.equals("그만")) break;

            String[] copy = new String[foodList.length + 1];

            for (int i = 0; i < foodList.length; i++) {
                copy[i] = foodList[i];
            }

            copy[copy.length-1] = food;

            foodList = copy;
        }// end while
        System.out.printf("%s", Arrays.toString(foodList));
    }
}
