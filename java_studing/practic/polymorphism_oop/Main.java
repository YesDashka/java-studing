package practic.polymorphism_oop;

public class Main {
    public static void main(String[] args) {
        AbstractPhone firstphone = new TomasEdisonPhone(1984);
        AbstractPhone videophone = new VideoPhone(2010);
        User user = new User("Dasha");
        user.CallAnotherPhone(2234, firstphone);
        System.out.println("");
        user.CallAnotherPhone(34221, videophone);
    }
}
