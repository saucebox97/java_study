package day14.abs.pet;

import utility.Util;

public class Main {

    public static void main(String[] args) {

//        new Pet();

        Pet dog = new Dog("초코","푸욜",1);
        Pet cat = new Cat("냥냥이","러시안룰렛",2);

        dog.feed();
        dog.takeNap();

        Util.line();

        cat.feed();
        cat.takeNap();
    }
}
