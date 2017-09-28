package object3;

//参加一个Holder，使其能够持有具有相同类型的3的对象，并提供相应的读写方法访问这些对象，以及一个可以初始化其持有的3个对象的构造器
public class ObjectB {
	public static void main(String[] args) {
		Holder4<Automobile> h4 = new Holder4<Automobile>(new Automobile(),new Automobile(),new Automobile());
	}
}
class Holder4<T> {
	private T a;
	private T b;
	private T c;
	
	public Holder4(T a,T b,T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setA() {this.a = a;}
	public void setB() {this.b = b;}
	public void setC() {this.c = c;}
	
	public T getA() {return this.a;}
	public T getB() {return this.b;}
	public T getC() {return this.c;}
	
}
