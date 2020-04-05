package object;

public class Dog {

    String name;
    String says;


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "spot";
        dog.says = "Ruff!";
        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        System.out.println(dog.name + ":" + dog.says + dog2.name + ":" + dog2.says);
        //创建一个新的Dog索引，并对其赋值为sport对象
        Dog dog3 = dog;
        System.out.println(dog3 == dog);
        System.out.println(dog3.equals(dog));
    }

}
