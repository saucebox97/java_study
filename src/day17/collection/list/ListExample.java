package day17.collection.list;

import utility.Util;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {


        // 배열 리스트 생성- ArrayList 는 초기 생성시 10개 공간이 주어지고
        // 데이터 추가시 동적으로 늘어남 삽입과 삭제가 많다면 ArrayList는 비효율적
        // 무언가를 삭제할때 나머지 뒤의 데이터를 한칸씩 이동해야함
        List<String> sList = new ArrayList<>(); // 인터페이스는 객체 생성 불가 임플먼트하고있는걸 써야함

        // add(E e) : 리스트의 맨 끝에 객체를 추가
        // 리스트계열은 중복데이터 저장이 가능
        sList.add("멍멍이");
        sList.add("야옹이");
        sList.add("짹짹이");
        sList.add("두깝이");
        sList.add("개굴이");
        sList.add("야옹이");

        System.out.println(sList); //println 은  sList.toString() .toString()생략가능

        // size(): 저장된 객체의 수 리턴
        int size = sList.size();
        System.out.println("size = " + size);

        // add(int index, E e) : 데이터 중간 삽입
        sList.add(2,"어흥이");
        System.out.println(sList); // 실제로 뒤로 밀어서 속도가느림 장점은 탐색이빠름 자료가붙어있어서

        // set(index, obj) : 객체 수정
        sList.set(3, "메롱이");
        System.out.println(sList);

        // remove(index), remove(obj) : 객체 삭제
        sList.remove(1);
        sList.remove("개굴이");
        System.out.println(sList);

        // get(index) : 객체 참조
        String s = sList.get(2); // 처음에 제너릭 타입을 String이라해서 String
        System.out.println(s); // pop개념이 아닌 peek 개념
        
        // indexOf(obj) : 저장된 객체의 인덱스를 리턴, 없으면 -1
        int idx = sList.indexOf("어흥이");
        System.out.println("idx = " + idx);

        // contains(obj): 객체의 저장 유무 확인
        boolean flag = sList.contains("두깝이");
        System.out.println("flag = " + flag);

        // list의 투표 처리
        Util.line();

        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

        Util.line();

        for (String ss : sList) {
            System.out.println(ss);
        }

        // clear() : 리스트 내부 전체 삭제
        sList.clear();
        System.out.println(sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty());

        // 초기값을 가진 리스트 생성
        // ex ) int[] arr = {1, 2, 3}
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 20, 30,5, 8, 56, 2)
        );
        System.out.println(numbers);

//        Integer[] objects = (Integer[]) numbers.toArray(); 굳이쓸필요없다

        // 오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        // 2차원 리스트
        List<List<Integer>> list2d = new ArrayList<>();
        // 2차원 리스트에 1차원 리스트를 추가
        list2d.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
        list2d.add(new ArrayList<>(Arrays.asList(40, 50, 60)));
        list2d.add(new ArrayList<>(Arrays.asList(70, 80, 90)));

        // 2차원 리스트 1번째 1차원리스트에 정수 추가
//        list2d.get(0).add(10);
//        list2d.get(0).add(20);
//        list2d.get(0).add(30);

        Util.line();

        for (List<Integer> list : list2d) {
            for (int n : list) {
                System.out.printf("%d ", n);
            }
            System.out.println();
        }


    }
}
