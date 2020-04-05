package object;

public class StaticWord {

    Bowl Bowl2 = new Bowl("这是非静态");
    static Bowl Bowl1 = new Bowl("这是静态");//静态的要比非静态的初始化早，尽管非静态排在静态的前面

    public static void main(String[] args) {
        StaticWord staticWord = new StaticWord();
    }
}

class Bowl {
    public Bowl(String marker) {
        System.out.println("marker初始化了，" + marker);
    }
}
