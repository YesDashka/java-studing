package practic.polymorphism_oop;

public class VideoPhone extends AbstractPhone{

    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("connecting a video channel for a subscriber " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("You have an incoming video call... " + inputNumber);

    }
}
