package day03;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        int i = 1;
        int j = 1;
        int k = 1;
        char star = '*';
        for (i= 1; i<=5; i++) {
            for (j=1; j<=k; j++) {
                System.out.printf("%c", star);
            }
            k++;
            System.out.printf("\n");
        }*/
        /*
        int i = 1;
        int j = 1;
        int k = 5;
        char star = '*';
        for (i= 1; i<=5; i++) {
            for (j=1; j<=k; j++) {
                System.out.printf("%c", star);
            }
            k--;
            System.out.printf("\n");
        }*//*
        int i = 1;
        int j = 1;
        int k = 5;
        char star = '*';
        for (i= 1; i<=5; i++) {
            for (j=1; j<k; j++) {
                System.out.print(" ");
            }
            for (j=1; j<=6-k; j++) {
                System.out.printf("%c", star);
            }
            k--;
            System.out.printf("\n");
        }*//*
        int i = 1;
        int j = 1;
        int k = 5;
        char star = '*';
        for (i= 1; i<=5; i++) {
            for (j=5; j>k; j--) {
                System.out.print(" ");
            }
            for (j=1; j<=k; j++) {
                System.out.printf("%c", star);
            }
            k--;
            System.out.printf("\n");
        }*//*
        int i = 1;
        int j = 1;
        int k = 8;
        int m = 5;
        char star = '*';
        for (i = 1; i <= 5; i++) {
            for (j = 1; j < m; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 9 - k; j++) {
                System.out.printf("%c", star);
            }
            for (j = 1; j < m; j++) {
                System.out.print(" ");
            }
            m--;
            k--;
            k--;
            System.out.printf("\n");
        }*/
        int i = 1;
        int j = 1;
        int k = 0;
        int m = 5;
        char star = '*';
        for (i = 1; i <= 5; i++) {
            for (j = 5; j > m; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 9 - k; j++) {
                System.out.printf("%c", star);
            }
            for (j = 5; j > m; j--) {
                System.out.print(" ");
            }
            m--;
            k++;
            k++;
            System.out.printf("\n");
        }
    }
}
