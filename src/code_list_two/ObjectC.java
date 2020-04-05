package code_list_two;

//在某个包内创建一个接口，内含三个方法，然后在另一个包中实现此接口
public interface ObjectC {
    void methodA();

    void methodB();

    void mehtodC();
}

class ObjectCA implements ObjectC {
    public void methodA() {
    }

    public void methodB() {
    }

    public void mehtodC() {
    }
}
