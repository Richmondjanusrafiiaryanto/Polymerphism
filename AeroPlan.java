/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author yusri
 */
public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("AeroPlan is Flying");
    }
    public static void main(String []RJR){
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}

