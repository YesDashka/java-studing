package practic.object_cloning;

public class PollySheet implements Cloneable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}