package BAEJOON;
import java.util.Scanner;

public class Quiz13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int total1 = first*(second%10);
        int total2 = (first*((second%100)/10));
        int total3 = first*(second/100);
        int total4 = first*second;

        System.out.printf("%d\n", total1);
        System.out.printf("%d\n", total2);
        System.out.printf("%d\n", total3);
        System.out.printf("%d\n", total4);

    }
}
