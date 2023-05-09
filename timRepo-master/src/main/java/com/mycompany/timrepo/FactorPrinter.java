/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass.src.main.java.com.mycompany.timrepo;

/**
 *
 * @author mgobelli
 */
public class FactorPrinter {
    
   public static void main(String[] args) {
       
       printFactors(-16);
   }
   
   public static void printFactors(int number) {
       if (number < 1) {
           System.out.println("Invalid Value");
       }
       int i = 1;
       while (i <= number) {
            if (number % i == 0) {
                System.out.println(i + "");
            }
            i++;
       }
   }
}

