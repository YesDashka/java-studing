package practic.static_methods;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Ed");
        Cat cat3 = new Cat("Jo");
        System.out.println(Cat.catCount);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

    }
}