package object2;

import java.util.ArrayList;
import java.util.List;

//创建容器，向其中添加元素。最后遍历该元素
public class Gerbil {
	private int gerbilNumber;
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	public void hop() {
		System.out.println(gerbilNumber);
	}
	public static void main(String[] args) {
		//创建一个ArrayList的数组
		List<Gerbil> list = new ArrayList<Gerbil>();
		//向数组中添加元素
		for (int i = 0; i < 10; i++) {
			list.add(new Gerbil(i));
		}
		//遍历数组
		for (int i = 0; i < list.size(); i++) {
			(list.get(i)).hop();
		}
	}
}
