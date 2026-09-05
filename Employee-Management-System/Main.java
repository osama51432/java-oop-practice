/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList <Employee> emp=new ArrayList();
        while (true) {            
            System.out.println("if you whant to add manager enter 1 \n"
            + "if you whant to add Full time employee enter 2 \n"
            +"if you whant to stop adding and print the ruslte enter Any other number");
            int temp=input.nextInt();
            if (temp==1){
                System.out.print("Enter Name: ");
                String name = input.next();
                System.out.print("Enter ID: ");
                int id = input.nextInt();
                System.out.print("Enter Working Hours: ");
                int workingHours = input.nextInt();
                emp.add(new Manager(name, id,workingHours));
                System.out.println("The manager was successfully added");
            } else if (temp==2){
                System.out.print("Enter Name: ");
                String name = input.next();
                System.out.print("Enter ID: ");
                int id = input.nextInt();
                System.out.print("Enter Working Hours: ");
                int workingHours = input.nextInt();
                emp.add(new Manager(name, id,workingHours));
                System.out.println("The Employee was successfully added");
            }else {
                System.out.println("Do you whant to print the Results? if yes enter 1");
                if (input.nextInt()==1){
                    for (Employee e:emp) {
                        e.dsiplayInfo();
                    }
                }
             break;
            }
            
        }
   
    }
}
