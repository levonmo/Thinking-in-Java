package object;

public class Employee {

    private int ID;
    private String name;
    private int managerID;

    public Employee() {
    }

    public Employee(int ID, String name, int managerID) {
        this.ID = ID;
        this.name = name;
        this.managerID = managerID;
    }


    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }


}
