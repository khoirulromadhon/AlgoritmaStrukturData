/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    
    Segitiga(){
    }
    Segitiga (int a, int t){
        alas = a;
        tinggi = t;
    }
    
    public static void main (String[] args){
        Segitiga[] sgt = new Segitiga[4];
        
        sgt[0] = new Segitiga(10, 4);
        sgt[1] = new Segitiga(20,10);
        sgt[2] = new Segitiga(15,6);
        sgt[3] = new Segitiga(25,10);
        
         for(int i=0;i<sgt.length;i++){
            System.out.println("Luas balok ke-"+i+" : "+sgt[i].hitungLuas());
            System.out.println("Keliling balok ke-"+i+" : "+sgt[i].hitungKeliling()+"\n");
        }
    }
    
    public double hitungLuas(){
        return 0.5*alas*tinggi;
    }
    
    public int hitungKeliling(){
        return alas*3;
    }
}
