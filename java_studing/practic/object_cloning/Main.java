package practic.object_cloning;

public class Main {
    public static void main(String[] args) {
        PollySheet pollySheet = new PollySheet();
        PollySheet pollySheet1 = cloneObject(pollySheet);
        pollySheet.setName("Polly");
        pollySheet1.setName("Dolly");
        System.out.println(pollySheet.getName());
        System.out.println(pollySheet1.getName());
    }
    public static PollySheet cloneObject(PollySheet pollySheet2){
        PollySheet sheet = null;
        try {
            sheet = (PollySheet) pollySheet2.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return sheet;
    }
}