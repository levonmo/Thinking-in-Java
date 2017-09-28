package test;

import java.util.ArrayList;

import object2.*;
import object3.A3;

public class Test2 {

	/*
	 * 9-11章
	 */
	
	
	/*-
	 * 第九章：接口
	 * 	·抽象类和抽象方法
	 * 	  ·抽象类的目的是为它的所有导出类创建一个通用的接口。建立这个通用接口的唯一理由是：不同的子类可以用不同的方式表示此接口。
	 * 		通用接口建立起一种形式，以此表示所有导出类的的共同部分，并称为抽象基类(或者是抽象类)。
	 * 	  ·那么抽象类的对象就没有任何的意义了(抽象类里面没有具体的实现)，并且编译器阻止你这样做
	 * 	·java提供一个叫做  抽象方法  的机制，这种方法是不完整的，只有声明而没有方法体
	 * 		abstract void f();
	 * 	  ·包含抽象方法的类叫做抽象类，就算只有一个该类也必须被定义为抽象类
	 * 	  ·如果从一个抽象类继承，并想为创建该新类的对象，那么就必须为基类中的所有抽象方法提供具体的实现。
	 * 		如果不这样做，那么导出类也必须定义为抽象类，且编译器将会强制我们使用abstract关键字来限定这个类。
	 * 	·一个没有任何抽象方法的类也可以被定义为抽象类(这样可以阻止创建该类的对象)
	 */
	Music4 music4;//抽象类
	
	/*
	 * 	·接口(interface)
	 * 	  ·interface是一个完全抽象的类，根本没有提供任何具体的实现，只是提供形式(允许创建者确定方法名，参数列表和返回值类型)
	 * 	  ·interface不仅是一个极度抽象的类，它还允许  导出类向上转型  为  多种基类的类型  (如果一个类实现了多个接口的话)
	 * 	  ·创建一个接口，需要用interface来代替class。可以在interface前面加上public，不加public的话这个接口类就是包访问权限
	 * 	  ·接口可以创建域，但是这些域都是隐式地是static和final
	 * 	  ·使用implements实现接口
	 * 	  ·接口中的所有方法都是public，无论你有没有显式的配置出来
	 */	
	
	 /*
	  *	·java中的多重继承
	  *	  ·只能继承一个类，但可以实现多个接口。继承写在接口的前面，接口名都置于implements后面，多个接口用逗号隔开。
	  *		class A extends B implements C, D{}
	  *	  ·可以继承任意多个接口，并一个类可以向上转型为多个类型，因为每一个接口都是一个独立的类型
	  *	  ·
	  */
	Adventure adventure;//一个类实现多个接口
	
	/*
	 * ·通过继承来扩充接口
	 * 	·通过继承，可以通过  原有接口  的基础上 扩充一个新的接口(使用extends关键字)
	 * 	·extends多继承只适合接口继承。一般情况，extends只能继承单一类，但是可以实现多个接口。
	 */
	HorrorShow horrorShow;
	
	/*
	 * ·组合接口时的名字冲突
	 * 	·在打算组合的不同接口中使用相同的方法名通常会造成代码可读性的混乱(比如接口A和接口B都有a方法)，请尽量避免这样做。
	 */
	ObjectF objectF;
	
	/*
	 * ·适配接口(这里是一个设计模式，以后要看看)
	 * 	·  
	 */
	
	/*
	 * ·接口中的域
	 * 	·放进接口中的任何域都自动是static和final的，所以接口就成为了一种很便捷的用来创建常量组的工具。(在枚举类型出现之前/SE5.0之前)
	 * 
	 * 	·初始化接口中的域
	 * 	  ·在接口中定义的域不能是"空final"，但是可以使用表达式来初始化
	 */
	Months months;//接口中创建常量
	TestRandVals testRandVals;//接口中的域
	
	/*
	 * ·嵌套接口
	 *	·接口可以嵌套到类或其他接口中
	 *	·当实现某个接口时，并不需要实现嵌套在其内部的任何接口
	 */
	NestingInterfaces nestingInterfaces;
	
	/*
	 *	·接口与工厂(工厂设计模式)
	 *	  ·生成  遵循某个接口的对象  的典型方式就是工厂方法设计模式。这与直接调用构造器不同，而是直接调用方法(方法内部有创建对象的代码)， 
	 */
	Factories factories;
	
	/*
	 * 练习
	 */
	ObjectA objectA;
	ObjectB objectB;
	ObjectC objectC;
	ObjectD objectD;
	ObjectG objectG;
	ObjectE objectE;
	ObjectH objectH;
	
	
	
	/*
	 * ·第十章：内部类
	 * 	·将一个类的定义放在另一个类的内部，这就是内部类
	 * 	·内部类是以一种非常有用的特征，它允许你将一些逻辑相关的类组织在一起，并控制内部类的可见性
	 * 	·内部类了解外围类，并与之通信
	 */
	
	/*
	 * ·创建内部类
	 * 	·在拥有外部类对象之前是不能创建该内部类对象的，因为内部类的创建必须要有一个外部类建立连接(就比如寄养生物，如果连寄主都没有，就不存在寄养生物了)
	 */
	Parcell parcell;

	/*
	 * ·链接到外部类
	 * 	·当生成一个内部类对象时，此对象与制作它的外围对象之间还有一种联系，所以它能访问其外围对象的所有成员。内部类还拥有其外围类的所有元素的访问权限
	 * 	·内部类是如何获取外围类的成员的?
	 * 	  ·内部类的创建必须要与某个外围类相关联的情况下才能被创建(可以通过外围类的一个方法返回一个新建的内部类)，内部类不能被单独创建(除了在外围类之内)
	 * 		当某个外围类对象创建了内部类时，此内部类就自动的获取了外围类的引用(编译器的事情)。当你在内部类要访问外围类的成员时，就会使用到这个引用
	 * 		注意：在构建内部类对象时，需要一个指向外围类对象的引用，否则创建不了内部类
	 */
	Sequence sequence;
	
