package day15.exception;

// 사용자 정의 예외 클래스
public class BalancelnsufficienException extends Exception{
// extends Exception 하고 기본생성자 하고 에러메시지생성자를 생성함
    public BalancelnsufficienException() {
    }

    public BalancelnsufficienException(String message) {
        super(message);
    }
}
