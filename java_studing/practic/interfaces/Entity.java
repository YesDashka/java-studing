package practic.interfaces;

public abstract class Entity {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public abstract void walk();
}
