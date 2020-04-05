package code_list_one;

public class CovariantReturn {
    public static void main(String[] args) {

        Mill m1 = new Mill();
        Grain p1 = m1.process();
        System.out.println(p1);//这里都是正常的

        Mill m2 = new WheatMill();
        Grain p2 = m2.process();
        System.out.println(p2);
    }
}

class Grain {
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    public Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    /*
     * 这里重写了process方法，返回值得类型是Wheat，与基类中该方法的返回值是不一样的(基类的返回值类型是Grain)。尽管Wheat是Grain的导出类也不可以
     * 	但是在5.0之后，只要覆盖的方法的返回值是其基类的导出类就可以了，就可以使用该类型来接收。
     * 	一句话：覆盖的方法返回值类型不一定要与基类的一样(是其导出类也可以)
     */
    public Wheat process() {
        return new Wheat();
    }
}