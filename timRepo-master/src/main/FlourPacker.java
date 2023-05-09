/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgobelli
 */
public class FlourPacker {
    
    public static void main(String[] args) {
       canPack(1,8,5);
      
    }  
   
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {
       if (bigCount < 0 || smallCount < 0 || goal < 0) {
          return false;
       }
        //bigcount 5 kilos
        //smallcount 1 kilos
        //goal is amount of kilos to make a package
        //so bigcount + smallcount should be == to goal
        //sum greater than goal
        //use bigcount or smallcount to make fit otherwise return false
        
        int unitsB = bigCount * 5;
        int unitsS = smallCount * 1;
        int sum = unitsB + unitsS;
        
           
          //goal % 5....meaning: equals 3 if we use number 8
          //goal % 5....meaning: equals 3 if we use 18
              
              //System.out.println(bigCount * 5 + smallCount);
       if (sum == goal) {
          return true;
       } else if (sum < goal) {
          return false;
       } else {
          int rem = goal % 5;
          if (unitsS > goal || rem < smallCount) {
              System.out.println(true);
             //System.out.println(unitsS > goal);
             //System.out.println(rem < smallCount);
             return true;
          }   
          
       } 
       System.out.println(false);
       return false;
  
    }
}

