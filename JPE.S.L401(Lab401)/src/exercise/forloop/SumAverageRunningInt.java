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
public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum=0;
        double average;
        int lowerBound = 1;
        int upperBound =100;
        
        for(int number = lowerBound; number<=upperBound;++number){
            sum+=number;
        }
        average = sum/upperBound;
        
        System.out.println("Average of all 100 first numbers: "+average);
    }
}
