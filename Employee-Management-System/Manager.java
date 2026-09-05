package com.mycompany.main;
public class Manager extends Employee{

    public Manager(String name, int id, int workingHours) {
        super(name, id, workingHours);
    }

    @Override
    public double calculateSalary() {
        return 3000+(getorkingHours()*25);
    }
    
}
