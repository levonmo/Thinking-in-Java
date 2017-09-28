package object2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//容器Map
public class MapMess {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		//向Map中存储元素
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");
		hashMap.put(4, "D");
		System.out.println("toString方法" + hashMap);
		
		boolean isContainsKey = hashMap.containsKey(1);
		System.out.println("是否包含某个键：" + isContainsKey);
		boolean isContainsValue = hashMap.containsValue("A");
		System.out.println("是否包含某个值：" + isContainsValue);
		
		/*
		 * 遍历Map
		 */
		System.out.print("---遍历---");
		Set<Integer> keySet = hashMap.keySet();//这个集合包含了所有的键
		for (Integer i : keySet) {
			String str = hashMap.get(i);
			System.out.print(str);
		}
		System.out.println("---遍历结束---");
		
		//同样可以获得值得集合
		Collection<String> values = hashMap.values();
		System.out.print("值得集合：" + values);
		System.out.println();
		
		/*
		 * 很容易扩展到多维，Map里面还可以包含一个Map 或者 List都可以
		 */
		Map<Integer, Map> hashMap2 = new HashMap<Integer,Map>();
		hashMap2.put(1, hashMap);
		System.out.println(hashMap2);
		//访问Map中的Map
		Object object = hashMap2.get(1).get(1);
		System.out.println(object);
	}
}
