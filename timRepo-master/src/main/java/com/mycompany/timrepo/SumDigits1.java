package com.mycompany.timrepo;
public class SumDigits1{
   
    public static void main(String[] args) {
       sumDigits(1234);
       sumDigits(-3243);
    }
      
    public static int sumDigits(int number) {
       int sum = 0;
       if (number < 0) {
            return -1;
            // return -1 if less than zero
       }
       // miss line 14 in my thinking. always look at
       // instructions
       while (number > 9) {
          System.out.println(number);
          sum += (number % 10);
          number = number / 10;
          
          
       } 
       // was running an if statement here
       // no need to do that. the statement will suffice
       // cuz the while loop evaluates to false and next
       // in line 26
       sum += number;
        
       
       return sum;
    }
}
