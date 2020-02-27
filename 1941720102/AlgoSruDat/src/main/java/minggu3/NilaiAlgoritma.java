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
public class NilaiAlgoritma {
    
    public static void main (String[] args){
       Scanner khoirul = new Scanner (System.in);
        Scanner romadhon = new Scanner (System.in);
        //NilaiObject n1 = new NilaiObject();
        
        System.out.print("Masukan jumlah mahasiswa: ");
        int jumlah = khoirul.nextInt();
        NilaiObject[] mhs = new NilaiObject[jumlah];
        int p = mhs.length;
        
        for (int i=0;i<p;i++){
            mhs[i] = new NilaiObject();
            System.out.print("Masukan nama mahasiswa: ");
            mhs[i].setNamaMhs(romadhon.nextLine());
            System.out.print("Masukan nilai tugas: ");
            mhs[i].setNilaiTugas(khoirul.nextInt());
            System.out.print("Masukan nilai kuis: ");
            mhs[i].setNilaiKuis(khoirul.nextInt());
            System.out.print("Masukan nilai UTS: ");
            mhs[i].setNilaiUTS(khoirul.nextInt());
            System.out.print("Masukan nilai UAS: ");
            mhs[i].setNilaiUAS(khoirul.nextInt());
        }
            
        
        for (int k=0;k<p;k++){
            System.out.print("Nilai total "+mhs[k].getNamaMhs());
            System.out.println(" adalah "+mhs[k].getNilaiTotal());
        }
        
        double total = 0;
        
        for (int b=0;b<mhs.length;b++){
            total += mhs[b].getNilaiTotal();
        }
        total /= mhs.length;
        
        System.out.println("Rata - rata = "+total);
    }
}
