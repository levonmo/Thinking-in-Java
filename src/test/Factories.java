package test;

public class Factories {
	public static void main(String[] args) {
		//利用工厂模式，调用方法就可以返回一个对象了
		ServiceFactory factory = ServiceImpl.factory();
		Service service = factory.getService();
		service.method1();
		service.method2();
		//调用另一个工厂，返回另一种对象实例
		ServiceFactory factory2 = ServiceImpl.factory();
		Service service2 = factory2.getService();
		service2.method1();
		service2.method2();
	}
}
//接口
interface Service {
	void method1();
	void method2();
}
//这是一个工厂，调用getService方法可以返回一个实例
interface ServiceFactory {
	Service getService();
}
class ServiceImpl implements Service {
	public void method1() {System.out.println("ServiceImpl.method1");}
	public void method2() {System.out.println("ServiceImpl.method2");}
	//调用这个方法可以获得一个工厂
	public static ServiceFactory factory() {
		return new ServiceFactory() {
			public Service getService() {
				return new ServiceImpl();
			}
		};
	}
}
class ServiceImpl2 implements Service {
	public void method1() {System.out.println("ServiceImpl2.method1");}
	public void method2() {System.out.println("ServiceImpl2.method2");}
	public static ServiceFactory factory() {
		return new ServiceFactory() {
			public Service getService() {
				return new ServiceImpl2();
			}
		};
	}
}


