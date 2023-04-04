/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timrepo;

/**
 *
 * @author marcelogobelli
 */
public class isEvenNumbefr {
   
    public static void main(String[] args) {
       int startValue = 5;
       int endValue = 20;
       int sum = 0;
       while (startValue <= endValue) {
          if (isEvenNumber1(startValue)) {
             sum += startValue;
             startValue++;
          } else {
          System.out.println("Odd number " + startValue + " no need to sum it up");
             startValue++;
          }
       }
    }
      
    public static boolean isEvenNumber1(int number) {
       
       if (number < 0) {
            return false;
       }
        if (number % 2 == 0) {
            return true;
        } else {
            
            return false;
        }
        //forcing an issue
       
    }
        
   
      
 
}