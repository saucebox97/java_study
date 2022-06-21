package datastructure.chap09;

import java.util.Arrays;
import java.util.Scanner;

// 백준 11047
public class 그리디01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int count = 0;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        for (int i = N-1 ; i >= 0; i--) {
            if (target >= arr[i]) {
                count += target / arr[i];
                target = target % arr[i];
            }

            else if (target == 0) break;
        }

        System.out.println(count);

        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //동전의 개수
        int K = sc.nextInt(); //목표 액수

        //동전을 담을 자료구조
        Stack<Integer> A = new Stack<>();
        for (int i = 0; i < N; i++) {
            A.push(sc.nextInt());
        }
        sc.close();

        int count = 0; // 동전의 수
        while (!A.isEmpty()) {
            int coinAmt = A.pop(); // 꼭대기 동전부터 추출
            if (coinAmt <= K) {
                count += (K / coinAmt); // 동전 개수 누적
                K %= coinAmt; // 잔액 갱신
            }

            if (K == 0) break;
        }
        System.out.println(count);

         */

    }
}
