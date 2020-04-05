package code_list_one;

//构造器内部的多态方法
public class PolyConstructors {
    public static void main(String[] args) {//1.寻找是否存在基类
        new RoundGlyph(5);
    }
}

class Glyph {
    public Glyph() {//3.调用基类的构造器
        System.out.println("Glyph构造器前面");
        draw();
        /*4.执行到这一步，就会因为多态的原因，调用的是导出类的draw()方法，而不是基类的，但是这时候导出类的draw()方法还没有初始化，这时候就会出现数据错误(radius为0，而不是默认值1)
         *	 因为在还没有发生事之前，将分配对象的存储空间初始化为二进制的零。所以打印出的值是0
         */
        System.out.println("Glyph构造器后面");
    }

    public void draw() {
        System.out.println("Glyph.draw");
    }
}

class RoundGlyph extends Glyph {//2.存在基类，去到基类
    private int radius = 1;//5.初始化成员变量，radius的值为1

    public RoundGlyph(int r) {//6.调用构造器，radius的值为5
        radius = r;
        System.out.println("RoundGlyph构造器,radius=" + radius);//7.调用到这一步，radius的值就被赋值为5了
    }

    public void draw() {
        System.out.println("RoundGlyph.draw,radius=" + radius);
    }
}
