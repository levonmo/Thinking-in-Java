package object;

public class PrivateOverride {
	private void f() {
		System.out.println("PrivateOverride.f()");
	}
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f(); 
	}
	
}
class Derived extends PrivateOverride {
	/*
	 * 在基类中有一个私有的f()方法，在导出类有也有一个f()方法，但是这两个方法没有任何的联系，也不是重载
	 * 	并且基类的私有方法对导出类是不可见的
	 */
	public void f() {
		System.out.println("Derived.f()");
	}
}
