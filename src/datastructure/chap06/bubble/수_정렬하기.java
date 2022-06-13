package datastructure.chap06.bubble;

import java.util.Arrays;
import java.util.Scanner;

public class 수_정렬하기 {

    public static void sort(int[] arr) {
        // 비교 범위에 대한
        for (int i = arr.length - 1; i > 0; i--) {
            // 실제 비교
            boolean flag = false; // if문을 통과하면 true로 변경
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) { // 왼쪽이 더크면 자리바꿈
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break; // swap이 한번도 일어나지 않았다면
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int[] arr = new int[input];

        for(int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr); // 버블정렬

        for (int i = 0; i < input; i++) {
            System.out.println(arr[i]);
        }


    }
}
