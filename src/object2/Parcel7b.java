package object2;

//这是上一个匿名类的展开写
public class Parcel7b {
    class MyContents implements Contents {
        private int i = 123;

        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();//这里会进行向上转型，MyContents类实现了Contents接口。可以用Contents引用来指向MyContents类的对象
    }

    public static void main(String[] args) {
        Parcel7b parcel7b = new Parcel7b();
        Contents c = parcel7b.contents();
        System.out.println(c.value());
    }
}
