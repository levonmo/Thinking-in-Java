package code_list_three;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<Integer>().getClass();
		Class c2 = new ArrayList<String>().getClass();
		System.out.println(c1 == c2);//实际上它们的类型是一样的(至少编译器会这样认为)
		/*
		 * ArrayList<Integer>和ArrayList<String>很容易被认为是不同的类型。不同的类型在行为方面肯定不同，例如，如果测试将一个Integer放进
		 * 	ArrayList<String>中，所等到的行为(将失败)，与将一个Integer放进ArrayList<Integer>(将成功)所得到的行为是完全不同的。
		 * 但是实际上它们是一样的类型。
		 * 
		 * ·java泛型是使用擦除来实现的，这意味着当你在使用泛型的时，任何具体的  类型信息  都被擦除了，你唯一知道的就是你在使用一个对象。因此List<String>和List<Integer>在运行时  事实上是相同的类型的。
		 */
	}
}
