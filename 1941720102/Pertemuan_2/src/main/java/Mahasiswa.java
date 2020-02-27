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
public class Mahasiswa {
    public static void main (String[] args){
        Scanner kr = new Scanner(System.in);
        
        int jumlah;
        
        System.out.print("Masukan jumlah mahasiswa: ");
        jumlah = kr.nextInt();
        
        int[] mhs = new int [jumlah];
        int[] nilai_1 = new int[jumlah];
        int[] nilai_2 = new int[jumlah];
        
        for (int i=0;i<jumlah;i++){
            System.out.println("mhs "+(i+1));
            mhs[i] = i;
            System.out.print("Nilai 1: ");
            nilai_1[i] = kr.nextInt();
            System.out.print("Nilai 2: ");
            nilai_2[i] = kr.nextInt();
        }
        
        for (int j=0;j<jumlah;j++){
            if (nilai_1[j]>nilai_2[j]){
                System.out.println("Nilai terbaik Mhs "+(mhs[j]+1)+": "+nilai_1[j]);
            }
            else{
                System.out.println("Nilai terbaik Mhs "+(mhs[j]+1)+": "+nilai_2[j]);
            }
        }
    }
}
