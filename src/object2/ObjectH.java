package object2;

//创建一个接口和几个它的实现类。每种类型都创建相应的工厂，然后编写代码使用这些工厂
public class ObjectH {
	//工厂方法
	public static void cycleConsumer(CycleFactory fac) {
		Cycle c = fac.getCycle();
		c.play();
	}
	public static void main(String[] args) {
		UnicycleFactory u = new UnicycleFactory();
		cycleConsumer(u);
		BicycleFactory b = new BicycleFactory();
		cycleConsumer(b);
		TricycleFactory t = new TricycleFactory();
		cycleConsumer(t);
	}
}
//接口
interface Cycle {
	void play();
}
interface CycleFactory {
	Cycle getCycle();
}
//具体的实现类
class Unicycle implements Cycle { 
	public void play() {System.out.println("Unicycle.play");}
}
class Bicycle implements Cycle {
	public void play() {System.out.println("Bicycle.play");}
}
class Tricycle implements Cycle {
	public void play() {System.out.println("Tricycle.play");}
}
//建立相对应的工厂
class UnicycleFactory implements CycleFactory { 
	public Cycle getCycle() {return new Unicycle();}
}
class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {return new Bicycle(); }
}
class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {return new Tricycle();}
}
