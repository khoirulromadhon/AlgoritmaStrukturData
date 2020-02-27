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
public class BEM {
    public int suara, jumlahSuara = 0, jumlahKandidat = 4;
    public String kandidat;
    public static int control = 0, nilai = 0, accept = 0, accept2 = 0;
    
    public static int arr[] = new int [100];
    
    public static int hitung(int js, int k1, int k2, int k3, int k4){
        if(nilai == 5){
            nilai = 1;
            if (nilai == 1 && k1>0){
                arr[control] = nilai;
                control++;
                nilai++;
                return hitung(js,k1,k2,k3,k4);
            }
            else if (nilai == 2 && k2>0){
                arr[control] = nilai;
                control++;
                nilai++;
                return hitung(js,k1,k2,k3,k4);
            }
            else if (nilai == 3 && k3>0){
                arr[control] = nilai;
                control++;
                nilai++;
                return hitung(js,k1,k2,k3,k4);
            }
            else if (nilai == 4 && k4>0){
                arr[control] = nilai;
                control++;
                nilai++;
                return hitung(js,k1,k2,k3,k4);
            }
            else if (k1 == 0 && k2 == 0 && k3 == 0 && k4 == 0){
                if (arr[accept] == arr[accept+1] && accept+1 < js){
                    return arr[accept];
                }
                else if (accept+2<js){
                    accept+=2;
                    return hitung(js,k1,k2,k3,k4);
                }
                else{
                    return 0;
                }
            }
        else{
            nilai ++;
            return hitung(js,k1,k2,k3,k4);
        }
        }
        return 0;
    }
}
