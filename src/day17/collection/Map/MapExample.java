package day17.collection.Map;

import utility.Util;

import java.util.*;

class Student {
    String name; // 이름
    int grade; // 학년

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class MapExample {

    public static void main(String[] args) {

        // Map은 키가 중복돼면안됌 값은 중복돼도 됌
        Map<String, Student> map = new HashMap<>();

        // put(k, v) : 데이터 추가
        map.put("짹짹이", new Student("김철수", 3)); // 컨트롤 p = 타입을 볼수 있다
        map.put("냥냥이", new Student("도우너", 5)); // 부를때 냥냥이로부름
        map.put("멍멍이", new Student("고길동", 1)); //

        System.out.println(map.size());
        System.out.println(map);

        // 중복된 key객체로 put을 하면 value가 수정됩니다 즉 2번쨰인 도우너가없어짐
        map.put("냥냥이", new Student("둘리", 6));
        System.out.println(map);

        // get(key) : 저장된 value 참조
        Student student = map.get("멍멍이");
        System.out.println("student = " + student);

        student.name = "빠빠빠";
        System.out.println(map);

        // containskey(key) : map에 key가 있는지 유무 확인
        Util.line();

        System.out.println(map.containsKey("꽉꽉이"));
        System.out.println(map.containsKey("짹짹이"));

        Util.line();
        // map 루프 처리
        Set<String> keySet = map.keySet();// map의 모든 키를 Set에 담아 리턴
        System.out.println(keySet);

        for (String key : keySet) { // 인터러블이없어서
            System.out.println(map.get(key));
        }

        // remove(key) : key에 해당하는 Entry 삭제
        map.remove("냥냥이");
        System.out.println(map);

        map.clear();
        System.out.println(map.isEmpty());

        // 맵에 value값으로 List를 사용하려면
        Map<String, List<Integer>> mapList = new HashMap<>();

    }
}
