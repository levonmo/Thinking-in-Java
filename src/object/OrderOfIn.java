package object;

class Window {
	public Window(int marker) {
		System.out.println("window=" + marker);
	}
}
class House {
	Window w1 = new Window(1);
	public House() { 
		System.out.println("House");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	public void f(){
		System.out.println("f()");
	}
	Window w3 = new Window(3);
}
public class OrderOfIn {
	public static void main(String[] args) {
		/*
		 * 在构造参数调用之前，所有的变量都被初始化了，变量定义的先后顺序决定了初始化的顺序(不包含局部变量)，即使变量定义散步与方法定义之间，它们仍然会在任何方法(包含构造器)被调用之前得到初始化。
		 */
		House house = new House();
		house.f();
	}
}