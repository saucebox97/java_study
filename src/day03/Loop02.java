package day03;

public class Loop02 {

    public static void main(String[] args) {
    // 이름을붙이는것을 label 기능이라한다 apple은 라벨
        apple: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                if (lower == 'f') break apple;
                System.out.printf("%c + %c\n", upper, lower);
            } // inner for
        }// outer for
    }
}
