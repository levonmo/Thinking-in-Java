package object;

import java.util.Random;

public class Shapes {
    private static RandomShapeGen randomShapeGen = new RandomShapeGen();

    public static void main(String[] args) {
        /*
         * 这里编写  只与  基类  打交道的代码
         * 	但是产生的代码是与导出类打交道的，正是由于动态绑定实现多态的存在
         */
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = randomShapeGen.next();
        }
        for (Shape shape : s) {//将上面的数组进行遍历
            shape.draw();
        }
        Shape s1 = new Quadrilateral();
        s1.draw();
        s1.erase();
    }
}

class Shape {
    //什么也不写，导出类来覆盖这些定义
    public void draw() {
    }

    public void erase() {
    }
}

class Circle extends Shape {
    @Override//这个注解作用，当你想重写，却重新定义了一个方法，就会报错
    public void draw() {
        System.out.println("Circle.draw");
    }

    public void erase() {
        System.out.println("Circle.erase");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Square.draw");
    }

    public void erase() {
        System.out.println("Square.erase");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle.draw");
    }

    public void erase() {
        System.out.println("Triangle.erase");
    }
}

class Quadrilateral extends Shape {
    public void draw() {
        System.out.println("Quadrilateral.draw");
    }

    public void erase() {
        System.out.println("Quadrilateral.erase");
    }
}

class RandomShapeGen {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {//只产生012这三个数
            //根据上面产生三个不同的数，返回不同的类型
            default:
                //这里向上转型发生在return语句中，由一个导出类转型为一个基类
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}