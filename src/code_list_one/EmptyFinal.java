package code_list_one;

public class EmptyFinal {

    private final Objc objc;//这就是空白的final变量，但是在使用前必须完成赋值，只有一种方法(就是在构造器中进行赋值初始化)

    public EmptyFinal(Objc objc) {
        this.objc = objc;//在构造器中对final进行赋值
    }

    public static void main(String[] args) {
        EmptyFinal emptyFinal = new EmptyFinal(new Objc());//在new出来的时候传递一个对象进去，完成对final域的初始化
    }

}
