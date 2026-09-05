package com.mycompany.main;
public abstract class Employee {
    private String name;
    private int id;
    private int workingHours;

    public void setworkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }
    public Employee(String name, int id, int workingHours) {
        setName(name);
        setId(id);
        setworkingHours(workingHours);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
       if (name.matches("[a-zA-Z]{2,}")){this.name = name;}
       else {System.out.println("The name contains two or fewer letters.");}
    }
    public void setId(int id) {
        if (id>999 &&id<10000){this.id = id;}
        else {System.out.println("ID must be exactly 4 digits");}
    }
    public void dsiplayInfo(){
        System.out.println("the name is \n"+getName()+" ID:\n"+getId()+"Salary:"+calculateSalary());
    }
    abstract public double calculateSalary();
}
