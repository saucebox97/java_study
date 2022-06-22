package datastructure.chap09;

import java.util.*;

// 백준 1715
public class 그리디03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 카드 묶음 수
        PriorityQueue<Integer> cardList = new PriorityQueue<>();//우선순위큐는 자기가 들어갈곳을 비교해서 찾아들어감
        for (int i = 0; i < N; i++) {
            cardList.add(sc.nextInt());
        }

        int total = 0;
        while (cardList.size() != 1) { // 숫자 1개남을때까지
            int data1 = cardList.poll(); // poll 앞에꺼 제거하면서 값리턴
            int data2 = cardList.poll();
            total += data1 + data2;
            cardList.offer(data1 + data2); // offer 추가하면서 값 리턴 add해도됌
        }
        System.out.println(total);

    }
}