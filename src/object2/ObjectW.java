package object2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//创建一个空的LinkedList，向其中添加一些元素，通过使用ListIterator(迭代器)向容器的中间添加元素
public class ObjectW {
	//创建一个方法，传进一个List容器，总是向中间插进元素
	public static void addInt(List<Integer> it,int i) {
		//这样的话迭代器指针位置就是在容器元素的中间了
		ListIterator<Integer> listIterator = it.listIterator(it.size()/2);
		listIterator.add(i);
	}
	public static void main(String[] args) {
		//创建一个LinkedList容器，并向其中添加元素
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		//创建一个ListIterator迭代器，并在容器的中间添加元素
		addInt(list,12);
		addInt(list,12);
		addInt(list,12);
		System.out.println(list);
	}
}
