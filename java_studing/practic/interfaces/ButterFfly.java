package practic.interfaces;

public class ButterFfly extends Insects implements FlyAbility{
    @Override
    public void walk() {
        System.out.println("Butterfly can walk");
    }

    @Override
    public void flyability() {
        System.out.println("Can fly");
    }
}
