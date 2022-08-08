package practic.exceptions.task2;

public class Main {
    public static void main(String[] args) {
        Symbol symbol = new Symbol();
        try {
            System.out.println(symbol.getStr());
        } catch (SymbolException e) {
            System.err.println(e.getMessage());
        }
    }
}
