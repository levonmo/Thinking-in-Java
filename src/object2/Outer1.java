package object2;

//创建一个类，有一个String变量，并用一个内部类显示外围类的String变量
public class Outer1 {
	private String str;
	public Outer1(String str) {
		this.str = str;
	}
	class Inner {
		public String toString() {
			return str;
		}
	}
	public Inner getInner() {
		return new Inner();
	}
	public static void main(String[] args) {
		Outer1 outer1 = new Outer1("H");
		Inner inner = outer1.getInner();
		System.out.println(inner.toString());
	}
}
