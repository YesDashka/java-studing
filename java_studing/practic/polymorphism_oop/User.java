package practic.polymorphism_oop;

public class User {
    private String name;
    public User(String name){
        this.name = name;
    }
    public void CallAnotherPhone(int number, AbstractPhone phone){
        phone.call(number);
    }
}