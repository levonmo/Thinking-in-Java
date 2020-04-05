package object2;

//这是外部类
public class Parcell {
    //这是内部类
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    //这是另一个内部类
    class Destination {
        private String label;//这是一个域

        public Destination(String label) {
            this.label = label;
        }//这是一个构造器

        String getLabel() {
            return label;
        }//这是一个方法
    }

    //注意这两个方法
    public Contents contents() {
        return new Contents();
    }//这里用到工厂方法设计模式，调用一个方法就可以返回一个指向内部类的引用

    public Destination destination(String s) {
        return new Destination(s);
    }//这里传人参数s，因为构造这个对象需要一个String类型的数据

    //这个方法可以获得两个对象，并调用其中一个对象的方法
    public void ship(String dest) {
        Contents c = contents();//调用contents这个方法
        Destination d = destination(dest);
        System.out.println(d.getLabel());
    }

    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("dest");
        //可以使用这种方式来指明这个对象的类型。外部类型.内部类型
        Parcell.Contents c1 = p.contents();//
        Parcell.Destination d2 = p.destination("1");
    }

}