	/*
	 * ·使用.this与.new
	 * 	·如果你需要在内部类生成对外部类对象的引用，可以使用外部类的名字后面紧跟圆点和this
	 * 	·new关键字，通过外围类的对象.new  可以得到一个内部类的对象。
	 * 		例如:Outer ou = new Outer();  Outer.Inner inn = ou.new Inner();
	 */
	DotThis dotThis;//生成外围类的引用
	DotNew dotNew;//new关键字
	Parcel parcel;
	
	/*
	 * ·嵌套类(静态内部类)，这样的类是不需要外部类的引用的
	 */
	
	/*
	 * ·内部类与向上转型
	 * 	·内部类可以实现接口，并可以  向上转型  (转换为接口类型的)。等到的对象(内部类对象)可以指向基类或者接口的引用，所以可以很方便地隐藏实现的细节
	 */
	TestParcel testParcel;
	
	/*
	 * ·在方法和作用域内的内部类：在方法里面或者在任意的作用域内定义内部类
	 * 	·这样做主要有：想创建一个类来辅助你解决方案，但是不希望这个类是公共可用的
	 * 	·局部内部类：在方法的作用域内的创建一个完整的类
	 */
	Parcel5 parcel5;//局部内部类：在方法里面定义的一个类
	Parcel6 parcel6;//这也是一个局部内部类，是定义在方法的if语块里面的

	/*
	 * ·匿名内部类
	 * 	·return new A() {} : 创建一个继承自A类(A可以是一个抽象类，具体类，或者是接口)的匿名类的对象
	 * 	·如果你定义的内部类，这个内部类需要使用在外部定义的对象(通过参数传入)，那么编译器会要求引用是final
	 * 	·
	 */
	Parcel7 parcel7;//匿名类
	Parcel7b parcel7b;//跟上面的匿名类效果是一样的，只不过是展开写了
	Parcel9 parcel9;//匿名使用了在外部定义的对象(通过参数传入)，就要将参数定义为final(在方法签名那定义)
	AnonymousConstructor anonymousConstructor;//匿名类没有构造器，new A(i)[} 会将参数传递给基类的构造器
	
	/*
	 * ·再访工厂方法
	 */
	Factories fact;
	//单一的工厂模式
	ObjectO objectO;
	
	/*
	 * ·嵌套类
	 * 	·如果不需要内部类对象与外围类对象之间有联系，那么可以将内部类声明为static。这通常称为嵌套类
	 * 	  ·嵌套意味着：1.创建嵌套类的对象，并不需要其外围类的对象  2.不能从嵌套类对象中访问非静态的外围类对象
	 * 	·普通内部类不能有static字段和方法  也不能包含嵌套类，但是嵌套类可以包含这些东西。嵌套类也没有this引用(内部类使用外围类类名.this可以得到外围类的引用)
	 * 
	 * 	·接口中的嵌套类
	 * 	 ·如果你想创建某些公共代码，使它们可以被某个接口的所有不同实现所共用，那么使用接口内部的嵌套类会显示得很方便
	 * 	 ·嵌套类可以成为接口中的一部分(该嵌套类还可以实现外围接口)。放在接口中的任何类都会成为public和static(所以在接口中定义嵌套类不用显式的声明为static)
	 */
	Parcel11 parcel11;//嵌套类的定义
	ClassInInterface classInInterface;//接口中的嵌套类
	
	/*
	 * 	·一个内部类被嵌套多少层不重要--它都能透明地访问所有它所嵌入的外围类的所有成员
	 */
	MultiNestingAccess multiNestingAccess;
	
	/*
	 * ·为什么使用内部类
	 * 	·一般来说，内部类继承某个类或者实现某个接口，内部类的代码操作的是创建它外围类的对象。所以可以认为内部类提供了某种进入其外围类的窗口
	 * 	·内部类非常灵活
	 *    ·比如，外围类需要一个实例要实现某个接口的，但是外围类又不是总是需要这个接口，选择用外围类去实现这个接口的话并不是一种很好的选择
	 * 	 这个时候选择用内部类去实现该接口   返回一个实现了某个接口的对象的话就会变得非常之灵活。
	 * 	  ·又比如：必须在一个类中已某种方式实现两个接口。由于接口的灵活性，你有两种选择：使用单一的类去实现，或者使用内部类
	 */
	MultiInterfaces multiInterfaces;//必须在一个类中已某种方式实现两个接口。由于接口的灵活性，你有两种选择：使用单一的类去实现，或者使用内部类
	
	/*
	 * ·可以实现多重继承(需要继承的基类都是抽象的或者具体的，而不是接口)，那就只能使用内部类才能实现多重继承
	 */
	MultiImplementation multiImplementation;
	
	/*
	 * ·内部类的继承
	 */
	InheritInner inheritInner;
	
	/*
	 * ·局部内部类
	 * 	·可以在代码块里创建内部类，典型的方式是在一个方法体的里面创建，局部内部类不能有访问修饰符，因为它不是外围类的一部分。但是它可以访问当前代码块的常量，以及外围类的所有
	 */
	LocalInnerClass localInnerClass;
	
  	/*
	 * 练习
	 */
	Outer outer;
	ObjectI objectI;	
	Outer1 outer1;
	ObjectJ objectJ;
	A3 a3;
	ObjectK objectK;
	ObjectL objectL;
	ObjectM objectM;
	ObjectN objectN;
	ObjectQ objectQ;
	ObjectR objectR;
	ObjectS objectS;

	
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