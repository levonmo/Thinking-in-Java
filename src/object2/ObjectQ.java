package object2;

//创建一个包含嵌套类类
public class ObjectQ {
	
	//这是一个嵌套类
	private static class ObjectQA {
		static int i = 11;
		public void read() {
			System.out.println("i的值是：" + i);
		}
	}
	
	public static void main(String[] args) {
		//创建嵌套类实例，并不需要依赖外围类
		ObjectQA objectQA = new ObjectQA();
		objectQA.read();
	}
}
