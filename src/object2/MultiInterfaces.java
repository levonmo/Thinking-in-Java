package object2;

//内部类的灵活性
public class MultiInterfaces {
	static void takesA(A0 a) {}
	static void takesB(B b) {}
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
		/*
		 * 这样的话Y的内部类灵活性就会增强
		 */
	}
}
interface A0 {}
interface B {}
//
class X implements A0, B {}
class Y implements A0 {
	public B makeB() {return new B() {};}
}
