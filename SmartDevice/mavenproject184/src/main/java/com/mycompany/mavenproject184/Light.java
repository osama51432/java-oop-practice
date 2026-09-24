/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject184;

/**
 *
 * @author Dell
 */
public class Light implements SmartDevice{
    @Override
    public void turno() {
        System.out.println("light on");
    }
    @Override
    public void turnof() {
        System.out.println("Light of");
    }
    
}
