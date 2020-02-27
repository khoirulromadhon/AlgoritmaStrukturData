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
public class Persewaan {
    public int id, waktu, harga;
    public String nama, game;
   
    void tampilData(){
        System.out.println("Id                  : "+id);
        System.out.println("Nama                : "+nama);
        System.out.println("Nama game           : "+game);
        System.out.println("Lama pinjam (hari)  : "+waktu);
        System.out.println("Harga sewa          : "+harga);
        System.out.println("Total               : "+hitungTotal());
    }
    
    public static void main (String[] args){
        Scanner khoirul = new Scanner (System.in);
        Scanner romadhon = new Scanner (System.in);
        Persewaan p1 = new Persewaan();
        
        System.out.print("Masukan id barang: ");
        p1.id = khoirul.nextInt();
        System.out.print("Masukan nama member: ");
        p1.nama = romadhon.nextLine();
        System.out.print("Masukan nama game: ");
        p1.game = romadhon.nextLine();
        System.out.print("Lama pinjam(hari): ");
        p1.waktu = khoirul.nextInt();
        System.out.print("Harga sewa/hari: ");
        p1.harga = khoirul.nextInt();
        System.out.println();
        
        p1.tampilData();
    }
    
    int hitungTotal(){
        return harga*waktu;
    }
}
