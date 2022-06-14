package day15.exception;

public class Main {

    public static void main(String[] args) { // 메인에서 throws 하면안됌 바로 터짐

        try {
            int n = EasyScanner.inputInteger("정수: ");
            double v = EasyScanner.inputFloat("실수: ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
