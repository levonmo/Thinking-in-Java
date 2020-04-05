package code_list_two;

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {  //像这样new Base(i){}。会将i的值传递给基类的构造器
			/*
			 * 创建一个继承Base的匿名的类,这里传人一个i，但是这里的参数声明的i并不需要声明为final，因为这里的i并不是给这个匿名类使用的，它并不会在匿名类内部使用
			 * 而是传递给基类的构造器使用的，匿名类中根本没有构造器(因为它根本没有名字)
			 */
			public void f() {System.out.println("new Base.f()");}
		};
	}
	public static void main(String[] args) {
		Base base = getBase(11);
		base.f();
	}
}
abstract class Base {
	public Base(int i) {System.out.println("i=" + i);}
	public abstract void f();
}
