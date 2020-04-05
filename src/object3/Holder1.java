package object3;

public class Holder1 {
	private Automobile a;
	public Holder1(Automobile a) {this.a = a;}
	public Automobile get() {return this.a;}
	//这个对象的重用性很差，它无法持有其他类型的任何对象。因此我们要为每一个类型创建一个这样的类
}
class Holder2 {
	private Object o;
	public Holder2(Object o) {this.o = o;}
	public Object get() {return this.o;}
	public void set(Object o) {this.o = o;}
	public static void main(String[] args) {
		Holder2 h2 = new Holder2(new Integer("1"));
		h2.get();
		h2.set(new Automobile());
		Automobile a = (Automobile)h2.get();
	}
	//现在Holder2可以存储任何类型的对象了
}
class Automobile {}
/*
 * 有时候，我们希望容器可以存储多种类型的对象。但是，通常情况下，我们只会存储一种类型 的对象。我们更喜欢暂时不指定类型，而是稍后在决定使用什么类型的参数
 * 用尖括号括着，放在类名的后面。然后在使用这个类的时候，再用实际的类型替换此类型参数。
 */
class Holder3<T> {
	private T a;
	public Holder3(T a) {this.a = a;}
	public T get() {return a;}
	public void set(T a) {this.a = a;}
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get();//自动地转换为正确的类型
//		h3.set("a");
		/*
		 * 当你创建Holder3时，必须指明持有什么类型的对象，将其置于尖括号内。然后，你只能在Holder3中存放该类型(或者是子类，多态与泛型不冲突)
		 * 	并且，在Hodler3中取出它持有的对象时，自动地就是正确的类型了
		 * ·java泛型的核心概念:告诉编译器想使用什么类型，编译器帮你处理一切细节。
		 */
	}
}
