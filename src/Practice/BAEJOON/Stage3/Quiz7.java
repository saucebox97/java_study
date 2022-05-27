package BAEJOON.Stage3;

import java.util.Scanner;

public class Quiz7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int m = j;
        while (j>0) {
            int i = sc.nextInt();
            int k = sc.nextInt();
            System.out.printf("Case #%d: %d\n", m-(j-1) , i+k);
            j--;
        }
    }
}
