/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass;

/**
 *
 * @author mgobelli
 */
public class FirstLastDigitSum {
    public static void main(String[] args) {
       sumFirstAndLastDigit(11234);
        
    }
   
    public static int sumFirstAndLastDigit(int number) {
       if (number < 0) {
          return -1;
       }
       int lastDigit = 0;
       int firstDigit = 0;
   
       while (number >= 0) {
                lastDigit = number % 10;
                int digits = (int)Math.log10(number);
                System.out.println(digits);
                firstDigit = (int)(number / Math.pow(10, digits));
                
                return firstDigit + lastDigit;
       
       
       }
       return 1;
    }
   
       
}  
