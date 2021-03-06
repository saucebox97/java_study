package day17.collection.set;

import utility.Util;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        // Set: 중복 저장을 허용하지 않는다. 데이터 삽입속도가 빠름 순서없이 저장
        Set<String> set = new HashSet(); // 정렬이필요할때 TreeSet

        // add(E e) : 객체 추가
        set.add("김말이");
        set.add("닭꼬치");
        set.add("단무지");
        boolean b1 = set.add("김말이");
        boolean b2 = set.add("김밥");

        System.out.println(set.size());
        System.out.println(set); // toString 생략가능 순서없이 데이터저장
        System.out.println("b1 = " + b1); // set.add는 boolean이고 김말이는 실패
        System.out.println("b2 = " + b2); // 김밥은 성공했다

        // set의 루프 처리
        Util.line();

        for (String s : set) { // iteralbe 를 상속받아야 : 문법을사용할수있다
            System.out.println(s);
        }

        // remove(obj) : 객체 삭제
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());


        List<Integer> numberList = new ArrayList<>(
                Arrays.asList(2,2,2,4,5,5,6,6,6,9,9));
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        numberList.clear();
        numberList.addAll(numberSet);

        System.out.println(numberSet);

    }
}
