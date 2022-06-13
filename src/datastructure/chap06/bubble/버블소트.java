package datastructure.chap06.bubble;

import java.util.Scanner;

public class 버블소트 {

    public static void sort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {

            int count = 0;
            for (int j = 1; j < i; j++) { // 왼쪽이 크면 자리바꿈
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);


    }

}
