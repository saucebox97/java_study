package day16.api.String;

import utility.Util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {

    public static void main(String[] args) {

        String s = "1 2 3 4";
        // 문자열 쪼개기 - 1번
        String[] sArr = s.split(" ");
        int[] numbers = new int[sArr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sArr[i]);
        }
        System.out.println(Arrays.toString(sArr));

        Util.line();

        // 문자열 쪼개기 - 2번
        s = "짜장면 탕수육 볶음밥 라면 김밥";
        StringTokenizer st = new StringTokenizer(s, " ");// " "를 기준으로짜름

        String[] foods = new String[st.countTokens()];

        // st.hasMoreTokens() 토큰이존재할때까지 / 조건식은 true false 만나오면됌
        for (int i = 0; st.hasMoreTokens(); i++) {
            foods[i] = st.nextToken();
        }

        System.out.println(Arrays.toString(foods));

//        st.nextToken(); // Token 토큰 1개없앰 맨 왼쪽앞 짜장면 리턴

//        System.out.println(st.countTokens());
//        while (st.hasMoreElements()) {
//            System.out.println(st.nextToken() + " ");
//        }

        Util.line();

        long ss = System.currentTimeMillis();
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
//            str += (i+1); // String은 느리고 StringBuilder는 빠르다
            sb.append(i+1);
        }
        String sss = sb.toString();
        long ee = System.currentTimeMillis();
        System.out.println((ee-ss) + "ms");

    }
}
