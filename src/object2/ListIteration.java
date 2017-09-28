package object2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//ListIterator迭代器
public class ListIteration {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		ListIterator<Integer> it = list.listIterator();//这是带有迭代器的容器

		while(it.hasNext()) {//是否还有下一个
			Integer next = it.next();
			System.out.println(next);
		}
		while(it.hasPrevious()) {//是否还有前一个
			Integer previous = it.previous();
			System.out.println(previous);
		}
		
		it = list.listIterator(3);//可以创建一个指定指针的初始位置
		while(it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);
			it.set(5);//上一个返回的元素会被替换为5
		}
	}
}
