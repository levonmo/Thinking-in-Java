package code_list_three;

public class GenericMethod {
	public <T> void f(T t) {	//在返回值之前进行 泛型参数列表的 定义
		System.out.println(t.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethod genericMethod = new GenericMethod();
		genericMethod.f(1);
		genericMethod.f("A");
		genericMethod.f(1.0f);
	}
	/*
	 * ·类型参数推断 : 使用泛型类必须在创建对象的时候指定参数类型，而在使用泛型方法时，通常不必指明参数类型。因为编译器会帮我们找出具体的类型，这称 类型参数推断
	 */
}
//练习:使f()可以接受三个类型各不相同的参数
class GenericMethodB {
	public <A,B,C> void f(A a,B b,C c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethodB genericMethodB = new GenericMethodB();
		genericMethodB.f(1, "v", 1.3f);
	}
}
//练习:将前一个最后一个参数修改为非参数化类型的
class GenericMethodC {
	public <A,B> void f(A a,B b,String s) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(s.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethodC genericMethodC = new GenericMethodC();
		genericMethodC.f(1, 1.3f,"A");
	}
}