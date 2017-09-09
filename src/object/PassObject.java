package object;

//方法调用中的别名问题
public class PassObject {

	static void f(Letter y){
		y.c = 'z';
	}
	
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("x中c的值为：" + x.c);
		/*
		 * 在很多的语言中，方法f()似乎要在它的作用域内复制一份对象出来，但实际上传递上只是传递了一个引用，
		 * 	所以拿到了该引用，对其进行操作时，当成参数传入的变量也会发生改变
		 */
		f(x);
		System.out.println("x中c的值为：" + x.c);
	}
	
}
