package object2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

//写一个方法，使用Iterator遍历Collection，并打印容器中每个对象toString(),填充各种类型的Collection，然后对其使用此方法
public class ObjectT {
	//在编写 遍历相关  的代码的时候，并不需要关心它传进来的对象是什么类型的
	public static void display(Iterator<Integer> it) {
		while(it.hasNext()) {
			Integer obj = it.next();
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		HashSet<Integer> list3 = new HashSet<Integer>();
		TreeSet<Integer> list4 = new TreeSet<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
			list2.add(i);
			list3.add(i);
			list4.add(i);
		}
		display(list.iterator());
		display(list2.iterator());
		display(list3.iterator());
		display(list4.iterator());
	}
}
