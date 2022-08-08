package practic.task1_robot;

public class Robot<T> {
    private Body body;
    private T head;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }
}
