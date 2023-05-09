/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass.src.main.java.com.mycompany.timrepo;

/**
 *
 * @author mgobelli
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
      getGreatestCommonDivisor(30, 12);
   }
   public static void getGreatestCommonDivisor(int first, int second) {
       if (first < 0 || second < 0) {
           System.out.println("this number is not divisible + " + first + second);
       }
       int i = 1;
       int newNumber = 1;
       while (i <= first && i <= second ) {
            if (first % i == 0 && second % i == 0) {
               newNumber = first / i;
               newNumber = second / i;
               int pickOne = Math.min(newNumber, newNumber);
               newNumber = i;
                
               
            }
            i++;
       } 
       System.out.println(newNumber);
      
   }
}
