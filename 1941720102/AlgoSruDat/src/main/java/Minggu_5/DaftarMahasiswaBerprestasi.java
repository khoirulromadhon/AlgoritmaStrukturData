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
public class DaftarMahasiswaBerprestasi {
    Mahasiswa[] listMhs = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if (idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh slurrrr !!!!!");
        }
    }
    
    void tampil(){
        for (Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-------------------");
        }
    }
    
    void bubbleshort(){
        for (int i = 0; i<listMhs.length-1; i++){
            for (int j = 1; j<listMhs.length; j++){
                if (listMhs[i].ipk > listMhs[j-1].ipk){
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort(){
       for (int i=0; i<listMhs.length; i++){
           int idxMin = i;
           for (int j=i+1; j<listMhs.length; j++){
               if (listMhs[j].ipk < listMhs[idxMin].ipk){
                   idxMin = j;
               }
           }
           Mahasiswa tmp = listMhs [idxMin];
           listMhs[idxMin] = listMhs[i];
           listMhs[i] = tmp;
       }
    }
    
    void insertionSort(boolean ascending){
        int i,j;
        for (i = 1 ; i < listMhs.length; i++){
            Mahasiswa temp = new Mahasiswa();
            temp = listMhs[i];
            j = i;
            if(ascending){
                while ((j>0)&&(listMhs[j-1].ipk>temp.ipk)){
                    listMhs[j] = listMhs[j -1 ];
                    j--;
                }    
            }
            else {
                while ((j>0)&&(listMhs[j-1].ipk<temp.ipk)){
                    listMhs[j] = listMhs[j -1 ];
                    j--;
                }    
            }
            
            listMhs[j] = temp;
        }
    }
}
