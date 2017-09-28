package object3;

/*
 * 通常元组可以具有任意长度，同时，元组中的对象可以是任意不同的类型。不过，我们希望能够为每一个对象指明其类型，并且从容器中读取出来是正确的类型
 */
public class TwoTuple<A,B> {
	public final A a;
	public final B b;
	public TwoTuple(A a,B b) {
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return "(" + a + "," + b + ")";
	}
	/*
	 * 构造器捕获了要存储的对象
	 * 	也许你会想 a和b不应该声明为private吗?然后提供get和set方法才对?
	 * 	看看这个例子的安全性:可以读取a和b对象，但是无法为改变其值。
	 */
	public static void main(String[] args) {
		TwoTuple<Integer, Integer> twoTuple = new TwoTuple<Integer,Integer>(new Integer(1),new Integer(2));
		Integer c = twoTuple.a;//只能读取该值，但不能为该值赋值 
//		twoTuple.a = 3;
	}
}
//可以利用继承机制实现长度更长的元组
class ThreeTuple<A,B,C> extends TwoTuple<A,B> { 
	public final C c;
	public ThreeTuple(A a,B b,C c) {super(a, b);this.c = c;}
	public String toString() {return "(" + a + "," +  b +"," + c + ")";}
}
class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> {
	public final D d;
	public FourTuple(A a,B b,C c,D d) {super(a, b, c);this.d = d;}
	public String toString() {return "(" + a + "," + b + "," + c + "," + d + ")";}
}
class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
	public final E e;
	public FiveTuple(A a,B b,C c,D d,E e) {super(a, b, c, d);this.e = e;}
	public String toString() {return "(" + a + "," + b + "," + c + "," + d + "," + e + ")";}
}
//练习：创建一个SixTuple，并且测试它的功能
class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E> {
	public final F f;
	public SixTuple(A a,B b,C c,D d,E e,F f) {super(a, b, c, d, e);this.f = f;}	
	public String toString() {return "(" + a + "," + b + "," + c + "," + d + "," + e + "," + d + ")";}
	public static void main(String[] args) {
		SixTuple<Integer, Integer, Integer, Integer, Integer, Integer> six = 
				new SixTuple<Integer,Integer,Integer,Integer,Integer,Integer>(1,2,3,4,5,6);
		System.out.println(six.a);
		System.out.println(six.b);
	}
}
//使用元组，你自需要定义一个长度适合的元组，将其作为方法的返回值，然后再return语句中创建该元组
class AClass {};
class BClass {};
class TupleTest {
	static TwoTuple<AClass,BClass> method() {
		return new TwoTuple<AClass,BClass>(new AClass(),new BClass());
	}
	static ThreeTuple<AClass,BClass,AClass> methodB() {
		return new ThreeTuple<AClass,BClass,  AClass>(new AClass(),new BClass(),new AClass());
	}
	public static void main(String[] args) {
		TwoTuple<AClass, BClass> two = method();
		System.out.println(two.hashCode());
//		two.a = new AClass();//fianl不能被更改，fianl声明可以保护public域
	}
}
