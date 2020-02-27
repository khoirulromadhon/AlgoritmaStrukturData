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
public class JajarGenjang {
    public int a, b, t;
    
    public static void main (String[] args){
        Scanner kr = new Scanner (System.in);
        JajarGenjang j1 = new JajarGenjang();
        JajarGenjang[] array = new JajarGenjang[5];
        int i;
        
        for (i=0;i<array.length;i++){
            //array[i] = new JajarGenjang();
            System.out.println("Jajar genjang ke-"+i);
            System.out.print("a: ");
            array[i].a = kr.nextInt();
            System.out.print("b: ");
            array[i].b = kr.nextInt();
            System.out.print("t: ");
            array[i].t = kr.nextInt();
            array[i].hitungLuas();
            array[i].hitungKeliling();
        }
        
        for (int j=0;j<array.length;j++){
            System.out.println("Jajar genjang ke-"+j);
            System.out.println("Luas: "+array[j].hitungLuas());
            System.out.println("Keliling: "+array[j].hitungKeliling());
        }
    }
    
    int hitungLuas(){
        return a*t;
    }
    
    int hitungKeliling(){
        return 2*(a+b);
    }
}
