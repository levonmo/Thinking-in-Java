package object2;

import java.util.LinkedList;

//LinkedList的一些API
public class LinkedListFeatures {
	public static void main(String[] args) {
		//创建一个LinkedList容器
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println("列表元素的排序");
		System.out.println("列表的第一个元素：" + list.getFirst());
		System.out.println("列表的第一个元素：" + list.element());
		System.out.println("也是返回列表的第一个元素,只是当容器是空的时候不会抛出异常，而 上面的两个方法就会抛出异常" + list.peek());
		System.out.println("从列表的尾端插进元素");
		list.addFirst(13);
		System.out.println("是否在容器的开始处添加了元素");
		list.add(12);
		list.addLast(14);
		System.out.println("是否是真的在尾端增加了元素" + list);
		System.out.println("移除列表的最后一个元素");
		list.removeLast();
		System.out.println("是否移除了容器的最后一个元素了" + list);
	}
}
