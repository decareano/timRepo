/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timrepo;

/**
 *
 * @author mgobelli
 */
public class LargestPrime {
    public static void main(String[] args) {
       getLargestPrime(45);
      
    }  
    public static int getLargestPrime(int number) {
       if (number < 1 || number == 1) {
          return -1;
       }
   
       //int i = 2;
       //while (i  < number) {
          //if (number % i == 0) {
          //number /= i;
             //if (number / 1 == 2) {
                 //return i;
            // }
          //continue;
          //}
          //i++;
       //}
       for (int i = 2; i <= number/2; i++) {
          if (number % i == 0) {
             number /= i;
             i--; 
             
          }
       
       }
       
       return number;
        
    }   
}
