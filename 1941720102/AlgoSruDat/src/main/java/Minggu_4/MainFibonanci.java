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
import java.util.Scanner;
public class MainFibonanci {
    public static void main(String[] args){
        Scanner kr = new Scanner (System.in);
        Fibonanci f1 = new Fibonanci();
        
        System.out.print("Masukan jumlah deret fibonanci: ");
        f1.angka = kr.nextInt();
        
        
        System.out.println("Fibonanci Brute Force");
        System.out.println(f1.FibonanciBF(f1.angka));
        System.out.println();
        System.out.println("Fibonanci Devide Conquer");
        System.out.println(f1.FibonanciDC(f1.angka));
    }
}
