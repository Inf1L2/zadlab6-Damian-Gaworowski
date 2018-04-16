/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class complex {
 
    
    
    
public static void Lzespolona(double re,double im){
        
}
public static double Mod(double re, double im){
return Math.hypot(re,im);
}
public static void LSprz(double re, double im){
        if(im>0)
        {
            System.out.println("sprzężona: " + re + " - " + im + "i");
        }
        else
        {
            double im2 = Math.abs(im);
            System.out.println("Liczba sprzężona ma postać: " + re + " + " + im + "i");
}
}
public static void SumowanieAlg(double re, double im, double ree, double imm){
        double s1 = re + ree;
        double s2 = im + imm;
        System.out.print("Wynik dodawania to: " + s1 + " + "
        + s2 + "i");
        
    }
public static void RAraiczne(double re, double im, double ree, double imm){
      
        double r1 = re - ree;
        double r2 = im - imm;
        double r3 = Math.abs(r1);
            System.out.print("Różnica: -" + r3 + " - "+ r2 + "i");
            
}

public static void main(String[] args){
    int wybor;
    Scanner odczyt = new Scanner(System.in);
    System.out.print("Wybierz działanie");
    System.out.print("1-Moduł ");
    System.out.print("1-Wartośc liczby zesp ");
    System.out.print("3-sumowanie ");
    System.out.print("4-różnica ");
    wybor = odczyt.nextInt();
    
    switch(wybor){
            case 1:
               Mod(4,6);
                break;
            case 2:
                LSprz(6,8);
                break;
            case 3:
                SumowanieAlg(4,8,4,4);
                break;
            case 4:
                RAraiczne(4,8,4,4);
                
            }
    
}


}