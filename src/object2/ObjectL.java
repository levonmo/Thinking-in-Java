package object2;

//确定外围类是否可以访问其内部类的private元素
public class ObjectL {
	//这是一个内部类
	class ObjectLInner {
		private int i = 22;
		private void method() {
			System.out.println(i);
		}
	}
	//外围类尝试访问内部类的数据
	public void toInner() {
		ObjectLInner objectLInner = new ObjectLInner();
//		objectLInner.i;//外围类访问不了内部类的private的数据
	}
}
