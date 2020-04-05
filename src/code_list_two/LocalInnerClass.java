package code_list_two;

//局部内部类与匿名类的比较
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        //下面就是一个局部内部类，这样定义一个类可以创建多个对象
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter.构造器");
            }

            public int next() {
                System.out.println(name);
                return count++;
            }
        }

        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        //下面是一个匿名内部类，只能返回一个对象的实现
        return new Counter() {
            public int next() {
                System.out.println("getCounter2.构造器");
                return count++;
            }
        };

    }

    /*
     * 分别使用局部内部类和匿名内部类实现了这个功能，它们具有相同的功能。既然局部内部类的名字在方法体外是不可见的，那为什么仍然使用局部内部类而不是匿名内部类?
     * 	唯一的理由是：使用局部内部类就有了一个已命名的构造器，或者需要重载构造器，而匿名内部类只能用于实例初始化
     * 		使用局部内部类而不使用匿名内部类的另一个理由就是，需要不止一个该内部类的对象。
     *
     */
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("A");
        Counter c2 = lic.getCounter2("B");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}

interface Counter {
    int next();
}

