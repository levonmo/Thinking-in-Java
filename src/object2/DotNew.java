package object2;

//内部类：new关键字
public class DotNew {
    public class Inner {
        public void method() {
            System.out.println("H");
        }
    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inn = dotNew.new Inner();//这样是可以初始化一个内部类的
        inn.method();//这样就可以使用内部类的方法了
    }
}
