package object;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 启动main函数 体验效果
 */
public class ReadTxt {
    private FileReader reader;
    private BufferedReader bufferedReader;

    /*
     * 将一个文件的路径名构造一个对象
     */
    public ReadTxt(String string) throws FileNotFoundException {
        this.reader = new FileReader(string);
        this.bufferedReader = new BufferedReader(reader);
    }

    //根据ID将用户信息查询出来
    private Employee findEmployeeById(int id) throws IOException {
        Employee employee = new Employee();
        boolean flag = true;
        String mes = null;
        while (flag) {
            mes = bufferedReader.readLine();
            //给定指定的字符串进行分割成String数组
            String[] mesArr = mes.split("#");
            if (id == Integer.valueOf(mesArr[0])) {
                employee.setID(id);
                employee.setName(mesArr[1]);
                employee.setManagerID(Integer.valueOf(mesArr[2]));
                flag = false;
                break;
            }
        }
        return employee;
    }

    //指定一个用户的ID将其下属的 信息查询出来
    private ArrayList<Employee> findBranchByManagerID(int managerID) throws IOException {
        ArrayList<Employee> list = new ArrayList<Employee>();
        while (true) {
            String mes = null;
            mes = bufferedReader.readLine();
            if (mes == null) {
                break;
            }
            String[] mesArr = mes.split("#");
            if (managerID == Integer.valueOf(mesArr[2])) {
                Employee employee = new Employee(Integer.parseInt(mesArr[0]), mesArr[1], Integer.parseInt(mesArr[2]));
                list.add(employee);
            }
        }
        return list;
    }

    //根据ID将其信息和下属信息全部打印出来
    public void findSelfAndBranch(int id) throws IOException {
        Employee employee = findEmployeeById(id);
        System.out.println(employee.getID() + "  " + employee.getName());
        ArrayList<Employee> employeeBranch = findBranchByManagerID(employee.getID());
        for (Employee e : employeeBranch) {
            System.out.println("  " + e.getID() + "  " + "--" + e.getName());
        }
    }

    //将所有的员工各自的ID查询出来
    public ArrayList<Integer> findAllEmployee() throws IOException {
        //这个数组是装员工的ID的
        ArrayList<Integer> list = new ArrayList<Integer>();
        String mes = null;
        while (true) {
            mes = bufferedReader.readLine();
            if (mes == null) {
                //mes为null到达文本的末尾
                break;
            }
            String[] mesArr = mes.split("#");
            //将所有员工的ID查询出来放进一个数组里面
            list.add(Integer.parseInt(mesArr[0]));
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        ReadTxt readTxt = new ReadTxt("data.txt");
        ArrayList<Integer> list = readTxt.findAllEmployee();
        System.out.println(list);
    }
}
