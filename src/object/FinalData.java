package object;

import java.util.Arrays;
import java.util.Random;

class Val {
	int i;
	public Val(int i) {
		this.i = i;
	}
}

public class FinalData {
	private static Random rand = new Random(47);
	private String id;
	public FinalData(String id) {
		this.id = id;
	}
	
	//基本类型+final 一旦完成初始化就不能改变的，每个对象都有一份，再多+static是所有对象共享一份不可改变的数据
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 39;
	
	//final与final+static的区别，下面有，final+static的基本类型全用大写字母命名
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);//这里加了static
	
	//对象类型+final
	private Val v1 = new Val(11);
	private final Val v2 = new Val(2);
	private static final Val v3 = new Val(13);
	
	//数组类型+final，
	private final int[] a = {1,2,3,4,5,6};

	public String toString() {
		return id + ": " + "i4 = " + i4 + ", INT_5= " + INT_5;
	}
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		
//		fd1.valueOne = 1;//final定义的值不能被改变
		fd1.v2.i = 1;//不是fianl定义的值可以被改变
		
//		fd1.v2 = new Val(7);//final+对象类型，一旦初始化引用指向某个对象，那么就不能改变这个引用指引到其他对象
		fd1.v1 = new Val(6);//不是final的，随便改变引用指向
		
		for (int i : fd1.a) {
			fd1.a[i] = 1;//数组元素的数据可以改变
//			fd1.a[i] = new Val(1);//但是不能改变数组元素的引用指向
		}
		
		System.out.println(fd1);
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd2); 
		/*
		 * 从这里可以看出
		 * 	final+基本类型: 一旦完成初始化就不可改变，每个对象都有一份
		 * 	final+static+基本类型：不可改变，只有一份(所有对象共享一份)
		 */
	}
}
