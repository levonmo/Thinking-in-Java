package object;

public class VarargType {

    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println("长度：" + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println("长度：" + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);//接受int参数，并不需要转换为包装类型的，可变参数接受基本类型的(也可以将包装类型传入)
        g(new Integer(4));//将包装类型传入去，编译器会将其包装类型转换为基本类型的
        g();//I表示基本类型int(并不用转化为包装类型)，与下面的输出类型一样，也就是使用可变参数列表不用依赖于自动包装机制，而实际使用的就是基本类型
        System.out.println("int数组：" + new int[0].getClass());
    }

}
