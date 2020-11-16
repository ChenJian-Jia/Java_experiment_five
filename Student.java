package cn.itcast.experiment.five;

public class Student {
    private String name;
    private String Class;

    private int ID;
    Student(String name,String Class,int ID){

        setSex(Class);
        setID(ID);
        setName(name);


    }
    Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return Class;
    }

    public void setSex(String sex) {
        this.Class = sex;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String toString(){
        return "姓名为："+name+"，班级为："+Class+"，编号为："+ID;
    }
}
