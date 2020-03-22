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
public class Penerbanan_Main {
    public static void main(String[] args){
        String[] rute = {"Malang-Yogyakarta","Surabaya-Aceh","Malang-Bandung"};
        float[] bagasi = {2.0f, 3.0f, 2.5f};
        int[] durasi = {3,12,6};
        int[] harga = {300000,1500000,500000};
        
        Penerbangan[] tiket = new Penerbangan[3];
        for (int i = 0; i < tiket.length; i++){
            tiket[i] = new Penerbangan(rute[i], bagasi[i], durasi[i], harga[i]);
        }
        
        System.out.println("Layanan Penerbangan");
        for (int i = 0; i < tiket.length;i++){
            tiket[i].tampil();
            System.out.println("-----------------------");
        }
        
        System.out.println("Di urutkan berdasarkan harga");
        System.out.println("BubbleSort");
        Penerbangan.bubbleSort(tiket);
        for (int i = 0; i < tiket.length;i++){
            tiket[i].tampil();
            System.out.println("-----------------------");
        }
        System.out.println("===========================");
        System.out.println("SelectionSort");
        Penerbangan.selectionSort(tiket);
        for (int i = 0; i < tiket.length; i++){
            tiket[i].tampil();
            System.out.println("-----------------------");
        }
    }
}
