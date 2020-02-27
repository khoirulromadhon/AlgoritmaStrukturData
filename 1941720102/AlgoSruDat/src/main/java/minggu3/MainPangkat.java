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
public class MainPangkat {
    public static void main (String[] args){
        int elemen, pilih;
        Scanner kr = new Scanner (System.in);
        
        System.out.println("=================================================");
        System.out.print("Masukan jumlah elemen yang akan dihitung: ");
        elemen = kr.nextInt();
        
        Pangkat[] png = new Pangkat[elemen];
        
        for (int i=0;i<elemen;i++){
            png[i] = new Pangkat();
            System.out.print("Masukan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = kr.nextInt();
            System.out.print("Masukan nilai pangkat ke-"+(i+1)+" : ");
            png[i].pangkat = kr.nextInt();
        }
        
        System.out.println("Pilih algoritma");
        System.out.println("1.Brute Force");
        System.out.println("2.Devide and Conquer");
        System.out.print("Pilihan: ");
        pilih = kr.nextInt();
        
        switch(pilih){
            
        case (1):
        System.out.println("=================================================");
        System.out.println("Hasil pangkat dari Brute Force");
        for (int i=0;i<elemen;i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        break;
        
        case (2):
        System.out.println("Hasil pangkat dari Devide and Conquer");
        for (int i=0;i<elemen;i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        break;
        }
    }
}
