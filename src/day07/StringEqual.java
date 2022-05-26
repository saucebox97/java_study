package day07;

import java.util.Scanner;

public class StringEqual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = new String("가나다");
        String str2 = sc.next();
        sc.close();

        if (str1 .equals(str2)) { // ==은 주소를비교하기떄문에 안됌 .equals은 인덱스를 다비교함
            System.out.println("두 문자열이 일치함");
        } else {
            System.out.println("두 문자열이 일치하지 않음");
        }

    }
}

