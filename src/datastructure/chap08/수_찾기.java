package datastructure.chap08;

import java.util.Arrays;
import java.util.Scanner;

public class 수_찾기 {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        int mid;

        while(left <= right) {

            mid = (left+right) / 2;

            if (arr[mid] == target) {
                return 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int M = sc.nextInt();

        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            System.out.println(binarySearch(arr, arr2[i]));
        }

    }
}
