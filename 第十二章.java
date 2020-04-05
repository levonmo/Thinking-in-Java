import object2.*;

public class 第十二章 {
    /*
     * ·第十二章总结
     * 	·数组可以保持基本类型的数据，数组一旦生成，其容量就不能改变了
     * 	·Collection保存单一对象，Map保存相关联的键值对信息。有了java泛型，就可以指定容器中存放的对象类型，这样就不会将其他类型的对象放进同一个容器中
     * 		并且从容器中取出元素的时候，也不需要进行类型转换。Collection和Map都是可以自动拓展的大小的。
     * 	·容器不能持有基本类型，但是自动包装机制会检查并进行相关类型的转换
     * 	·和数组一样，List也可以建立数字索引与对象进行关联(可以进行随机访问)。因此，数组和List都是排好序的容器。List能够自动扩充容量
     *
     * 	·如果要进行大量的访问 使用ArrayList；如果要大量的插入和删除数据，使用LinkedList。
     * 	·各种Queue以及 栈 的行为，LinkedList提供支持
     * 	·Map是一种 将对象(而非数字) 与对象相关联的设计。HashMap设计用来快速查询。而TreeMap保持键始终处于排序的状态(底部是二叉树，最小的总是第一个)
     * 		因此TreeMap的快速访问没有HashMap块。LinkedHashMap保持元素插进的顺序，但是也通过散列提供了快速访问的能力
     * 	·Set不接受重复的元素，HashSet提供最快的查询速度，而TreeSet保持元素处于排序的状态。LinkedHashSet以插进的顺序保存元素
     * 	·新的程序不应该使用过时的Vector，Hashtable和Stack
     */


    /*
     * 练习
     */
    Gerbil gerbil;
    ObjectT objectT;//迭代器的强大之处
    ObjectU objectU;
    ObjectW objectW;//总是向容器中间插进元素
    ObjectX objectX;//HashMap不维护插入的顺序，LinkedHashMap维护
    ObjectY objectY;//HashSet不维护插入的顺序，LinkedHashSet维护
    ObjectZ objectZ;
    Object1 object1;
    Object2 object2;//未完
}
