package object;

//创建一个Cycle类，它具有三个子类。演示每一个实例都可以由method()方法向上转型
public class Cycle {
	public void method(Cycle c) {
		System.out.print("Cycle.method");
		System.out.println("传人参数的类型是：" + c.getClass().getName());//运行这一行代码，等到的类名字还是传人的类型，等到的类型并没有向上转型?
	}
	public static void main(String[] args) {
		Unicycle unicycle = new Unicycle();
		unicycle.method(unicycle);//这个方法传人的参数是Cycle类型的，但是同也可以接受它的导出类
		Bicycle bicycle = new Bicycle();
		bicycle.method(bicycle);
		Tricycle tricycle = new Tricycle();
		tricycle.method(tricycle);
	}
}
class Unicycle extends Cycle {
	public void method(Cycle c) {
		System.out.print("Unicycle.method");
		System.out.println("传人参数的类型是：" + c.getClass().getName());
	}
}
class Bicycle extends Cycle {
	public void method(Cycle c) {
		System.out.print("Bicycle.method");
		System.out.println("传人参数的类型是：" + c.getClass().getName());
	}
}
class Tricycle extends Cycle {
	public void method(Cycle c) {
		System.out.print("Tricycle.method");
		System.out.println("传人参数的类型是：" + c.getClass().getName());
	}
}