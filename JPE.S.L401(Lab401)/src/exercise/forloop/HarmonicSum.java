/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.forloop;

/**
 *
 * @author ASUS
 */
public class HarmonicSum {
    public static void main(String[] args) {
        int n = 50000;
        double sumL2R=printLeftToRightSum(n);
        double sumR2L = printRightToLeftSum(n);
        System.out.printf("Difference: %.15f",(sumL2R-sumR2L));
        System.out.println();
    }
    
    public static double printLeftToRightSum(int n){
        double sum=0.0;
        for(int i=1;i<=n;i++){
            sum +=(double) 1/i;
            
        }
        System.out.printf("Left-to-right harmonic sum %.15f",sum);
        System.out.println();
        
        return sum;
    }
    
    public static double printRightToLeftSum(int n){
        double sum=0.0;
        for(int i=n;i>=1;i--){
            sum += (double) 1/i;
        }
        System.out.printf("Right-to-left harmonic sum %.15f", sum);
        System.out.println();
        return sum;
    }
}
