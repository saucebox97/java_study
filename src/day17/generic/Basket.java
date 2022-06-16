package day17.generic;

public class Basket<F extends Fruit> { // extends Fruit를하면 Fruit를 implements 한거만 쓸수있다

    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
