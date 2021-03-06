package day02;

public class Casting3 {
    public static void main(String[] args) {

        // 타입이 다른 데이터의 연산에서는
        // 작은 쪽을 큰쪽으로 변환한 후 연산을 진행
        int a = 10;
        short b = 30;
        int c = a + b;

        // 문자열 + 숫자 = 문자열
        // 단일문자 + 숫자 = 숫자
        char d = 'A';
        int e = 2;
        System.out.println(d + e);

        char f = (char) (d + e);
        System.out.println("f = " + f);

        System.out.println(3.0 + 5);

        /*
            int보다 작은 데이터(byte, shart, char)
            끼리의 연산은 결과가 자동으로
            int로 변환되어 처리
            (스택 오버플로우, 언더플로우 방지)
         */
        byte b1 = 100;
        byte b2 = 120;

        int result = b1 + b2;

        System.out.println('A' + 'B'); // 131 ''는 문자 char
        System.out.println("A" + "B"); // AB ""는 문자열 string

        int x = 3;
        int y = ++x + 5 * 3; // 4 + 15 = 19
        int z = 5 * y-- + x++ - --y; // 94 +
        System.out.println(z);
        }

}

