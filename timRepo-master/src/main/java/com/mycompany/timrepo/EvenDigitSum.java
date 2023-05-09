/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass.src.main.java.com.mycompany.timrepo;

/**
 *
 * @author mgobelli
 */
public class EvenDigitSum {
    
    public static int getEvenDigitSum(int number) {
        
       if (number < 0) 
          return -1;
       int sum = 0;
      
       while (number > 0) {
          int lastDigit = number%10;
          if (lastDigit % 2 == 0) {
              //clever way below to sum the individual number to the sum
             sum += number%10;
          }
          // this is the equivalent to the increase
          number = number / 10;
          
          
          
       
       }
       return sum;
    }
}

