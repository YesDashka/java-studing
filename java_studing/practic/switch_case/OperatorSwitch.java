package practic.switch_case;

public class OperatorSwitch {
    final int num1 = 3, num2 = 2, value1 = 1, value2 = 2, value3 = 3;
    public void foo(){
        //оператор множественного выбора
        //работает с константами(обозначаем как final) типов byte, int, char, short, enum, String
        //выполняються все case, начиная с подходящего, для того чтобы такого не было, используют break
        switch (num1 - num2){
            case value1:
                System.out.println("hello");
                break;
            case value2:
                System.out.println("world");
                break;
            case value3:
                System.out.println("OK");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
