package practic.polymorphism_oop;

public class TomasEdisonPhone extends AbstractPhone{
    public TomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("turn the knob");
        System.out.println("Please provide subscriber number");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Phone rings");

    }
}
