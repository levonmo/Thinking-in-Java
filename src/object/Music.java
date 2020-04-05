package object;

//在论向上转型 
class Instrument1 {
    public void play(Note n) {
        System.out.println("Instrument1.play()");
    }
}

class Wind1 extends Instrument1 {
    public void play(Note n) {
        System.out.println("Wind.play()");
    }
}

public class Music {

    /*
     * 该方法接受一个Instrument1类型的引用，同时也接受任何导出自Instrument1的子类
     * 	当一个Wind1引用传递到该方法时，就不需要任何的类型转换。这样做是允许的--因为Wind从Instrument1继承而来的
     * 	从Wind向上转型到Instrument1可能会"缩小"接口(这里应该是指方法的个数)，但是不会比Instrument1的全部接口更小。
     */
    public static void tune(Instrument1 i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind1 wind = new Wind1();
        tune(wind);//这里本来是接受Instrument1类型的，但是可以将它的导出类Wind1放进去，而不用类型转换
    }

}
