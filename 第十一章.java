import object2.*;

public class 第十一章 {

    /*
     * ·第十一章：持有对象
     * 	·容器：可以根据你添加进来的对象数量，动态的扩充容器的大小。与数组进行比较就是 数组 一旦被初始化长度，就不能改变其大小了。(容器也可以叫集合类)
     *	·基本的容器类型有：List,Set,Queue和Map。容器提供了完善的方式来保持对象
     *	  ·Set：保存的对象不能重复
     *	  ·Map：可以将两个对象关联起来(键值对)
     */

    /*
     * ·容器的基本概念
     * 	--java容器类类库的用途是"保存对象"，并将其划分为两个不同的概念
     * 	·Collection：一个独立元素的序列。
     * 	  ·List：必须按照插入的顺序保存元素
     * 	  ·Set：不能有重复的元素
     * 	  ·Queue：按照排队规则来确定对象产生的顺序
     * 	·Map：一组成对的"键值对"对象，允许你使用  键(键是你自己定义的) 来查找值。
     */

    /*
     * 	·Collection
     * 	 --List
     *   --Set
     */
    SimpleCollection simpleCollection;

    /*
     * 	·添加一组元素进入容器
     * 	 ·在java.util包中的Arrays和Collection类中都有很多实用方法，可以向一个Collection对象添加一组元素
     * 	 ·Arrays.asList()方法接受一个数组或者是一个用逗号分隔的元素列表，并将其转化为一个List对象
     */
    AddingGroups addingGroups;

    /*
     * ·与接口打交道
     */
    ObjectP objectP;

    /*
     *	·java容器类库中的两种主要类型是，它们的区别在于容器中每个"槽"保存的元素个数
     *	  ·Collection在每个槽中只能保存一个元素
     *		这类容器包含：List，Set，Queue---(List容器的元素是有顺序的，Set容器的元素不允许重复，Queue只允许在容器的一端插进，另一个端删除)
     *	  ·Map在每个"槽"内保存了两个对象，键值对 刚好是两个对象。
     *		这类容器包含：HashMap，TreeMap和ListMap--(HashMap提供了最快的查找技术，是没有顺序的。TreeMap按照比较结果的升序保存键。LinkedHashMap按照插入顺序保存键)
     */

    /*
     * ·List
     * 	·List承诺可以将元素维护在特定的序列中
     * 	·List接口在Collection的基础上添加了大量的方法，使得可以在List的中间c插入和移除元素
     *
     * 	·有两种List的类型
     * 	 ·基本的ArrayList：擅长随机访问元素，但是在插入元素的比较慢
     * 	 ·LinkedList：和ArrayList相反 ，随机访问元素较慢，插进元素比较快
     *
     * 	·List的API:
     * 	 ·contains(obj):确定某个对象是否在列表中
     * 	 ·remove(obj):移除某个对象
     * 	 ·indexOf(obj):某个对象引用的索引
     * 	 ·subList():从容器中截取一个片段
     * 	 ·containsAll(obj):obj是不是容器的一个子集
     * 	 ·removeAll():移除全部元素
     *   ·addAll(index,obj):在指定的索引值处插入
     *   ·isEmpty():容器是否为空
     *   ·clear():清空容器
     *   ·toArray():将一个Collection转换为一个数组
     */

    /*
     * ·迭代器   (迭代器的思想非常之强大的:接受对象容器并传递给它，从而在每个对象上都执行操作。迭代器统一了容器的访问方式)。
     * 	···是带有List的迭代器
     * 	·产生的背景：不重写代码就可以应用于不同类型的容器
     * 	·迭代器就只有三个方法
     * 	  ·hasNext():是否还有下一个
     * 	  ·next():指针向下移动一格，返回刚刚跨过的元素
     * 	  ·remove():删除上一次调用next()返回的元素。这意味着调用remove()之前必须调用一次next()。
     */
    SimpleIteration simpleIteration;//迭代器
    CrossC c;//迭代器的强大之处，可以将  遍历操作  与  底层结构  分离。就是在你编写  遍历相关的代码  时，你不用关心传过来是什么类型的容器。抽象程度极高，所以说迭代器同一了对容器的访问

    /*
     * ·ListIterator:是Iterator的子类型，功能强大很多
     * 	·只能适合与List
     * 	·Iterator只能向前移动，ListIterator双向移动
     * 	·可以使用set()方法替换它访问过的最后一个元素
     * 	·通过调用listIterator()方法产生一个ListIterator(指针的位置在元素集合的开始处)
     *		还有一个重载的方法 listIterator(index)也产生一个ListIterator(指针的位置在index的位置)，这比Iterator灵活多了
     *	·
     *
     */
    ListIteration listIteration;

    /*
     * ·LinkedList
     *   ·与ArrayList一样实现了基本的List接口，在插进数据比ArrayList高效(LinkedList是链表结构)，但是在随机访问时就变得比较慢了
     *   ·具体的API也可以参考ArrayList的
     *   ·下面还定义了其他的API
     *     ·getFirst()和element():完全一样。都是返回列表的第一个元素，而不会移除它。如果列表为空抛出NoSuchElementException。
     *     ·peek():与上面的一样。不同的地方就是 列表类空的时候 不会抛出异常 而是返回一个null
     *     ·addFirst()：在列表的开始处添加元素
     *     ·add(),addList()：是一样的，都是从列表的尾端插进元素
     *     ·removeLast():移除列表的最后一个元素 并被移除的元素
     */
    LinkedListFeatures linkedListFeatures;

