package object2;

import object.Note;
/*
 *	创建抽象类和抽象方法非常有用的，因为它们可以使类的抽象类明确起来。抽象类还是很有用的重构工具，使得我们很容易地将公共方法沿着继承层次结构向上移动
 */
public class Music4 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	static void tune(Instrument[] arr) {
		for (Instrument i : arr) {
			i.play(Note.MIDDLE_C);
		}
	}
	public static void main(String[] args) {
		Instrument[] arr = {new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};
		tune(arr);
	}
}
abstract class Instrument {
	private int i;
	public abstract void play(Note n);//这是一个抽象方法，有一个抽象方法的类必须被定义为抽象类
	public abstract void adjust();//这也是一个抽象方法
	public String what() {return "Instrument";}
}
//继承抽象类的导出类,强制导出类必须实现基类的抽象方法。否则导出类也是抽象类
class Wind extends Instrument {
	//给基类中的两个抽象类定义
	public void play(Note n) {System.out.println("Wind.play" + n);}
	public void adjust() {System.out.println("Wind.adjust");}
	//覆盖重写基类的方法
	public String what() {return "Wind.what";}
}
class Percussion extends Instrument {
	//定义抽象基类的两个抽象方法
	public void play(Note n) {System.out.println("Percussion.play" + n);}
	public void adjust() {System.out.println("Percussion.adjust");}
	//覆盖重写基类的方法
	public String what() {return "Percussion.what";}
}
class Stringed extends Instrument {
	//定义抽象基类的两个抽象方法
	public void play(Note n) {System.out.println("Stringed.play" + n);}
	public void adjust() {System.out.println("Stringed.adjust");}
	//覆盖重写基类的方法
	public String what() {return "Stringed.what";}
}

class Brass extends Instrument {
	//定义抽象基类的两个抽象方法
	public void play(Note n) {System.out.println("Brass.play" + n);}
	public void adjust() {System.out.println("Brass.adjust");}
}
class Woodwind extends Wind {
	public void play(Note n) {System.out.println("Woodwind.play" + n);}
	public String what() {return "Woodwind.what";}
}

