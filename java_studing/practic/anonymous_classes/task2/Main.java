package practic.anonymous_classes.task2;

public class Main {
    public static void main(String[] args) {
        Operation sum = new Operation() {
            @Override
            public int GetResult(int a, int b) {
                return a + b;
            }
        };
        Operation mult = new Operation() {
            @Override
            public int GetResult(int a, int b) {
                return a * b;
            }
        };
        Operation power = new Operation() {
            @Override
            public int GetResult(int a, int b) {
                int res = 1;
                for (int i = 1; i <= b; i++){
                    res *= a;
                }
                return res;
            }
        };
        System.out.println(sum.GetResult(2, 3));
        System.out.println(mult.GetResult(2, 3));
        System.out.println(power.GetResult(2, 3));
    }
}
