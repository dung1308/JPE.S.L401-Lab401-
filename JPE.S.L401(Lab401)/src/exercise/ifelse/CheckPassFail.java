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
public class CheckPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for number: ");
        int mark = scanner.nextInt();
        
        System.out.println("The mark is "+mark);
        
        if(mark>=50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("--------------");
        System.out.println("CHECK DONE");
    }
}
