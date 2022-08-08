package practic.task1_robot;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Robot<SmallHead> robot = new Robot<SmallHead>(body, smallHead);
        robot.getHead().turn();
    }
}
