/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author User
 */
public class Quiz_1 {
    String nama;
    char besar, kecil, besar2, kecil2;
    int tengah;
    
    static void hitungChar(String nama){
            char[] huruf = new char[nama.length()];
            int[] jumlahHuruf = new int[nama.length()];
            int jumlahHurufBerbeda = 1;
            huruf[0] = nama.charAt(0);
            jumlahHuruf[0] = 1;
           

            for (int i = 1; i < nama.length(); i++) {
                boolean sudahMuncul = false;
                for (int j = 0; j < jumlahHurufBerbeda; j++) {
                    if (nama.charAt(i) == huruf[j]) {
                        sudahMuncul = true;
                        jumlahHuruf[j] += 1;
                    }
                }
                if (!sudahMuncul) {
                    huruf[jumlahHurufBerbeda] = nama.charAt(i);
                    jumlahHuruf[jumlahHurufBerbeda] = 1;
                    jumlahHurufBerbeda++;
                }
            }
            System.out.println("\nHasil :");
            for (int i = 0; i < jumlahHurufBerbeda; i++) {
                System.out.println("Huruf " + huruf[i] + " : " + jumlahHuruf[i]);
            } 
    }
    
    public void BKBF(String nama) {
        besar = nama.charAt(0);
        kecil = nama.charAt(0);
        
        for ( int i = 0;i<nama.length();i++){
            if(nama.charAt(i)!=' '){
                if(nama.charAt(i)< kecil){
                kecil = nama.charAt(i);
                }else if (nama.charAt(i)> besar){
                besar = nama.charAt(i);
                }
            }
        }
    }
    public char getBesar(){
        return besar;
    }
    public char getKecil(){
        return kecil;
    }
    
    public void BKDC(String nama, int indeks_awal,int indeks_akhir){  
        int tengah;                                                             
        char besar3,kecil3;                                                      
        
        if(indeks_awal == indeks_akhir){                                        
            besar2 = nama.charAt(indeks_awal);                                  
            kecil2 = nama.charAt(indeks_akhir);                                 
        }else{                                                                  
            tengah = (indeks_awal + indeks_akhir) / 2;                          
            BKDC(nama,indeks_awal,tengah);                            
            besar3 = besar2;                                                    
            kecil3 = kecil2;                                                    
            BKDC(nama,tengah +1,indeks_akhir);                        
            if(besar3 !=' '&&kecil3 !=' '){                                     
                if(besar2 < besar3){                                             
                    besar2 = besar3;                                            
                }else if(kecil2 > kecil3){                                      
                    kecil2 = kecil3;                                            
                }                                                                
            }                                                                    
        }                                                                       
    }                                                                            

    public char getBesar2() {                                                   
        return besar2;                                                          
    }                                                                           

    public char getKecil2() {                                                   
        return kecil2;                                                          
    }                                                                           
}

