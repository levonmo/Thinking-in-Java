package code_list_two;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//创建一个List，并向其中填充元素，在创建一个List。使用ListIterator读取第一个List中的元素，并反序的插入到第二个列表中
public class ObjectU {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> list2 = new ArrayList<Integer>();
        //创建一个带有参数的迭代器，这个参数指定迭代器从哪里kai'shi的ListIterator(其实就是一个带有容器的迭代器)，这个迭代器里面有容器元素的信息
        ListIterator<Integer> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            Integer previous = it.previous();
            list2.add(previous);
        }
        //遍历list2
        for (Integer i : list2) {
            System.out.println(i);
        }
    }
}
