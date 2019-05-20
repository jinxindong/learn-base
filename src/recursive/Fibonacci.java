package recursive;

/**
 * 斐波那契数列  递归调用练习
 * <p>
 * 斐波那契数列指的是这样一个数列   0, 1, 1, 2, 3, 5, 8, 13。
 * 这个数列从第3项开始，每一项都等于前两项之和。
 *
 * @author Karl Jin
 * @create 2019-05-20 15:54
 */

public class Fibonacci {

    /**
     * 斐波那契数列计算
     *
     * 给定一个位置N，计算该位置上的值
     *
     * @param index
     */
    public static int fibonacci(int index) {

        if (index == 1 || index == 2) {
            return 1;
        }else{
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }


    public static void main(String[] args) {
        System.out.println("fibonacci(1) = " + fibonacci(1));
        System.out.println("fibonacci(2) = " + fibonacci(2));
        System.out.println("fibonacci(3) = " + fibonacci(3));
        System.out.println("fibonacci(4) = " + fibonacci(4));
        System.out.println("fibonacci(5) = " + fibonacci(5));
        System.out.println("fibonacci(6) = " + fibonacci(6));
    }


}
