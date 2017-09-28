package object2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//Arrays.asList()方法接受一个数组或者是一个用逗号分隔的元素列表，并将其转化为一个List对象
public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>(Arrays.asList(1,2,3));
		//使用Arrays.asList(),可以将一个Collection集合或者是用逗号分隔的对象转换为Collection对象

		Collections.addAll(c,4,5,6);
		//Collections.addAll方法也可以将另一个集合或者是逗号分隔的。追加到给定的集合上(要在该方法的参数里面传人一个集合)
	}
}
