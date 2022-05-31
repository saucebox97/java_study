package day10.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜저");
//        myCar.speed = 30000;
        myCar.setSpeed(150);

        System.out.println("현재속도: " + myCar.getSpeed());

        myCar.setMode('N');

        System.out.println("현재 모드: " + myCar.getMode());
    }
}
