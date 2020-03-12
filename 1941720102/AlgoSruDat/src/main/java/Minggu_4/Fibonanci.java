/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_4;

/**
 *
 * @author User
 */
public class Fibonanci {
    public int angka;
    
    Fibonanci(){
    }
    Fibonanci(int a){
        angka = a;
    }
    
    public static int FibonanciBF(int a){
        int fib = 0 , b = 1, c = 2;
        
        for (int i = 1;i<a;i++){
           fib = b+c;
            System.out.print(b+" "+c+" "+fib);
            b=c;
            c=fib;
        }
        return  0;
    }
    
    public static int FibonanciDC(int a){
        if (a == 0){
            return 0;
        }
        if (a == 1){
            return 1;
        }
        
            return FibonanciDC(a-1)+FibonanciDC(a-2);
        
    }
}
