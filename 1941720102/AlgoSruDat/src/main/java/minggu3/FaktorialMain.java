/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class FaktorialMain {
    public static void main (String[] args){
        Scanner kr = new Scanner (System.in);
        int elemen;
        
        System.out.println("=================================================");
        System.out.print("Masukan jumlah elemen yang akan dihitung: ");
        elemen = kr.nextInt();
        
        Faktorial[] fk = new Faktorial[elemen];
        for (int i=0;i<elemen;i++){
            fk[i] = new Faktorial();
            System.out.print("Masukan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = kr.nextInt();
        }
        
        System.out.println("=================================================");
        double startTime=System.currentTimeMillis();
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah "+fk[i].faktorialBF(fk[i].nilai));
        }
        double endTime=System.currentTimeMillis();
        double elapsedTime=(endTime-startTime)/1000;
        System.out.println("Waktu eksekusi: "+String.valueOf(elapsedTime)+" detik"); 
        
        System.out.println("=================================================");
        startTime=System.currentTimeMillis();
        System.out.println("Hasil Faktorial dengan Devide and Conquer");
        for (int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah "+fk[i].faktorialDC(fk[i].nilai));
        }
        endTime=System.currentTimeMillis();
        elapsedTime=(endTime-startTime)/1000;
        System.out.println("Waktu eksekusi: "+String.valueOf(elapsedTime)+" detik");  
        System.out.println("=================================================");
    }
}
