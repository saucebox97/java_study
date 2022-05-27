package BAEJOON.stage5;

import java.util.Arrays;

public class Quiz2 {

    static int d(int number) {
        int sum = number;

        while (number > 0) {
            sum = sum + (number % 10);
            number = number/10;
        }
        return sum;
    }

    public static void main(String[] args) {

        boolean[] check = new boolean[10000]; //0~9999 boolean의처음은 false

        for (int i = 1; i < check.length; i++) {
            int n = d(i);
            if (n < check.length){
                check[n] = true; // 셀프넘버가아닌것을 true로 한다
            }
        }

        // 셀프넘버 출력
        for (int i = 1; i < check.length; i++) {
            if (!check[i]) {	// false 인 인덱스만 출력
                System.out.printf("%d\n",i + 1);
            }
        }
        /*
        boolean[] proofs = new boolean[10000];

        for (int i = 1; i <= proofs.length; i++) {
            int d1 = d(i);
            if (d1 <= proofs.length) {
                proofs[d1 - 1] = true;
            }
        }

        // 셀프넘버 출력
        for (int i = 0; i < proofs.length; i++) {
            if (!proofs[i]) {
                System.out.println(i + 1);
            }
        }

        */
    }
}




