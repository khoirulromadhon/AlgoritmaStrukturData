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
public class Liga_main {
    public static void main(String[] args){
        String[] team = { "Arsenal", "Aston Villa", "Bournemouth", "Crystal Palace", "Everton", "Leicester City",
                "Liverpool", "Manchester City", "Manchester United", "Newcastle United", "Norwich City",
                "Sheffield United", "Southampton", "Tottenham Hotspur", "Watford", "West Ham United",
                "Wolverhampton Wanderers" };
        int[] main = { 28, 27, 29, 29, 29, 29, 29, 28, 29, 27, 28, 29, 29, 28, 29, 29, 29, 29, 29, 29 };
        int[] SG = { 4, -18, -18, -8, -6, 9, -6, -6, 26, 45, 39, 12, -16, -27, 5, -17, 7, -17, -15, 7 };
        int[] point = { 40, 25, 27, 29, 39, 48, 39, 37, 50, 82, 57, 42, 35, 21, 43, 34, 41, 27, 27, 43 };
        
        Liga[] lg = new Liga[team.length];
        for (int i = 0; i < lg.length; i++){
            lg[i] = new Liga(team[i], main[i], SG[i], point[i]);
        }
        
        System.out.println("Sebelum Sorting : ");
        for (int i = 0; i < lg.length; i++) {
            lg[i].tampil();
        }
        
        System.out.println("====================================");
        System.out.println("Setelah Sorting Metode Insertion Sort Ascending: ");
        Liga.insertionSort(lg, true);
        for (int i = 0; i < lg.length; i++) {
            lg[i].tampil();
        }
        System.out.println("=====================================");
        System.out.println("Setelah Sorting Metode Insertion Sort Descending: ");
        Liga.insertionSort(lg, false);
        for (int i = 0; i < lg.length; i++) {
            lg[i].tampil();
        }
    }
}
