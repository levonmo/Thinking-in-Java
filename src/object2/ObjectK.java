package object2;

import object2.ObjectK.ObjectKInner;

//创建一个含有private域和private方法的类。创建一个内部类，它有一个方法修改外围类的域和调用外围类的方法。在外围类有一个方法，可以创建内部类对象。并且调用内部类的方法
public class ObjectK {
    private int i = 1;

    private void method() {
        System.out.println("ObjectK.method" + "  i的值为：" + i);
    }

    //获取内部类对象
    public ObjectKInner getObjectKInner() {
        (new ObjectKInner()).toOuter(6);//外围类还可以调用内部类的方法
        return new ObjectKInner();
    }

    class ObjectKInner {
        //第一种方式
        public void toOuter(int j) {
            i = j;//内部类可以访问外围类的所有数据
            method();
        }

        //第二种方式
        public void toOuter2(int j) {
            ObjectK.this.i = j;
            ObjectK.this.method();
        }
    }

    public static void main(String[] args) {
        ObjectK objectK = new ObjectK();
        ObjectKInner objectKInner = objectK.getObjectKInner();
        objectKInner.toOuter(3);//这样通过内部类就可以修改外围类的数据了
        objectKInner.toOuter2(4);//通过这种方法也可以修改外围类的数据
    }
}
