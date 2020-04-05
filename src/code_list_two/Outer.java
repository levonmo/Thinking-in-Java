package code_list_two;

//编写一个名为Outer的类，包含一个名为Inner的类，在Outer中添加一个方法，它返回一个Inner类型的对象。创建并初始化一个指向某个Inner对象的引用
public class Outer {
    class Inner {
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
    }

}
