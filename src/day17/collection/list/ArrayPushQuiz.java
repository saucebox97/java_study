package day17.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void main(String[] args) {

//        String[] foodList = {};
        List<String> sList = new ArrayList<>();
        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.printf(">> ");
            String food = sc.nextLine();

            if (food.equals("그만")) break;

            sList.add(food);


        }// end while
        System.out.println(sList);

    }
}
