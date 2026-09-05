/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Dell
 */
public class FallTimeEmployee extends Employee{

    public FallTimeEmployee(String name, int id, int workingHours) {
        super(name, id, workingHours);
    }
    @Override
    public double calculateSalary() {
        return getworkingHours()*18+20;
    }
    
}
