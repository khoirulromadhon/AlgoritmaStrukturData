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
public class MainSum {
    public static void main(String[] args){
        Scanner kr = new Scanner (System.in);
        int jumlah;
        int[] perusahaan;
        System.out.println("=================================================");
        System.out.print("Masukan jumlah perusahaan: ");
        jumlah = kr.nextInt();
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.6)");
        System.out.print("Masukan jumlah bulan: ");
        int elm = kr.nextInt();
        perusahaan = new int[jumlah];
        
        Sum sm = new Sum(elm);
        for (int k=0;k<perusahaan.length;k++){
            System.out.println("Perusahaan ke-"+(k+1));
        System.out.println("=================================================");
        for (int i=0;i<sm.elemen;i++){
            System.out.print("Masukan untung bulan ke-"+(i+1)+" = ");
            sm.keuntungan[i] = kr.nextDouble();
        }
        }
        
        for (int j=0;j<perusahaan.length;j++){
        System.out.println("=================================================");
        System.out.println("Algoritma Brute Force");
        System.out.printf("Total keuntungan perusahaan "+(j+1)+" selama "+sm.elemen+" bulan adalah = "+String.format("%.2f",sm.totalBF(sm.keuntungan)));
        System.out.println();
        System.out.println("Algoritma Devide Conquer");
        System.out.println("Total keuntungan perusahaan "+(j+1)+" selama "+sm.elemen+" bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
            
        }
    }
}
