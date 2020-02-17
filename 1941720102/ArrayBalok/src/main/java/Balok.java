/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public static void main (String[] args){
        Balok[] blarr = new Balok[3];
        
        blarr[0] = new Balok(100, 30, 12);
        blarr[1] = new Balok(120, 40, 15);
        blarr[2] = new Balok(210, 50, 25);
        
        for(int i=0;i<3;i++){
            System.out.println("volume balok ke-"+i+" : "+blarr[i].hitungVolume());
        }
    }
    
    public Balok(int p,int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
}
