package object;

public class Amphibian extends Frog {
	
	//这里是重新定义基类Frog中的methodA方法
//	public void methodA(Frog f) {
//		System.out.println("Amphibian.methodA");
//	}
	
	public static void main(String[] args) {
		Amphibian amphibian = new Amphibian();
		amphibian.methodA(amphibian);
		/*
		 * Amphibian是Frog的导出类，Frog的方法接受的是Frog类型的参数
		 * 	Amphibian继承Frog，使用Frog的方法，但实际传人的参数是Amphibian类型的,编译器没有报错
		 * 	Amphibian也是Frog类型的一种，接受向上转型
		 */
	}

}
class Frog {
	public void methodA(Frog f) {
		System.out.println("Frog.methodA");
	}
	public void methodB(Frog f) {
		System.out.println("Frog.methodB");
	}
}