package code_list_two;

import java.util.Arrays;

public class Apply {
    /*
     * 该方法可以接受任何类型的Processor导出类，并应用到一个Object对象上。像这样，创建一个能够根据所传递的参数对象的不同而具有不同行为的方法，被称为策略设计模式
     * 	策略就是传递进去的参数，在main方法中可以看到有三中不同类型的策略引用到String类型的对象上
     */
    public static void process(Processor p, Object s) {
        System.out.println("名字：" + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        String s = "AA AAAaa aa";
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

class Processor {
    public String name() {
        return this.getClass().getSimpleName();
    }//

    public Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
