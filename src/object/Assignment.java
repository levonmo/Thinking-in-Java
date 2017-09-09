package object;

public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("t1=" + t1.level + " " + "t2=" + t2.level);
		//这时候t1和t2都指向了一样的引用(就是t2原来的那个对象，t1原来指引的那个对象就没有引用，被垃圾回收器回收)
		t1 = t2;
		System.out.println("t1=" + t1.level + " " + "t2=" + t2.level);
		//这时候改变t1的值，t2的值也被发生改变了
		t1.level = 3;
		System.out.println("t1=" + t1.level + " " + "t2=" + t2.level);
	}

}
