package link;

/**
 * 链表元素
 *
 * @author Karl Jin
 * @create 2019-05-22 10:44
 */
public class Node {
    private Object data;
    private Node next;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
