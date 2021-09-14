/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.ifelse;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for number: ");
        int number =scanner.nextInt();
        
        System.out.println("The number is "+number);
        if(number%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
        System.out.println("------------------");
        System.out.println("Bye");
    }
}
