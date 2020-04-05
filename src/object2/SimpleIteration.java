package object2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//迭代器的几个方法
public class SimpleIteration {
    public static void main(String[] args) {

        List<String> str = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            str.add(String.valueOf(i));
        }

        //迭代器出来
        Iterator<String> it = str.iterator();
        //遍历
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //初始化遍历器，重新搞出来
        it = str.iterator();
        while (it.hasNext()) {
            //逐一删除元素
            String st = it.next();
            it.remove();//删除刚刚返回的元素
        }
        System.out.println("容器元素已经被全部删除完了");
    }
}
