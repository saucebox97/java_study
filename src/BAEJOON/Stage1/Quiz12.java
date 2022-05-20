package BAEJOON;
import java.util.Scanner;

public class Quiz12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int total1 = (first+second)%third;
        int total2 = ((first%third)+(second%third))%third;
        int total3 = (first*second)%third;
        int total4 = ((first%third)*(second%third))%third;
        System.out.printf("%d\n", total1);
        System.out.printf("%d\n", total2);
        System.out.printf("%d\n", total3);
        System.out.printf("%d\n", total4);

    }
}
