package day15.exception;

public class Account {

    String owner;
    int balance; // 잔액

    //출금 기능
    public void withdraw(int money) throws BalancelnsufficienException { // 19강 8페이지 예외 떠넘기기
        if (balance < money) {
            // throw : 유발하다, 발생하다 // throw 내가 에러로 터트리겠다
            throw new BalancelnsufficienException("잔액 부족!!"); // 암묵적으로 xxxexception으로만듬
        }
        this.balance -= money;
    }
}
