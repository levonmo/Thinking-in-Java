package code_list_two;

/*
 * 内部类的继承
 * 	·内部类的构造器必须连接到指向其外围类对象的引用，所以在继承内部类的时候，会变得很复杂。
 * 	·问题在于，那个指向外围类对象的"秘密"的引用必须被初始化。
 */
public class InheritInner extends WithInner.Inner { //这里继承内部类
    InheritInner(WithInner w) {  //
        w.super();//使用super()语法
    }
}

class WithInner {
    class Inner {
    }
}
