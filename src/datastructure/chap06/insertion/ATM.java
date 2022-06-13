package datastructure.chap06.insertion;

import java.util.Scanner;

public class ATM {

    public static void sort(int[] arr) {
        // 삽입할 항목 타겟팅 루프
        for (int i = 1; i < arr.length; i++) { // 0번은 왼쪽하고비교할수없기에 1번부터
            // 삽입할 항목 빼놓기
            int temp = arr[i];

            int j = i; // 삽입할 위치 인덱스
            // 삽입할 위치 탐색
            // 삽입할 항목보다 큰 값들은 오른쪽으로 이동
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp; // 삽입할 위치에 삽입
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr); // 삽입정렬

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }

        int prev = 0;	// 이전까지의 대기시간 누적합
        int sum = 0;	// 사람별 대기시간 총합

        for(int i = 0; i < N; i++) {
            // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
            sum += prev + arr[i];

            // 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
            prev += arr[i];
        }
        System.out.println("\n" + sum);

        /*
        int[] A = new int[N]; // 수를 저장할 배열
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 삽입 정렬
        for (int i = 1; i < N; i++) {
            int temp = A[i];

            int j = i;
            while (j > 0 && A[j - 1] >= temp) {
                A[j] = A[j - 1];
                j--;
            }
            A[j] = temp;
        }

        // 구간 합배열 생성
        int[] S = new int[N + 1];

        for (int i = 1; i < S.length; i++) {
            S[i] = S[i - 1] + A[i - 1];
        }

        // 합배열 총합 구하기
        int total = 0;
        for (int i = 1; i < S.length; i++) {
            total += S[i];
        }
        System.out.println(total);

         */
    }
}
