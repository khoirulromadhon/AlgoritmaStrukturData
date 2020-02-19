/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public static void main (String[] args){
        PersegiPanjang[] pparr = new PersegiPanjang[3];
        
        Scanner kr = new Scanner (System.in);
        
        for(int i=0;i<3;i++){
            pparr[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukan panjang: ");
            pparr[i].panjang = kr.nextInt();
            System.out.print("Masukan lebar: ");
            pparr[i].lebar = kr.nextInt();
        }
        
        for(int i=0;i<3;i++){
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+pparr[i].panjang+", lebar: "+pparr[i].lebar);
        }
    }
}
