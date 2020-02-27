/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class PacMan {
    public int x, y, width, height;
    
    public static void main (String[] args){
        Scanner kr = new Scanner (System.in);
        PacMan p1 = new PacMan();
        
        System.out.print("Height: ");
        p1.height = kr.nextInt();
        System.out.print("Width: ");
        p1.width = kr.nextInt();
        
        PacMan[][] arr = new PacMan[p1.width][p1.height];
    }
    
    void moveLeft(){
        
    }
    
    void moveRight(){
        
    }
    
    void moveUp(){
        
    }
    
    void moveDown(){
        
    }
    
    void printPosition(){
        
    }
}
