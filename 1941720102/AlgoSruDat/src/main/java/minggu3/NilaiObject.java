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
public class NilaiObject {
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

    public NilaiObject() {
    }

    public NilaiObject(String namaMhs, int nilaiTugas, int nilaiKuis, int nilaiUTS, int nilaiUAS) {
        this.namaMhs = namaMhs;
        this.nilaiTugas = nilaiTugas;
        this.nilaiKuis = nilaiKuis;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public int getNilaiKuis() {
        return nilaiKuis;
    }

    public void setNilaiKuis(int nilaiKuis) {
        this.nilaiKuis = nilaiKuis;
    }

    public int getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(int nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public int getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(int nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }
    
    double getNilaiTotal(){
        double nilaiTugas = this.nilaiTugas * 0.3;
        double nilaiKuis = this.nilaiKuis * 0.2;
        double nilaiUTS = this.nilaiUTS *0.2;
        double nilaiUAS = this.nilaiUAS * 0.3;
                
        return nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS;
    }
}
