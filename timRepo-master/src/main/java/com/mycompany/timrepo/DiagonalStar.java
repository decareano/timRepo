package com.mycompany.timrepo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgobelli
 */
public class DiagonalStar{
    public static void main(String[] args) {
       printSquareStart(-5);
      
    }  
    public static void printSquareStart(int number) {
       if (number < 5) {
                 System.out.println("Invalid Value");
       }
       for (int row = 1; row <= number; row++) {
          for (int column = 1; column <= number; column++) {
             
             if (row == 1 || row == number ) {
                System.out.print("1");
             } else if (column == 1) {
                System.out.print("2");
             } else if (column == number) {
                
                System.out.print("3");
                //what happens is: while column is not equal number
                //by using an else clause I ADD the EMPTY spaces and 
                //then when column IS equal to number I add the three!!!!
             } else if (column == row) {
                System.out.print("4");
             } else if (column == number - 1) {
                System.out.print("5");
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

// sequence is run rows(1) then space(" ") then newline is println()

