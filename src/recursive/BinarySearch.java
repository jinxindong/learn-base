package recursive;

/**
 * 递归方式实现二分查找
 *
 * @author Karl Jin
 * @create 2019-05-21 08:08
 */

public class BinarySearch {

    /**
     * 递归查找函数
     *
     * @param array    数组
     * @param start    开始坐标
     * @param end      结束坐标
     * @param keyValue 目标值
     * @return
     */
    public static int binarySearch(int[] array, int start, int end, int keyValue) {
        // 开始坐标小于等于结束坐标时才开始执行 否则直接返回-1
        if (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] == keyValue) {// 递归退出条件
                return middle;
            }
            if (keyValue < array[middle]) {
                return binarySearch(array, start, middle - 1, keyValue);
            } else if (keyValue > array[middle]) {
                return binarySearch(array, middle + 1, end, keyValue);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 9};
        int index1 = binarySearch(array, 0, 6, 5);
        System.out.println("index1 = " + index1);
    }
}
