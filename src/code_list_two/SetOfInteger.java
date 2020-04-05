package code_list_two;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SetOfInteger {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("A");//这里添加了两个重复的元素，但是在HashSet中是不允许添加重复的元素的
        System.out.println("HashSet容器不允许重复的对象" + hashSet);
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");//HashSet并不是按照你添加的顺序输出的
        System.out.println("HashSet的输出是没有规律可找的" + hashSet);
    }

    //使用TreeSet对结果进行排序
    @Test
    public void treeSet() {
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("A");
        treeSet.add("A");//TreeSet中也是不允许添加重复的元素的。只要是Set都不允许容器中有重复的元素
        System.out.println("HashSet容器不允许重复的对象" + treeSet);
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");//TreeSet输出的结果是有顺序的
        System.out.println("HashSet的输出是没有规律可找的" + treeSet);
    }

}
