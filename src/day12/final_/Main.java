package day12.final_;

public class Main {

    public static void main(String[] args) {

        Korean park = new Korean("박철수", "991111-1122334");
        Korean kim = new Korean("김영희", "880202-2020202");
        Korean kim2 = new Korean("김일희", "880202-2020202");
        Korean kim3 = new Korean("김이희", "880202-2020202");

        park.name = "박찬호";
//        kim.id = "882020-2222222";
//        kim.nation = "중국";

        System.out.println(park);
        System.out.println(kim);
        System.out.println(kim2);
        System.out.println(kim3);
    }
}
