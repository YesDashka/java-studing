package practic.exceptions.task2;

import java.util.Scanner;

public class Symbol {
    private String str;
    public String getStr() throws SymbolException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = scanner.nextLine();
        char[] chars = str.toCharArray();
        for (char c: chars){
            if(Character.isDigit(c)){
                throw new SymbolException("A string contains a number");
            }
        }
        return str;
    }
}
