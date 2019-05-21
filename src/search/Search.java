package search;

/**
 * 假设元素都不重复
 * <p>
 * 1、线性查找
 * 2、二分查找 --要求有序
 *
 * @author Karl Jin
 * @create 2019-05-20 19:01
 */

public class Search {

    /**
     * 线性查找
     *
     * @param value
     * @return
     */
    public static int lineSearch(int value, int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * 二分查找
     *
     * @param value
     * @return
     */
    public static int binarySearch(int value, int[] array) {
        int start = 0;
        int end = array.length - 1;
        int middle = 0;
        while (start <= end) {
            middle = (start + end) / 2;// 中间值 每次循环都需要重新赋值
            if (value == array[middle]) {
                return middle;
            } else if (value < array[middle]) {
                end = middle - 1;// 如果当前值小于中间值  那么中间值减1 作为end
            } else if (value > array[middle]) {
                start = middle + 1;// 如果当前值大于中间值 那么中间值加1 作为start
            }
        }
        return -1;// 不存在则返回 -1
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int index1 = lineSearch(5, array);
        System.out.println("index1 = " + index1);
        int index2 = binarySearch(5, array);
        System.out.println("index2 = " + index1);
    }
}
