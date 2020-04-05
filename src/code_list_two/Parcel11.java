package code_list_two;

//嵌套类
public class Parcel11 {
    //这是一个嵌套类，有外围类，有static修饰class
    private static class ParcelContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    //这是另外一个嵌套类
    protected static class ParcelDestination implements Destination1 {
        private String str;

        private ParcelDestination(String str) {
            this.str = str;
        }

        public String readLabel() {
            return str;
        }

        static int i = 1;//可以在嵌套类内部定义一个static字段
    }

    public static Contents getContents() {
        return new ParcelContents();//这里进行了向上转型
    }

    public static Destination1 getDestination1(String s) {
        return new ParcelDestination(s);//这里也进行了向上转型
    }
}
