/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Tanah {
   public int jumlah, panjang, lebar/*, tanah*/;
   
   Tanah(){
   }
   Tanah(/*int tn,*/ int jml, int pj, int lb){
       //tanah = tn;
       jumlah = jml;
       panjang = pj;
       lebar = lb;
   }
   
   void tampilTanah(){
       System.out.println("Tanah "+jumlah);
       System.out.println("Panjang: "+panjang);
       System.out.println("Lebar: "+lebar);
   }
   
   public static void main (String[] args){
       Tanah t1 = new Tanah(1, 100, 40);
       Tanah t2 = new Tanah(2, 250, 100);
       Tanah t3 = new Tanah(3, 120, 100);
       int total_1, total_2, total_3;
       
       System.out.println("Jumlah Tanah: 3\n");
       
       t1.tampilTanah();
       t2.tampilTanah();
       t3.tampilTanah();
       System.out.println();
       total_1 = t1.luasTanah();
       System.out.println("Luas tanah 1"+total_1);
       total_2 = t2.luasTanah();
       System.out.println("Luas tanah 1"+total_2);
       total_3 = t1.luasTanah();
       System.out.println("Luas tanah 1"+total_3);
       /*Tanah[] arr = new Tanah[3];
       
       System.out.println("Jumlah tanah: /n"+arr.length);
       
       for (int i=0;i<arr.length;i++){
           System.out.println("Tanah "+(i+1));
           System.out.println("");
       }*/
       
   }
   
   int luasTanah(){
       return panjang*lebar;
   }
}
