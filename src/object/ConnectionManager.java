package object;

import java.sql.Connection;

/*
 * 客户端不能直接创建Connection对象，只能通过ConnectionManager类中一个static方法来获取它们，
 *	当ConnectionManager类中没有对象的时候，它就会返回一个null
 */
public class ConnectionManager {

    private static Connection[] conn;

    private ConnectionManager() {
        conn = new Connection[2];
    }

    public static ConnectionManager createObject() {//调用该方法创建一个对象给方法的调用者
        return new ConnectionManager();
    }

    public static Connection[] createConnection() {
        return conn;//
    }

    public static void main(String[] args) {
        Connection[] conn = ConnectionManager.createConnection();//创建一个Connection数组对象
        System.out.println(conn);//由于没有调用构造器进行初始化，所以返回的是一个空引用
        //调用static调用内部的构造方法进行初始化，数组等到初始化
        ConnectionManager.createObject();
        Connection[] conn2 = ConnectionManager.createConnection();
        //数组对象被内部的构造器初始化，数组对象不再是null
        System.out.println(conn2);
    }

}
