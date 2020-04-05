package code_list_two;

//迭代器设计模式
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        //判断对象数组有没有满了
        if (next < items.length) {
            items[next] = x;//将对象添加入数组
            next = next + 1;//将下标数加一
        }
    }

    //这是一个Sequence的选择器，也是一个内部类
    private class SequenceSelector implements Selector {
        /*
         * 这里可以使用Selector引用指向SequenceSelector的具体实现类，因为SequenceSelector实现了该接口，所以它可以向上转型
         */
        private int i = 0;

        public boolean end() {
            return i == items.length;//内部类可以访问外部类的变量，items是一个引用，并不是SequenceSelector的一部分。同时内部类也可以访问外围类的方法
        }

        public Object current() {
            return items[i];
        }

        public void next() {//通过改变数组下标来改变数组对象
            if (i < items.length) {
                i++;
            }
        }

        //这个内部类的方法可以生成外部类的引用。当内部类调用这个方法的时候就可以返回到外围类的引用，从而就可以使用外围类的方法了
        public Sequence Outer() {
            return Sequence.this;
        }
    }

    //这个方法可以获取一个SequenceSelector对象(外围类获取内部类对象)
    public Selector getSelector() {
        return new SequenceSelector();
    }

    /*
     * ·内部类自动拥有外部类所有成员的访问权限，是如何做到的?
     * 	当某个外围类对象创建了一个内部类对象时(像上面这个方法，就可以通过外围类对象调用方法返回一个内部类对象)
     * 	此内部类对象必定会自动捕获一个指向那个外围类对象的引用。然后，当你在内部类访问外围类的成员时，你就可以通过那个引用选择外围类的成员了。(这个外围类的引用编译器会帮你处理的)
     * 	但你现在可以看到：内部类对象的创建只能在于外围类相关联的情况下才能被创建
     */
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < sequence.items.length; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.getSelector();//获得一个迭代器
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}