package datastructure.chap07.radix;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {

    // radix sort
    public static void sort(int[] arr) {

        // 최대 자리수 구하기
        int digit = 0;
        for (int n : arr) {
            int len = String.valueOf(n).length(); // 자리수 세기
            if (len > digit) {
                digit = len;
            }
        }

        // 각 자리수 숫자에 맞는 큐 10개 생성
        Queue<Integer>[] queues = new Queue[10];
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new LinkedList<>();
        }

        /*
            1회차 루프(i==0)에서는 각 숫자의 1의 자리수를 뽑아서
            위치에 맞는 큐에 삽입해야함.

            2회차 루프(i==1)에서는 각 숫자의 10의 자리수를 뽑아서
            위치에 맞는 큐에 삽입해야함.

            3회차 루프(i==2)에서는 각 숫자의 100의 자리수를 뽑아서
            위치에 맞는 큐에 삽입해야함.
         */

        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < arr.length; j++) {
            /*
                i = 0 일떄는 1의자리수 뽑기
                i = 1 일때는 10의 자리수 뽑기
                i = 2 일때는 100의 자리수 뽑기

                예를 들어 753이면 i = 0일 때는 3을 뽑아야 함
                예를 들어 753이면 i = 1일 때는 5을 뽑아야 함
                예를 들어 753이면 i = 2일 때는 7을 뽑아야 함

                753 / 10^0 % 10 ==> 3
                753 / 10^1 % 10 ==> 5
                753 / 100^2 % 10 ==> 7

                target / 10^1 % 10
             */
                int n = arr[j] / (int)Math.pow(10, i) % 10; // Math.pow는 double , 10^i

                // 해당 자리수에 맞는 큐에 저장
                queues[n].add(arr[j]);
            }// end inner for (arr)

            // 큐에서 순서대로 poll하여 배열에 다시 저장
            int k = 0; // 배열 저장 위치 인덱스
            for (Queue<Integer> q : queues) {
                while (!q.isEmpty()) {
                    arr[k++] = q.poll(); // 빼고 넣는다
                }
            }

        }// end outer for (digit)

    }

    public static void main(String[] args) {

        // 기수정렬은 음수가없어야됌
        // 물론할순있음 양수 음수따로만들고 음수를 절대값으로만들고 정렬하고
        // 리버스하고 마이너스만들고 음수 양수 합치면됌 근데 이럴거면 그냥 퀵쓰는게좋음
        int[] arr = {753, 427, 450, 422, 220, 125, 332, 339, 1990, 660};

        sort(arr);

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}
