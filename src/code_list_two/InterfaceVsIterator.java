package code_list_two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InterfaceVsIterator {
    //使用迭代器进行遍历
    public static void display(Iterator<String> it) {
        while (it.hasNext()) {
            String next = it.next();
            System.out.print(next + " ");
        }
        System.out.println();
    }

    //使用Collection容器的通性来进行遍历操作
    public static void display(Collection<String> coll) {
        for (String str : coll) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        display(list);
        //创建一个迭代器出来，利用迭代器进行遍历
        Iterator<String> iterator = list.iterator();
        display(iterator);
        //使用Collection的api进行遍历
        display(list);

        //用迭代器进行遍历，对于Map集合也同样适合,但是利用Collection通性进行操作的话就不行了
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "A");
        hashMap.put("2", "B");
        hashMap.put("3", "C");
        hashMap.put("4", "D");
        /*
         * 	在这里Map没有迭代器功能，但是Map的 值集合.values()是使用 Collection来装的
         *	  所以就可以 创建一个迭代器并进行遍历
         */
        display(hashMap.values().iterator());
        //使用Collection的API进行遍历
        display(hashMap.values());

        /*
         * 两个版本的display()方法都可以使用Map或者Collection的子类型来工作，而且Collection接口和Iterator都可以将display()方法与底层的容器进行解耦
         * 当你要实现一个不是Collection的外部类时，让它去实现Collection接口可能非常困难，这时候使用Iterator就会变得非常吸引人
         */

    }
}
