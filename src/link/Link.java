package link;

/**
 * 链表抽象数据类型
 *
 * @author Karl Jin
 * @create 2019-05-22 10:33
 */

public interface Link {
    /**
     * 末尾从插入一个元素
     *
     * @param value
     */
    public void add(Object value);

    /**
     * 指定位置插入元素
     *
     * @param index
     * @param value
     */
    public void add(int index, Object value);

    /**
     * 删除指定位置的元素
     *
     * @param index
     * @return
     */
    public Object delete(int index);

    /**
     * 返回链表长度
     *
     * @return
     */
    public int size();

    /**
     * 遍历链表
     */
    public void traverse(Node header);

    /**
     * 单项链表反转 递归实现
     *
     * 获取到新的头结点
     * @param head
     * @return
     */
    public Node reversal(Node head);

    /**
     * 单向链表反转 普通方法实现
     *
     * @param head
     * @return
     */
    public Node reversalList(Node head);
}
