package array;

/**
 * @author Karl Jin
 * @create 2019-05-20 18:08
 */

public interface IArray {

    /**
     * 插入一个元素
     *
     * @param element
     */
    public void add(Object element);

    /**
     * 根据下标，获取一个元素
     *
     * @param index
     * @return
     */
    public Object get(int index);

    /**
     * 根据下标，删除元素
     * @param index
     * @return
     */
    public Object delete(int index);

    /**
     * 返回数组长度
     *
     * @return
     */
    public int size();

    /**
     * 遍历输出数组
     */
    public void traverse();
}
