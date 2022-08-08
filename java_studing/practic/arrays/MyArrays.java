package practic.arrays;

public class MyArrays {
    int[] lst = {2, 3, 4};
    public void getNum(){
        for (int i = 0; i < lst.length; i++){
            System.out.println(lst[i]);
        }
    }

    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();
        myArrays.getNum();
    }
}
