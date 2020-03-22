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
public class Penerbangan {
    String rute;
    float bagasi;
    int durasi, harga;
    
    Penerbangan(){
    }
    public Penerbangan(String rute, float bagasi, int durasi, int harga) {
        this.rute = rute;
        this.bagasi = bagasi;
        this.durasi = durasi;
        this.harga = harga;
    }
    
    void tampil(){
        System.out.println("Tujuan penerbangan: "+rute);
        System.out.println("Berat bagasi: "+bagasi+" kg");
        System.out.println("Durasi penerbangan: "+durasi+" jam");
        System.out.println("Harga: "+harga);
    }
    
    public static void bubbleSort(Penerbangan[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=1;j<array.length-i;j++){
                if(array[j].harga<array[j-1].harga){
                    Penerbangan temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    
    public static void selectionSort(Penerbangan[] array){
        for(int i = 0; i < array.length; i++){
            int idMin = i;
            for (int j = i+1; j < array.length;j++){
                if (array[j].harga < array[idMin].harga){
                    idMin = j;
                }
            }
            Penerbangan temp = array[idMin];
            array[idMin] = array[i];
            array[i] = temp;
        }
    }
}
