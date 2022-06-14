package day15.exception;

public class AccMain {

    public static void main(String[] args) {

        Account acc = new Account();
        try {
            acc.withdraw(10000);
        } catch (BalancelnsufficienException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
