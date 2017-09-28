package object2;

//在 接口内部的嵌套类
public interface ClassInInterface {
	void method();
	class Test implements ClassInInterface {//这是一个在接口中定义的嵌套类。会被自动的默认为static和final，并不需要显式的配置
		public void method() {System.out.println("Test.method");}
	}
}
