package code_list_two;

//工厂方法设计模式
public class Factories {
    public static void serviceConsumer(ServiceFactory fac) {
        Serivce s = fac.getSerivce();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        ServiceFactory fac1 = new ServiceFactoryImpl();
        serviceConsumer(fac1);
        ServiceFactory fac2 = new ServiceFactoryImpl2();
        serviceConsumer(fac2);
    }
}

//接口
interface Serivce {
    void method1();

    void method2();
}

interface ServiceFactory {
    Serivce getSerivce();
}

//实现类
class SerivceImpl implements Serivce {
    public void method1() {
        System.out.println("SerivceImpl.method1");
    }

    public void method2() {
        System.out.println("SerivceImpl.method2");
    }
}

class SerivceImpl2 implements Serivce {
    public void method1() {
        System.out.println("SerivceImpl2.method1");
    }

    public void method2() {
        System.out.println("SerivceImpl2.method2");
    }
}

class ServiceFactoryImpl implements ServiceFactory {
    public Serivce getSerivce() {
        return new SerivceImpl();
    }
}

class ServiceFactoryImpl2 implements ServiceFactory {
    public Serivce getSerivce() {
        return new SerivceImpl2();
    }
}

