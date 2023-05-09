/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass.src.main.java.com.mycompany.timrepo;

/**
 *
 * @author mgobelli
 */
public class SharedDigit {
    public static void main(String[] args) {
       sharedDigit(9, 21);
    }
   
    public static boolean sharedDigit(int number0, int number1) {
        if (number0 <= 10 ||  number0 >= 100 || number1 <= 10 || number1 >= 100)  {
          return false;
       }
       
       
       int lefta = number0 / 10;
       int leftb = number0 % 10;
       
       int righta = number1 / 10;
       int rightb = number1 % 10;
       
       if (lefta == righta || lefta == rightb) {
          return true;
          
       } else if (leftb == righta || leftb == rightb) {
          return true;
       
       } else {
          
          return false;
       }
       
              
    }
}
