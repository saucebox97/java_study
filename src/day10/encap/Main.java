package day10.encap;

public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car("그랜저");
////        myCar.speed = 30000;
//        myCar.setSpeed(150);
//
//        System.out.println("현재속도: " + myCar.getSpeed());
//
//        myCar.setMode('N');
//
//        System.out.println("현재 모드: " + myCar.getMode());

        Car car = new Car("소나타");

        // 시동 먼저 걸고 -> 엔진오일 순환 -> 연료를 주입 -> 실린더 작동
        car.engineStart();

        car.setMode('D');
        car.setSpeed(100);
        car.setSpeed(0);


        car.engineStop();


    }
}
