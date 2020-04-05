package object2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ObjectY {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        System.out.println(hashSet);//HashSet不维护元素插入输出的顺序。使用一种散列算法道

        //将HashSet中的元素，转置到LinkedHashSet中。证明后者是维护插入顺序的
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        for (String s : hashSet) {
            linkedHashSet.add(s);
        }
        System.out.println(linkedHashSet);
        //到这里确实是证明了LinkedHashSet是维护了插入的顺序
    }
}
