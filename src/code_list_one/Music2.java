package code_list_one;

class Stringed extends Instrument1 {
    public void play(Note n) {
        System.out.println("Stringed.play()");
    }
}

class Brass extends Instrument1 {
    public void play(Note n) {
        System.out.println("Brass.play()");
    }
}

public class Music2 {
    /*
     * 新增加的两个乐器 要为其编写特定类型的方法
     * 	重载三个方法，这样的话有大量的工作编写与维护代码
     *
     */
    public static void tune(Wind1 w) {
        w.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed s) {//新增一个类型就要新增加一个方法，并且难于维护
        s.play(Note.MIDDLE_C);
    }

    public static void tune(Brass b) {
        b.play(Note.MIDDLE_C);
    }
}
