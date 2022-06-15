package day16.api.wrapper;

public class Wrapper {

    public static void main(String[] args) {

        Object[] arr = {10, 2.2};

        Integer n = 10; // 오토 박싱 정수관리할때 초기값 null 할려면 Wrapper 클래스 Integer
        String s = "zzz"; // 그게아니면 기본값 int 등
//        int m = n.intValue(); // 오토 언박싱이지원해서 왼쪽처럼안하고 12줄처럼해도됌
        int m = n; // 오토언박싱 ex) int 는 null 못받음 int 초기값 0 integer 초기값 null

        System.out.println(Integer.MAX_VALUE);
    }
}
