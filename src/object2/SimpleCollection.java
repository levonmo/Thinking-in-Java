package object2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();//Collection也是一个接口，ArrayList是向上转型了
		//向容器添加元素
		for (int i = 0; i < 10; i++) {
			c.add(i);//add表示将一个对象添加到容器中，ArrayList的基类是List，List不关系添加的元素是否重复。所以总是会添加进去
		}
		//从容器中遍历元素。使用foreath遍历
		for (Integer i : c) {
			System.out.println("i=" + i);
		}
	}
	
	//练习：改用Set来表示c
	@Test
	public void otherMethod() {
		 Set<Integer> c = new HashSet<Integer>();//Set也是List的一种，只是Set是没有顺序的，不允许添加重复的元素。Set也是一个接口
		 for (int i = 0; i < 10; i++) {
			 c.add(i);
		}
		 for (Integer i : c) {
			 System.out.println("i=" + i);
		}
	}
}
