package object2;

import java.util.ArrayList;
import java.util.List;

/*
 * 你编写的大部分代码都是与接口打交道(要学会面向接口编程)
 * 	你应该创建一个具体的对象，将其转型为对应的接口，然后再其余的代码中都使用这个接口的方法(这种做法是比较好的)
 * 	但是这种方法也并非总是奏效，因为有些类具有额外的功能。例如，在LinkedList具有在List接口中未包含的额外方法。如果你要使用这些方法就不能将其进行向上转型了
 *
 *
 */
public class ObjectP {
    List<Apple> list = new ArrayList<Apple>();//注意，这里ArrayList实例 已经 被向上转型为List了。List是一个接口
    //List是继承与Collection，Collection包含List和Set。List中有ArrayList和LinkedList。
    //Map与Collection是完全不同的，Map是存放键值对的
}

class Apple {
}
