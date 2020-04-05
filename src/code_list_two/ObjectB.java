package code_list_two;

//构造器里面的多态
public class ObjectB {
    public static void main(String[] args) {
        (new ObjectBB()).print();
        /*
         * 调用这行代码时，先找ObjectBB是否有基类，有基类的话，先加载基类，调用基类的构造器,基类的构造器中有一个print()方法，
         * 	因为多态的存在调用的是导出类的print()方法，但是这时候导出类对象还没有初始化，输出i的值为0(在任何事情发生之前，将分配给对象的存储空间初始化为二进制的零)
         * 	基类对象构造完毕，准备构造导出类对象，初始化i值为1，调用构造器，这时候i的值为1
         */
    }
}

abstract class ObjectBA {
    public ObjectBA() {
        print();
    }

    public abstract void print();//这是一个抽象方法
}

class ObjectBB extends ObjectBA {
    private int i = 1;

    public void print() {
        System.out.println(i);
    }

}