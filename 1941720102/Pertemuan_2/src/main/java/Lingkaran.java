/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Lingkaran {
    public double phi = 3.14, jari;
    
    double hitungLuas(double jari){
        return phi*jari*jari;
    }
    
    double hitungKeliling(double jari){
        return 2*phi*jari;
    }
    
    public static void main (String[] args){
        Lingkaran L1 = new Lingkaran();
        System.out.println("Luas = "+L1.hitungLuas(6));
        System.out.println("KEliling = "+L1.hitungKeliling(6));
    }
}
