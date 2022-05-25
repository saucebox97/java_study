package BAEJOON.stage5;

public class Quiz1 {

    long sum(int[] a) {
        long sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }
}
