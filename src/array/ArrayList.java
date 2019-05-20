package array;

/**
 * 数组在内存中是一段连续的内存
 * 且长度在一开始的时候就已经定好。
 * <p>
 * 因此涉及增删元素时，因为长度和连续问题，必须要重新开辟内存空间。
 *
 * @author Karl Jin
 * @create 2019-05-20 18:12
 */

public class ArrayList implements IArray {
    private Object[] elements;

    public ArrayList() {
        this.elements = new Object[0];
    }


    @Override
    /**
     * new一个长度加1的新数组，讲老数组的元素拷贝到新数组中
     */
    public void add(Object element) {
        Object[] newElements = new Object[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = element;
        elements = newElements;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    /**
     * new一个新的数组，讲删除后的元素拷贝到新数组中
     */
    public Object delete(int index) {
        Object delObj = null;
        Object[] newElements = new Object[elements.length - 1];
        for (int i = 0, j = 0; i < elements.length; i++, j++) {
            if (index == i) {
                delObj = elements[i];
                j--;
                continue;
            }
            newElements[j] = elements[i];
        }
        elements = newElements;
        return delObj;
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public void traverse() {
        for (Object object : elements) {
            System.out.println("object value = " + object.toString());
        }
    }


    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(51);
        arrayList.add(23);
        arrayList.add(66);
        Object o1 = arrayList.get(0);
        System.out.println("get = " + o1);
        Object o = arrayList.delete(3);
        System.out.println("delete = " + o);
        int size = arrayList.size();
        System.out.println("size = " + size);
        arrayList.traverse();


    }
}
