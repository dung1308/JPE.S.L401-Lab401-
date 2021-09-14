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
public class AverageArray {
    public static void main(String[] args) {
        int[] intArray = {12,5,9,8,11,86};
        int sum=0;
        double average = 0.0d;
        int length = intArray.length;
        
        for(int i=0;i<length;i++){
            sum+=intArray[i];
        }
        average = sum/length;
        
        System.out.println("Average of all element in intArray: "+average);
    }
}
