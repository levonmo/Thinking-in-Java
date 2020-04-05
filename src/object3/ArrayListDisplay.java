package object3;

import java.util.ArrayList;

public class ArrayListDisplay {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		System.out.println(arrayList);
		// 容器类也有toString方法，并且覆写类该 方法，使得它生成的String结果能够表达它自己的元素
	}
}

class InfiniteRecursion {
	public static void main(String[] args) {
		ArrayList<InfiniteRecursion> arrayList = new ArrayList<InfiniteRecursion>();
		arrayList.add(new InfiniteRecursion());
		System.out.println(arrayList.toString());
		/*
		 * 这里会报错的原因是：
		 * 	当运行到这行代码的时候 "address" + this ;
		 * 	就会发生类型转换，编译器看到String对象("address就是一个String对象")后面跟着一个"+"。于是编译器就尝试将  this 转换为String对象，
		 * 	可是怎么将this 转换为String?编译器就尝试调用this的toString方法--于是调用this.toString，又回到该toString方法了，就发生了递归
		 */
	}
	public String toString() {
		return "address" + this ;
//		return "address" + super.toString();
	}
	//如果真的想打印内存地址，就应该调用Obejct.toString()方法,它才是负责这个任务的方法(这个任务是指打印内存地址)。所以，你不应该使用this，而是应该调用super.toString()方法
}
