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
public class Liga {
    String team;
    int main, SG, point;
    
    Liga(){
    }
    public Liga(String team, int main, int SG, int point) {
        this.team = team;
        this.main = main;
        this.SG = SG;
        this.point = point;
    }
    
    void tampil(){
        System.out.println("Tim: "+team);
        System.out.println("Maain: "+main);
        System.out.println("Selisih Gol: "+SG);
        System.out.println("Poin: "+point);
        System.out.println("------------------");
    }
    
    public static void insertionSort(Liga[] arr, boolean ascending) {
        int i, j;
        for (i = 1; i < arr.length; i++) {
            Liga temp;
            temp = arr[i];
            j = i;
            if (ascending == true) {
                while ((j > 0) && (arr[j - 1].point > temp.point)) {
                    arr[j] = arr[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (arr[j - 1].point < temp.point)) {
                    arr[j] = arr[j - 1];
                    j--;
                }
            }
            arr[j] = temp;
        }
    }
}
