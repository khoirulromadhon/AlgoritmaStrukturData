/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_4;

/**
 *
 * @author User
 */
import static Minggu_4.minMax.max_min;
import java.util.Scanner;
public class main_minMax {
    public static void main(String[] args){
        minMax[] ppArray = new minMax[5];
        int[] arr = new int[5];
        minMax hasil = new minMax();
        ppArray[0] = new minMax();
        
        Scanner kr = new Scanner (System.in);
        
        for (int i=0;i<5;i++){
            ppArray[i] = new minMax();
            System.out.println("Nilai array indeks ke-"+i);
            System.out.print("Masukan nillai: ");
            ppArray[i].nillaiArray = kr.nextInt();
        }
        
//        int max=ppArray[0].nillaiArray;
//        for (int i=0;i<5;i++){
//            if (ppArray[i].nillaiArray<min){
//                min = ppArray[i].nillaiArray;
//            }
//            else if (ppArray[i].nillaiArray>max){
//                max = ppArray[i].nillaiArray;
//            }
//        }
        for (int i=0;i<5;i++){
            arr[i] = ppArray[i].nillaiArray;
        }

        minMax m = new minMax();
        m.minMax(arr, 5);
        
        System.out.println("Brute Force");
        System.out.println("Nilai minimal: "+m.getMin());
        System.out.println("Nilai maksimal: "+m.getMax());
        
        
        
        max_min(arr, 0, 4, hasil);
        
        System.out.println("Devide and Conquer");
        System.out.print("Nilai Minimal: "+hasil.minimum+"\nNilai Maksimal: "+hasil.maximum);
        System.out.println("\n");
    }
}
