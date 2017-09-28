package object2;

//内部可以实现多重继承
public class MultiImplementation {
	
}
class D {}
abstract class F {}
class Z extends F {
	D makeD() {		//这个类是继承D上定义的一个新类
		return new D();  //创建新类，返回向上转型
	};
}