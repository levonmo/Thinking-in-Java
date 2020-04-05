package code_list_two;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//用键值对填充一个HashMap。打印结果，通过散列码来展示其排序。
public class ObjectX {
	public static void main(String[] args) {
		 Map<String, String> hashMap = new HashMap<String,String>();
		 hashMap.put("1", "A");
		 hashMap.put("2", "B");
		 hashMap.put("3", "C");
		 hashMap.put("4", "D");
		 hashMap.put("5", "E");
		 System.out.println(hashMap);//打印的结果是没有规律的
		 
		 //抽取这些键值对，放进LinkedHashMap中。证明LinkedHashMap维护插进的顺序
		 LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String,String>();
		 //从上一个HashMap中取出键值对
		 Set<String> keySet = hashMap.keySet();
		 for (String key : keySet) {
			 String value = hashMap.get(key);
			 linkedHashMap.put(key, value);
		}
		 System.out.println(linkedHashMap);
		 //但这里确实是维护了插入的顺序。
	}
}
