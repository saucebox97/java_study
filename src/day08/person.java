package day08; // 지우면 컴파일 안됌

public class person {

    String name;
    int age;

    person(String pName) {
        name = pName;
        if (name.equals("바보")) {
            return;
        }
        System.out.println("zzz");
    }

    void sleep() {}
}
