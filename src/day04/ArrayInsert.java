package day04;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {50, 150, 200, 250, 300};
        //   temp = {  ,    ,    ,    ,    ,    };
        int newNumber = 100; // 신규 삽입데이터
        int targetIdx = 1; // 삽입 위치
        // 1. 사이즈 1 더 큰 배열 생성
        int[] temp = new int[arr.length + 1];
        // 2. 기존 데이터 전부 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        System.out.println("생성:" + Arrays.toString(temp));
        // temp = {50, 150, 200, 250, 300, 0};
       for (int i = 1; i < temp.length-1; i++) {
            temp[temp.length-i] = temp[temp.length-i-1];
       }
        System.out.println("땡김:" + Arrays.toString(temp));
        for (int i = 0; i < temp.length-1; i++) {
            temp[targetIdx] = newNumber;
        }
        System.out.println("삽입:" + Arrays.toString(temp));
        arr = temp; temp =null;
        System.out.println("최종:" + Arrays.toString(arr));
    }
}