    /*
     * ·栈(Stack)
     * 	·"栈" 通常是指  后进先出  的容器。你不能对 栈底的元素进行操作，想要对下面的元素进行操作的话，就必须先拿掉上面的元素。有时称栈为 叠压栈。
     * 	·LinkedList具有实现 栈 所有功能的方法(并不是说LinkedList就是一个栈，只是可以实现一个栈，LinkedList与栈没有任何关系)
     * 		栈 的 所有 功能就是后进先出。
     */
    Stack stack;


    /*
     * ·Set
     * 	 -- Collection
     * 		--List
     * 		  --ArrayList，LinkedList
     * 		--Set
     * 		  --HashSet，TreeSet，LinkedHashList
     * 		--Queue(好像比较少用)
     *
     * 	 ·不保存重复的元素
     * 	 ·如果你试图将统一对象添加到Set容器中，那么它会阻止这种重复的现象
     * 	 ·Set最常用的是测试 归属性，判断一个对象是否在Set容器中。正是因为这，查找就成为Set最重要的操作，因此你通常会选择一个HashSet	的实现，HashSet对快速查找进行了优化
     * 	 ·Set具有与Collection一样的接口(接口就是方法)，因此没有任何额外的功能，不像前面两个List
     * 	 ·实际上Set就是Collection，只是行为不同(这是继承与多态的典型应用：表现不同的行为)
     * 	 ·由于出于速度的原因，HashSet使用了散列函数。HashSet维护元素的顺序与TreeSet(使用红黑树)或LinkedHashSet都不同。
     */
    SetOfInteger setOfInteger;
    /*
     * 	·Set的API
     * 	  ·contains():测试元素的归属性。这个方法查询的速度是很快的
     */
    SetOperations setOperations;


    /*
     * ·Map：对象映射，键值对。
     * 	 --与Collection不同的，Collection是单个对象的存储的
     */
    MapMess mapMess;

    /*
     * 	---HashMap不维护插入的顺序，LinkedHashMap维护
     *  ---HashMap不维护插入的顺序，LinkedHashMap维护
     *  	Hash使用散列函数，都是不维护插入顺序的
     *  	Linked是维护插入顺序的，虽然LinkedHashMap看起来像是Hash
     */

    /*
     * ·Queue(队列)
     * 	 ·Queue是一个典型的先进先出容器。即从容器的一端放进元素，从另一端取出事物。把 事物放进容器的顺序与取出事物的顺序是相同的
     * 	 ·常被当作一种可靠的 将对象 从程序的某一区域传输到另一区域的途径。队列在并发编程中特别重要
     * 	 ·LinkedList提供了方法支持队列行为，并且实现了Queue接口，因此LinkedList可以用作Queue的一种实现，可以向上转型为Queue
     *   ·相关的API:
     *   	·offer():将一个元素插入到队尾
     *   	·peek()和element():返回队头，但是不移除。当队为空时，peek()返回null，而后者会抛出异常
     *   	·poll()和remove():返回队头，会移除返回的元素。当队为空时，poll()返回null，而后者会抛出异常
     */
    QueueDemo queueDemo;

    /*
     *  ·PriorityQueue
     *    ·先进先出是最典型的队列规则
     *    ·先进先出确定下一个弹出的元素，应该是等待时间最长的
     *    ·相关的API可以参考上面的Queue
     */
    PriorityQueueDemo priorityQueueDemo;

    /*
     * ·Collection和Iterator
     *   ·选择Collection作为容去的基类，从而创建导出类，这样做编写的代码可以接受更通用更多的对象类型(只要基类是Collection都可以)。面向接口编程
     *   ·C++类库中并没有其容器的任何公共基类，容器之间的所有共性都是通过迭代器达成的，操作容器中的元素全部都是通过迭代器进行操作的
     *   ·在java中，这两个方法绑定在一起了，实现Collection就意味这提供了iterator()方法，因为Collection继承了该接口就自动拥有了该接口
     */
    InterfaceVsIterator interfaceVsIterator;

    /*
     * ·Foreach与迭代器  (没有继承Iterable就不能使用Foreach语法)
     * 	·foreach语法只要应用于数组，也可以应用与Collection对象(事实上foreach在所有Iterator上，Collection只是继承了Iterator)
     * 	·foreach之所以能与Collection一起工作，是因为SE5.0被引入的Iterable接口。该接口包含一个能够产生Iterator的iterator()方法
     * 		并且Iterator接口被foreach用来在序列中移动
     * 	·因此如果你创建了任何实现了Iterable的类，都可以使用foreach这种语句
     * 	·foreach可以应用在数组，但不代表数组就是Iterator，将数组向上转型为Iterator是不允许的
     */
    IterableClass iterableClass;//自己动手实现迭代器功能

    /*
     * ·适配器方法惯用法
     *   ·写一个foreach是反向比遍历的(只要在foreach的参数里面输入一个Iterable类型的实例对象就可以进行迭代了)
     */
    ForeachCollections ForeachCollections;//这个一定要看，适配器
    ReversibleArrayList reversibleArrayList;//自己定义 可以返回一个反向foreach遍历的 迭代器
    MultiIterableClass multiIterableClass;//这里面有三个迭代器

    /*
     *	·使用  ArrayList  将  Arrays.asList(x[])方法结果  包装了起来 ，再对ArrayList进行操作，就不会引起x[]的改变
     *	  ·如果不使用ArrayList进行包装，而直接使用  Arrays.asList(x[])方法结果(即返回值)  进行操作，那么x[]也会被改变
     */
    ModifyingArraysAsList modifyingArraysAsList;


    Object2 Object2;//这个是动手写的反向遍历的例子，要好好看一下


}
