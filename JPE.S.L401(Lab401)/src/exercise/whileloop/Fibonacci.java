/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.whileloop;

/**
 *
 * @author ASUS
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n=1;
        int fnMinus1 =1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;
        System.out.println("The first "+nMax+" Fibonacci numbers are:");
        
        while(n<=nMax){
            System.out.print(fnMinus1+" ");
            
            sum = fnMinus1 + fnMinus2;
            fnMinus1 = fnMinus2;
            fnMinus2 = sum;
            
            ++n;
        }
        average = sum/nMax;
        
        System.out.println("\n The average is "+average);
    }
    
}
