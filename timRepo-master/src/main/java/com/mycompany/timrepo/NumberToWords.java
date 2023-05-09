/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass.src.main.java.com.mycompany.timrepo;

/**
 *
 * @author mgobelli
 */
public class NumberToWords {
   
    public static void main(String[] args) {
       getNumberToWords(100);
       reverse(100);
       
    }
  
    public static void getNumberToWords(int number) {
        if (number < 0) {
          System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        int rev = reverse(number);
       
       
       while (digitCount > 0) {
         
          
          switch (rev % 10) {
            case 0 : System.out.println("Zero");
             break;
            case 1 : System.out.println("One");
             break;
            case 2 : System.out.println("Two");
             break;
            case 3 : System.out.println("Three");
             break;
            case 4 : System.out.println("Four");
             break;
            case 5 : System.out.println("Five");
             break;
            case 6 : System.out.println("Six");
             break;
            case 7 : System.out.println("Seven");
             break;
            case 8 : System.out.println("Eight");
             break;
            case 9 : System.out.println("Nine");
             break;
            default : System.out.println("Other");
          }
          digitCount--;
          rev = rev / 10;
          
          
       }
    }
    public static int reverse(int number) {
       int rev = 0;
       while (number != 0) {
          
          int rem = number%10;
          System.out.println(rem);
          rev = rev*10 + rem;
          System.out.println(rev);
          number = number / 10;
          System.out.println(number);
          switch (rev % 10) {
            case 0 : System.out.println("X Zero");
             break;
            case 1 : System.out.println("One");
             break;
            case 2 : System.out.println("Two");
             break;
            case 3 : System.out.println("Three");
             break;
            case 4 : System.out.println("Four");
             break;
            case 5 : System.out.println("Five");
             break;
            case 6 : System.out.println("Six");
             break;
            case 7 : System.out.println("Seven");
             break;
            case 8 : System.out.println("Eight");
             break;
            case 9 : System.out.println("Nine");
             break;
            default : System.out.println("Other");
          }
       }
       return rev;
    }
   
    public static int getDigitCount(int number) {
       int count = 0;
       if (number < 0) {
           return -1;
       }
       if (number == 0) {
          return 1;
          
       }
       
       while (number > 0) {
          number = number / 10;
         
          count++;
 
       }
       return count;
    }
}