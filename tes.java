/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @authorRJR
 */
public class tes {
    public static void main(String []Rjr){
        Line RJR=new Line(5,10,10,20);
        System.out.println(RJR.getLength());
        System.out.println(RJR.isGreater(RJR, RJR));
        System.out.println(RJR.isLess(RJR, RJR));
        System.out.println(RJR.isEqual(RJR, RJR));
    }
}

