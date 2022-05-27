package BAEJOON;
import java.util.Scanner;

public class Quiz9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int add = A + B;
        int minus = A - B;
        int multiply = A * B;
        int division = A / B;
        int remain = A % B;

        System.out.println(add);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(division);
        System.out.println(remain);

    }
}
