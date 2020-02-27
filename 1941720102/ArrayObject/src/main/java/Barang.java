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
public class Barang {
    public String nama;
    public int hargaSatuan, jumlah;
    
    /*Barang(){
    }
    Barang(String nm, int hs, int jml){
        nama = nm;
        hargaSatuan = hs;
        jumlah = jml;
    }*/
    
    void tampil(){
        System.out.println("Nama barang     :"+nama);
        System.out.println("Harga satuan    :"+hargaSatuan);
        System.out.println("Jumlah          :"+jumlah);
        System.out.println("Total           :"+hitungHargaTotal());
        System.out.println("Diskon          :"+hitungDiskon());
        System.out.println("Total akhir     :"+hitungHargaBayar());
    }
    
    public static void main (String[] args){
        Scanner khoirul = new Scanner (System.in);
        Scanner romadhon = new Scanner (System.in);
        Barang b1 = new Barang();
        
        System.out.print("Nama barang: ");
        b1.nama = khoirul.nextLine();
        System.out.print("Harga satuan: ");
        b1.hargaSatuan = romadhon.nextInt();
        System.out.print("Jumlah: ");
        b1.jumlah = romadhon.nextInt();
        
        b1.tampil();
    }
    
    int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }
    
    int hitungDiskon(){
        if (hitungHargaTotal()>10000){
            return hitungHargaTotal()*10/100;
        }
        else if (hitungHargaTotal() == 50000 && hitungHargaTotal() == 100000){
            return hitungHargaTotal()*5/100;
        }
        else{
            return 0;
        }
    }
    
    int hitungHargaBayar(){
        return hitungHargaTotal()-hitungDiskon();
    }
}
