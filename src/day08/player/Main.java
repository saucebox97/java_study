package day08.player;

public class Main {

    public static void main(String[] args) {

        Player park = new Player("박찬호", 1, 50);
        Player kim = new Player("김철수", 1, 50);
//        System.out.println("kim = " + kim);
//        System.out.println("park = " + park);

        kim.attack(kim);

        // 굳이 밑에 2개처럼 표현하지않는다 표현은된다다
//       kim.attack(new Player("냥냥이", 10, 200));
//        new Player("멍멍이", 10, 300).attack(kim);

//        park.attack(kim);
//        kim.attack(park);



    }
}
