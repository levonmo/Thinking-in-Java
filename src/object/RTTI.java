package object;

//向下转型
public class RTTI {
	public static void main(String[] args) {
		Useful[] useful = {new Useful(),new MoreUseful()};//这里MoreUseful是向上转型
		useful[0].f();
//		(MoreUseful)useful[0].u();//如果所转类型是正确的，那么转型成功，否则失败
		((MoreUseful)useful[1]).u();//向下转型
	}
}
class Useful {
	public void f() {}
	public void g() {}
}
class MoreUseful extends Useful { 
	public void f() {}
	public void g() {}
	public void u() {}
	public void h() {}
}