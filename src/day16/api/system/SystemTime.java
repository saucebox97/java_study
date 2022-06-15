package day16.api.system;

import datastructure.chap02.linkedlist.doubly.SentinelNode;
import datastructure.chap06.bubble.BubbleSort;
import datastructure.chap06.insertion.InsertionSort;
import datastructure.chap06.selection.SelectionSort;
import datastructure.chap07.radix.RadixSort;
import utility.Util;

import java.util.Arrays;
import java.util.Date;

public class SystemTime {

    public static void main(String[] args) {
        
        // 현재 시간 읽기
        // 유닉스 시간 : 1970년 1월 1일 00시를 기준으로 현재까지 지나온 시간을 초로 표현
        long now = System.currentTimeMillis();
        System.out.println("now = " + now);

        Date date = new Date(now + (5*24*60*60*1000)); // 날짜 응용 현재시간에서5일뒤
        System.out.println("date = " + date);

        Util.line();

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

        // 정렬 알고리즘 시간 테스트
        long s = System.currentTimeMillis();

//        BubbleSort.sort(arr); // 버블 정렬 : 4초
//        SelectionSort.sort(arr); // 선택 정렬 : 3.8초
//        InsertionSort.sort(arr); // 삽입 정렬 : 1.8초
//        RadixSort.sort(arr); // 기수 정렬 : 0.087초
        Arrays.sort(arr); // 퀵 정렬 : 0.005초

        long e = System.currentTimeMillis();

        System.out.println((e - s) + "ms");

    }
}
