package object;

public class Wind extends Instrument {

    public static void main(String[] args) {
        Wind wind = new Wind();
        Instrument.tune(wind);//这里是向上转型
        /*
         * 这里是向上转型：
         * 		由导出类转型成基类，在继承图是向上移动的。由于向上转型是从一个  较专用类型  向  较通用类型  转换，所以总是安全的(但是有可能出现导出类方法的丢失)。
         * 		也就是说导出类是基类的一个超集，它可能比基类含有更多的方法。但它必须至少具备基类中所含有的方法。
         */
    }

}

class Instrument {
    public void play() {
        System.out.println("Instrument.play");
    }

    public static void tune(Instrument i) {
        i.play();
    }
}