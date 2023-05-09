/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass.src.main.java.com.mycompany.timrepo;

/**
 *
 * @author mgobelli
 */
public class LastDigitChecker {
   
       public static void main(String[] args) {
        hasSameLastDigit(14, 25, 35);
       }
   
       public static boolean hasSameLastDigit(int number0, int number1, int number2) {
          
          if ((isValid(number0) && (isValid(number1)) && (isValid(number2)))) {   
      
             int zerob = number0 % 10;
             int oneb = number1 % 10;
             int twob = number2 % 10;
       
             return  ((zerob == oneb) || (zerob == twob) || (oneb == twob));
              //return ((lastx == lasty) || (lasty == lastz) || (lastx == lastz)); 
          }
          return false;
       }
   
       public static boolean isValid(int num) {
           return ((num >= 9) && (num <= 1001));
       
       }
       
} 