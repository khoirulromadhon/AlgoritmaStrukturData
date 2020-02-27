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
public class BEMMain {
    public static void main(String[] args){
        Scanner khoirul = new Scanner (System.in);
        Scanner romadhon = new Scanner (System.in);
        BEM b = new BEM();
        BEM[] arr = new BEM[b.jumlahKandidat];
        
        for (int i=0;i<b.jumlahKandidat;i++){
            arr[i] = new BEM();
            System.out.print("Nama Kandidat ke-"+(i+1)+" : ");
            arr[i].kandidat = khoirul.nextLine();
        }
        System.out.println();
        for (int i=0;i<b.jumlahKandidat;i++){
            System.out.print("Jumlah suara kandidat ke-"+(i+1)+" : ");
            arr[i].suara = romadhon.nextInt();
            b.jumlahSuara += arr[i].suara;
        }
        int hasil = b.hitung(b.jumlahSuara, arr[0].suara, arr[1].suara, arr[2].suara, arr[3].suara);
        if (hasil == 0){
            System.out.println("Masing-masing kandidat memiliki mayoritas yang sama");
        }
        else{
            System.out.println("Ketua BEM yang terpiih adalah "+arr[hasil-1].kandidat);
        }
    }
}
