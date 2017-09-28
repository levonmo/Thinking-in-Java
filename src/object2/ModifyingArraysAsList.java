package object2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ModifyingArraysAsList {
	public static void main(String[] args) {
		
		//使用 ArrayList 对 Arrays.asList(x[])方法的结果 进行包装(实质就是把其传人ArrayList的构造器内)，对包装出来的数组进行操作不会影响x[]
		Integer[] ints = {1,2,3,4,5,6,7,8};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(ints));
		//对list进行打乱
		Random random = new Random(47);
		Collections.shuffle(list,random);
		System.out.println("打乱后的ArrayList(包装)" + list);
		System.out.println("打乱后原来的数组 " + Arrays.toString(ints));//可以看出对ArrayList进行打乱，但是底数组是不变的
		
		//不使用ArrayList对其包装，而是 对 Arrays.asList(x[])方法的结果 直接操作
		Integer[] ints2 = {1,2,3,4,5,6,7,8};
		List<Integer> list2 = Arrays.asList(ints2);
		Collections.shuffle(list2,random);
		System.out.println("打乱后的List(不包装)" + list2);
		System.out.println("原来的数组是" + Arrays.toString(ints2));//可以看出不使用 ArrayList 对其进行包装，直接对返回值进行操作是会改变底层数组的
	
		/*
		 * 要意识到Arrays.asList(x[]) 产生的List对象会  直接使用底层数组(划重点) 作为其物理实现
		 * 	只要你执行的操作会修改这个List，并且你不想原来的数组被修改，那么你就应该在另一个容器中创建一个副本(使用ArrayList进行包装)  
		 */
	}
}
