package object;

public class AutoboxingVarargs {

    public static void f(Integer... args) {
        /*
         * 这里可以使用迭代证明你得到的是一个数组
         */
        for (Integer i : args) {
            System.out.println(i.getClass());
        }
    }

    public static void main(String[] args) {
        f(new Integer(1), new Integer(2));
        f(new Integer[]{1, 5});//如果将一个数组传进去，编译器会发现它已经是一个数组了，所以不会再其上执行任何的转换。
        f(4, 5);
        f(6, new Integer(7));
        f();//将0个参数传递给可变参数列表是可以得。
        /*
         * 如果将可变参数的类型设置为Integer时，是可以将基本类型int传进去，但是会将int类型转换Integer
         * 	如果你有一组事物，可以把它们当作列表传递，而如果你已经有一个数组，该方法可以把它们当作可变参数列表来接受
         *
         */
    }

}
