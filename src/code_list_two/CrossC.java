package code_list_two;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

//迭代器的强大之处
public class CrossC {

    /*
     * display()方法不包含任何有关它所遍历的序列的类型信息，这也展示了Integer的真正威力：能够将  遍历操作  与  序列底层  的结构分离
     * 就是在你编写  遍历相关的代码  时，你不用关心传过来是什么类型的容器。抽象程度极高，所以说迭代器同一了对容器的访问
     */
    public static void display(Iterator<Integer> it) {
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }
        HashSet<Integer> list3 = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            list3.add(i);
        }
        TreeSet<Integer> list4 = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            list4.add(i);
        }
        display(list.iterator());
        display(list2.iterator());
        display(list3.iterator());
        display(list4.iterator());
    }
}
