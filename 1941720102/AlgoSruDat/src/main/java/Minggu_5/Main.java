/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_5;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner k = new Scanner (System.in);
        Scanner r = new Scanner (System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jmMhs = 5;
        
        for (int i = 0; i<jmMhs; i++){
            System.out.print("Nama = ");
            String nama = r.nextLine();
            System.out.print("Tahun Masuk = ");
            int thn = k.nextInt();
            System.out.print("Umur = ");
            int umur = k.nextInt();
            System.out.print("IPK = ");
            double ipk = k.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("Data mahasiswa sebelum sorting");
        data.tampil();
        System.out.println();
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan IPK");
        data.bubbleshort();
        data.tampil();
        System.out.println();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan IPK");
        data.selectionSort();
        data.tampil();
        System.out.println();
        System.out.println("Data setelah di insertion sort");
        data.insertionSort(true);
        data.tampil();
    }
}
