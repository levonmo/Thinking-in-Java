package code_list_two;

//匿名类
public class Parcel7 {
    public Contents contents() {
        return new Contents() {  //new Contents(){}的意思是创建一个  继承或者实现了 Contents类的新类(这个类没有名字)。并不是完全重新定义一个新类
            private int i = 123;  //这是在Contents类的基础上新增加的域

            public int value() {
                return i;
            }  //这个实现Contents接口需要实现了方法
        };//这里的分号并不是标志着内部类的结束，标记的是表达式的结束。
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents c = parcel7.contents();
        System.out.println(c.value());
    }
}
