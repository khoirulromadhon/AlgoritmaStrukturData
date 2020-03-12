/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Quiz_1_main {
    public static void main (String[] args){
        Scanner kr = new Scanner (System.in);
        Quiz_1 q = new Quiz_1();
        
        System.out.print("Masukan Nama: ");
        q.nama = kr.nextLine();
        
        q.hitungChar(q.nama);
        q.BKBF(q.nama);
        q.BKDC(q.nama, 0, q.nama.length()-1);
        
        System.out.println();
        System.out.println("Brute Force");
        System.out.println("Huruf Terbesar: "+q.getBesar());
        System.out.println("Huruf Terkecil: "+q.getKecil());
        System.out.println();
        System.out.println("Devide and Conquer");
        System.out.println("Huruf Terbesar: "+q.getBesar());
        System.out.println("Huruf Terkecil: "+q.getKecil());
    }
}
