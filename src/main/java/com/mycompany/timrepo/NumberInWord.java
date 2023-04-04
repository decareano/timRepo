/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timrepo;

/**
 *
 * @author marcelogobelli
 */
public class NumberInWord {
    
    public static void main(String[] args) {
        printNumberInWord(-12);
    }
    
    public static void printNumberInWord(int number) {
//        if (number < 0 && number > 9) {
//            System.out.println("Invalid number");
//        }
        switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("other");
            
        }
        //optional
            }
    //forcing an update
}
