package object3;

public class ErasureAndInheritance {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Der2 der2 = new Der2();
		Object obj = der2.get();
		der2.set(obj);
	}
}
class GenBasic<T> {
	private T t;
	public void set(T t) {this.t = t;}
	public T get() {return t;}
}
class Der1<T> extends GenBasic<T> {}

class Der2 extends GenBasic {}
/*
 * Der2继承自GenBasic，但是没有任何的泛型参数，而编译器不会发出任何的警告,警告在set()被调用的时才出现，
 * 	为了关闭警告可以使用@SuppressWarnings("unchecked")加在方法上面
 */
