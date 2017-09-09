package object;
/*  注意几点:基类构造器 总是在  导出类构造过程被调用(导出类构造器还没有被调用之前)，每个基类的构造器都要被调用。为什么要这样?因为  导出类的构造  需要依赖基类，
 *  但是导出类不能访问基类private类型的数据，必须只有基类的构造器才具有恰当的知识和权限对自己的元素进行初始化。必须所有的基类构造器被调用，否则就不能创建导出类对象
 */
public class Sandwich extends PortableLunch {//第一步：查看是否存在基类，有的话就加载基类
	private Bread bread = new Bread();//第五步：依次加载成员变量
	private Cheese cheese = new Cheese();
	private Lettuce lettuce = new Lettuce();
	public Sandwich() {//第六步：最后，所有的东西准备好了，调用构造器，对象被创建
		System.out.println("Sandwich");
	}
	public static void main(String[] args) {
		new Sandwich();//执行着一行代码
	}
}
class Meal {//第四步：找出了根基类，加载根基类，调用构造器，以次跟着刚才的路线加载出去
	public Meal() {System.out.println("Meal");}
}
class Bread {
	public Bread() {System.out.println("Bread");}
} 
class Cheese {
	public Cheese() {System.out.println("Cheese");}
}
class Lettuce {
	public Lettuce() {System.out.println("Lettuce");}
}
class Luncha extends Meal {//第三步：还存在基类
	public Luncha() {System.out.println("Luncha");}
}
class PortableLunch extends Luncha {//第二步：基类中是否还存在基类
	public PortableLunch() {System.out.println("PortableLunch");}
}
