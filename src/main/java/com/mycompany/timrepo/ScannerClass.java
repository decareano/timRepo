/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timrepo;

/**
 *
 * @author marcelogobelli
 */
import java.util.Scanner;

public class ScannerClass {
   public static void main(String[] args) {
      int currentYear = 2022;
     
      try {
         System.out.println(getInputFromScanner(currentYear));
      } catch (NullPointerException e) {
         System.out.println(getInputFromScanner(currentYear));
      }
     
   }
   
   public static String getInputFromScanner(int currentYear) {
      //primitive types and strings
      Scanner scanner = new Scanner(System.in);
      System.out.println("Hi, what's your name? ");
      String name = scanner.nextLine();
      System.out.println("Hi, " + name + ", thanks for taking the course");
      System.out.println("What year were you born");
      boolean validDOB = false;
      int age = 0;
      do {
          System.out.println("Enter a year of birth >= " +
                  (currentYear - 125) + " and <= " + (currentYear));
          //String dateOfBirth = scanner.nextLine();
          //age = currentYear - Integer.parseInt(dateOfBirth);
          try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
          } catch (NumberFormatException badUserData) {
              System.out.println("Characters not allowed. Try again");
          }
      } while (!validDOB);
      return "so your name is " + name + " and you are " + age + " years of age";
     
   }
   // below method not robust...generates negative numbers
   public static int checkData(int currentYear, String dateOfBirth) {
       int dob = Integer.parseInt(dateOfBirth);
       int minimumYear = currentYear - 125;
       
       if ((dob < minimumYear) || (dob > currentYear)) {
           return -1;
       }
       
       return (currentYear - dob);
    }
}
