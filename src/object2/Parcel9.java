package object2;

//初始化字段了，参数引用为final
public class Parcel9 {
    public Destination1 destination1(final String dest) {
        return new Destination1() {
            private String str = dest;//如果匿名使用了在外部定义的对象(通过参数传入)，就要将参数定义为final

            public String readLabel() {
                return str;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        Destination1 destination1 = parcel9.destination1("HH");
        System.out.println(destination1.readLabel());
    }
}
