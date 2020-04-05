package code_list_two;

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        //这里内部类进行向上转型，引用是接口类型的，指向的是内部类。完全隐藏的内部类实现的细节
        Contents c = p.getContents();
        System.out.println(c.value());
        /*
         *	这也是一个内部类向上转型 (用接口类型接收)
         *	private内部类给设计者提供一种途径，通过这种方式可以完全阻止任何依赖于类型的编码。同时在客户端也不能访问任何新增加的 原本不属于该接口的方法。
         */
        Destination1 d = p.getDestination1("H");
        System.out.println(d.readLabel());
    }
}

interface Destination1 {
    String readLabel();//这是一个方法
}

interface Contents {
    int value();
}

class Parcel4 {
    //这是一个内部类
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    //这又是一个内部类,protected只有子类或者是与该类同一个包可以访问到PDestination1
    protected class PDestination1 implements Destination1 {
        private String label;

        public PDestination1(String label) {
            this.label = label;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination1 getDestination1(String labe) {
        return new PDestination1(labe);
    }

    public Contents getContents() {
        return new PContents();
    }
}
