/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @authorRJR
 */
public class TestShape {
    public static void main (String[]RJR){
        Shape R=new Rectangle("red",4,5);
        System.out.println(R);
        System.out.println("Area is:"+R.getArea());
        
        Shape J=new Triangle("Blue",4,5);
        System.out.println(J);
        System.out.println("Area is:"+J.getArea());
    }
}
