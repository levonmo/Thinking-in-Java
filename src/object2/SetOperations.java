package object2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//Set的一些方法
public class SetOperations {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        Collections.addAll(hashSet, "A,B,C,D,E,F,G,H".split(","));//将"A,B,C,D,E,F,G,H"变成一个数组，添加到Collection容器中(Set也是Collection)
        boolean isContains = hashSet.contains("A");//判断"A"是否在hashSet容器中。其他容器也有这个方法，只是HashSet是很快的
        System.out.println(isContains);
        //更多请看Collection接口的方法，Set与Collection接口的方法是一样的。Set没有额外添加任何方法
    }
}
