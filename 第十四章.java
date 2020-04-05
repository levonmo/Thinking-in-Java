import object3.*;

public class 第十四章 {

    /*
     * 第14章:类型信息
     * 	·Class对象
     * 	  ·类是程序的一部分，每个类都有一个Class对象。所有的类都是在对其第一次使用时，动态加载到JVM中的，当程序创建第一个对类的静态成员的引用时候，就会加载这个类。
     * 		这个证明构造器也是类的静态方法，即使构造器并没有使用到这个词。因此，使用new操作符创建类的新对象也会被当作对类的静态成员的引用。
     */
    SweetShop sweetShop;
    /*
     * 	·Class类包含很多有用的方法，从中可以获取很多有用的信息
     */
    ToyTest toyTest;

    /*
     * ·类字面常量
     * 	java还提供了另一种方法来生成Class对象的引用，即使用 类字面常量  。
     * 	像下面这样：
     * 		FancyToy.class;
     * 		这样做不仅更简单，而且更安全。因为它在编译的时候会受到检查。使用Class.forName("X");可能就会出现没有X这个类，就会在运行时候抛出错误
     * 	 ·类字面常量不仅可以引用于普通的类，有可以应用于接口，数组以及基本数据类型
     *   ·更有趣的是，当使用".class"来创建对class对象的引用时，不会自动地初始化该Class对象。(不会自动加载static变量)，初始化有效的实现了尽可能的"惰性"
     */
    ClassInit classInit;

    /*
     * ·泛化的Class引用:将它的类型变得更具体一点
     */
    GenericClassRe genericClassRe;
    FilledList filledList;
    GenericToy genericToy;

    /*
     * 练习
     */
    Shapes shapes;


    /*
     * ·动态代理
     */
    SimpleProxyDemo simpleProxyDemo;//静态代理

}
