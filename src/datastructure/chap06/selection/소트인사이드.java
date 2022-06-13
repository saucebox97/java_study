package datastructure.chap06.selection;

import java.util.Arrays;
import java.util.Scanner;

public class 소트인사이드 {

    public static void sort(int[] arr) {

        // swap대상을 타겟팅하는 루프
        for (int i = 0; i < arr.length - 1; i++) { // arr.length - 1 마지막은할필요가없기떄문
            // 최대값 탐색
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j; // 최대값 인덱스 갱신
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        int temp=N;

        while(temp>0) {
            temp /= 10;
            count++;
        }

        int[] arr = new int[count];

        int i = 0;

        while (N > 0) {
            arr[i] = N % 10;
            N /= 10;
            i++;
        }

        System.out.println("정렬 후: " + Arrays.toString(arr));

        sort(arr); // 버블정렬

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }

        /*
        int[] A = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt("" + str.charAt(i));
        }

        for (int i = 0; i < A.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] > A[max]) {
                    max = j;
                }
            }
            int temp = A[i];
            A[i] = A[max];
            A[max] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }

         */

    }
}
