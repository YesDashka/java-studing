package practic.static_methods;

public class Cat {
    String name;
    static int catCount;
    Cat(String name){
        this.name = name;
        Cat.catCount++;

    }

    @Override
    public String toString() {
        return name;
    }
}