package datastructure.chap05.solution;

import java.util.Scanner;
import java.util.Stack;

public class 오큰수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int input = sc.nextInt();
        int[] arr = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < input; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        // 기호를 저장할 문자열 String 대신 StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
    }
}
