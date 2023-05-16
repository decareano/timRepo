package com.mycompany.timrepo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgobelli
 */
public class DiagonalStar {
   
    public static void main(String[] args) {
      printSquareStar(7);
    }
    public static void printSquareStar(int number) {
       if (number < 7) {
                 System.out.println("Invalid Value");
       }
       for (int row = 0; row < number; row++) {
          for (int column = 0; column < number; column++) {
             if (number < 0) {
                 System.out.println("Invalid Value");
             }
             
             if (row == 0 || row == number - 1 ) {
                System.out.print("1");
             } else if (column == 0) {
                System.out.print("2");
             } else if (column == number - 1) {
                
                System.out.print("3");
                //what happens is: while column is not equal number
                //by using an else clause I ADD the EMPTY spaces and 
                //then when column IS equal to number I add the three!!!!
             } else if (column == row) {
                System.out.print("4");
             } else if (column == number - 1 - row) {
                System.out.print("5");
             } else {
                System.out.print(" ");
             }
             
           }
           System.out.println();
       }
       
       
    }
}

