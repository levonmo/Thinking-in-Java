package object2;

//局部内部类
public class Parcel5 {
    public Destination1 destination(String s) {
        //这是一个局部内部类，是定义在方法里面的，实现Destination1接口
        class PDestination implements Destination1 {
            private String label;

            private PDestination(String label) {
                this.label = label;
            }//这是一个构造器,需要将方法传过来的参数传进构造器

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);//这里是向上转型了
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination1 destination = parcel5.destination("H");
        System.out.println(destination.readLabel());
    }

}