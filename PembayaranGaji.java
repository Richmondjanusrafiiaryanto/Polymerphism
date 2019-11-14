/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @authorRJR
 */
public class PembayaranGaji {
    public int hitunggaji(Pegawai peg){
        int uang =peg.gaji();
        if (peg instanceof Direktur) {
            uang+=((Direktur)peg).tunjangan();
            if (peg instanceof Staf) {
                uang+=((Staf)peg).bonus();
            }
        }
        return uang;
    }
    public static void main (String[]args){
        PembayaranGaji ping=new PembayaranGaji();
        Staf Anto=new Staf();
        Direktur RJR=new Direktur();
        System.out.println("Gaji yang dibayarkan untuk staff="+ping.hitunggaji(Anto));
        System.out.println("Gaji yang dibayarkan kepada Direktur="+ping.hitunggaji(RJR));
    }
}
