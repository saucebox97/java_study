package day09.objarr;

public class Person {

    String name; // 이름
    int money; // 현재 소유한 현금
    // 통장 정보 - 통장은 1개만 소유할 수 있다 가정
    Account myAccount;

    // 생성자
    Person(String name) {
        this.name = name;
        this.money = 0;
        this.myAccount = null;
    }

    // 계좌 개설 기능
    void makeAccount(Bank bank) {
        // 신규 계좌 생성
        this.myAccount = new Account(this); // 내 정보를 줘야됌
        // 신규 계좌의 은행명 필드 초기화
        myAccount.bankName = bank.bankName;
        // 은행에 계좌정보 등록
        bank.registry(myAccount);
        System.out.printf("%s은행에 %s님의 계좌가신설되었습니다. \n"
        , bank.bankName, this.name);
    }

    // 임금 기능
    void deposit(int depositMoney) {
        if (money >= depositMoney) {
            // 내 통장 잔액 증가
            myAccount.balance += depositMoney;
            // 내 현금 잔액 감소
            this.money -= depositMoney;
            System.out.printf("%s은행 계좌에 %d원이 입금되었습니다 \n"
            , myAccount.bankName, depositMoney);
        } else {
            System.out.printf("임금 실패! 소지금이 %d원 더필요합니다 \n"
            , depositMoney - this.money);
        }
    }

    // 계좌 이체 기능
    void sendMoney(Person target, int money) {
        if (this.myAccount.balance >= money) {
            // 상대방의 예금잔액이 이채액만큼 증가
            target.myAccount.balance += money;
            // 나의 예끔잔액이 이자액만큼 감소
            this.myAccount.balance -= money;
            System.out.printf("%s님이 %s님에게 %d원을 송금했습니다.\n"
            , this.name, target.name, money);
        } else {
            System.out.println("계좌 이체 실패 - 잔액 부족!");
        }
    }

    // 잔액 조회 기능
    void checkBalance() {
        System.out.printf("%s님의 현재 예금 잔액은 %d원입니다.\n"
        , this.name, this.myAccount.balance);
    }
}
