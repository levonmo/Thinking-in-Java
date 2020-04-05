package object;

public class Beetle extends Insect {//第二步：查看是否有基类(通过extends关键字)，有的话加载基类
    private int k = printInit("Beetle的实例变量");//第七步：实例变量初始化

    public Beetle() {
        System.out.println("Beetle的构造器被调用");//第八步：构造器这才被调用
    }

    private static int x2 = printInit("Beetle的static变量");//第五步：导出类的static变量初始化

    public static void main(String[] args) {//第一步：访问main方法(一个static方法，加载.class文件)
        Beetle beetle = new Beetle();
    }
}

class Insect {//第三步：加载基类

    public Insect() {
        System.out.println("Insect的构造器被调用");//第六步：基类的构造器被调用(要想创建导出类，基类的构造器一定会被调用)
    }

    private static int x1 = printInit("Insect的static变量");//第四步：基类的static变量初始化

    public static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
/*
 * 继承与初始化
 * 	当Beetle运行在java时，发生的第一件事是试图访问Beetle.main()(一个stati方法)，找出Beetle类的编译代码(在名为Beetle.class中)
 * 	编译器注意到它有一个基类(这是有extends得知)，对基类进行加载(如果基类还有基类，继续加载，以此类推)
 * 	接下来根基类(最老的那个基类)中的static初始化，然后是下一个导出类，以此类推。这种机制很重要，因为导出类的static初始化可能依赖基类的static。
 * 	到此为止，所依赖的类已全部加载完毕，对象可以被创建。对象创建的过程:首先，对象中的所有基本类型都会被设为默认值，对象引用被设为null，
 * 	基类构造器被调用，基类构造器完成之后，导出类的实例变量被初始化
 *
 */
