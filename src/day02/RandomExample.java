package day02;

public class RandomExample {

    public static void main(String[] args) {

        // 난수 생성
        // 0.0 <= ~ , 1.0
        double rn = Math.random();
        System.out.println("rn = " + rn);

        // 1이상 10이하의 랜덤 정수
        /*
            Math.random()                  -> 0.0 <= ~ < 1.0
            Math.random()  *10             -> 0.0 <= ~ < 10.0
            (int) (Math.random()  *10)     -> 0 <= ~ < 10
            (int) (Math.random()  *10) + 1 -> 1 <= ~ < 10
         */ // 대입5 형변환2    참조1       3    4 = 1나옴 단항이 이항보다빠름
        // int num = (int) Math.random() * 10 + 1;
        int num = (int) (Math.random() * 10) + 1;
        System.out.println("num = " + num);
    }

}
