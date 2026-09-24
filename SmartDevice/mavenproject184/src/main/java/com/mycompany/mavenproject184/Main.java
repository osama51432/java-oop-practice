/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject184;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        SmartDevice osama=new Light();
        ArrayList<SmartDevice> devices = new ArrayList<SmartDevice>();
        devices.add(new AirConditinoer());
        devices.add(new Light());
        for (SmartDevice de:devices){
            de.turno();
        }
        for (SmartDevice de:devices){
            de.turnof();
        }
    }
}
