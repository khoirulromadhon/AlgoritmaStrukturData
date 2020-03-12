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
public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;
    
    Mahasiswa(){
    }
    public Mahasiswa(String nama, int thnMasuk, int umur, double ipk) {
        this.nama = nama;
        this.thnMasuk = thnMasuk;
        this.umur = umur;
        this.ipk = ipk;
    }
    
    void tampil(){
        System.out.println("Nama = "+this.nama);
        System.out.println("Tahun Masuk = "+this.thnMasuk);
        System.out.println("Umur = "+this.umur);
        System.out.println("IPK = "+this.ipk);
    }
}
