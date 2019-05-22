package link;


/**
 * @author Karl Jin
 * @create 2019-05-22 10:34
 */

public class LinkList implements Link {
    public Node head;// 头节点标识

    private int size = 0;

    @Override
    public void add(Object value) {
        if (size == 0) {
            head = new Node(value);
            size++;
            return;
        }
        Node pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        Node tail = new Node(value);
        pointer.setNext(tail);
        size++;
    }

    @Override
    public void add(int index, Object value) {
        Node pointer = head;
        index--;
        for (int i = 0; pointer.getNext() != null; i++) {
            if (index + 1 == i) {
                Node temp = pointer.getNext().getNext();
                Node node = new Node(value);
                pointer.setNext(node);
                node.setNext(temp);
            }
        }
        size++;
    }

    @Override
    public Object delete(int index) {
        Node result = null;
        Node pointer = head;
        index--;
        for (int i = 1; pointer.getNext() != null; i++) {
            if (index + 1 == i) {
                result = pointer.getNext();
                Node temp = pointer.getNext().getNext();
                pointer.setNext(temp);
                break;
            }
        }
        size--;
        return result.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void traverse(Node header) {
        Node pointer = header;
        while (pointer.getNext() != null) {
            System.out.println("data=" + pointer.getData());
            pointer = pointer.getNext();
        }
        System.out.println("data=" + pointer.getData());
    }

    @Override
    public Node reversal(Node head) {
        // 递归实现  这是递归退出条件  在最后一个节点返回
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node pointer = head.getNext();// 获取指针变量
        // 两个节点间互换
        Node newHead = reversal(head.getNext());
        pointer.setNext(head);
        head.setNext(null);
        return newHead;
    }

    @Override
    public Node reversalList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        Node head = new Node(15);
        linkList.add(head);

        Node node1 = new Node(11);
        Node node2 = new Node(16);
        Node node3 = new Node(25);
        linkList.add(node1);
        linkList.add(node2);
        linkList.add(node3);

        linkList.traverse(linkList.head);
        System.out.println("=====");
        //Node node = linkList.reversal(linkList.head);
        //System.out.println("node = " + node.getData().toString());
        //System.out.println("=====");
        //linkList.traverse(node);
        System.out.println("=====");

        Node node_list = linkList.reversalList(linkList.head);
        linkList.traverse(node_list);

    }
}
