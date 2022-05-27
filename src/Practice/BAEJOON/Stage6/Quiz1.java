package BAEJOON.Stage6;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0); 11,12줄을 한줄로
        String s = sc.next();
        char c = s.charAt(0);
        sc.close();
        System.out.println((int) c);

    }
}
