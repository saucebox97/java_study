package datastructure.chap05.solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.System.in;

public class 카드2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);

        int input = sc.nextInt();
        sc.close();
        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= input; i++) {
            que.add(i);
        }

        while (que.size() != 1) {
            que.poll();
            que.add(que.poll());
        }
        System.out.println(que.poll());
    }
}
