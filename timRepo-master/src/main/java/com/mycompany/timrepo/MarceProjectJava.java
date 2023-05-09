/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timrepo;

/**
 *
 * @author marcelogobelli
 */
public class MarceProjectJava {

    public static void main(String[] args) {
        System.out.println("0 " + getDurationString(-3945));
        
        System.out.println("1 " + getDurationString(-65, 45));
        System.out.println("2 " + getDurationString(65, 145));
        System.out.println("3 " + getDurationString(65, 45));
        System.out.println("4 " + getDurationString(3945));
    }
    public static String getDurationString(int seconds) {
        
        if (seconds <= 0) {
            //you have a choice to run seconds >= than 0; it evaluates to true
            // and then run the code
            //or
            // run seconds <= and put the invalid return there
            return "no negative numbers allowed";
        } else {
        int minutes = seconds / 60;
        return  getDurationString(minutes, seconds);
        } 
        
    }
    
    public static String getDurationString(int minutes, int seconds) {
        
        if (minutes < 0 ) {
            return "invalid data for minutes";
        }
        if (seconds <= 0 || seconds >= 59){
            
            return "invalid data for seconds";
        } else {
            int hours = minutes / 60;
            int remainder = minutes % 60;
            int remainder1 = seconds % 60;
            //int remainder = seconds % 60;
            return hours + "hour " + remainder + "min " +  remainder1 + " seconds ";
        } 
        
        
    }
    //forcing an update
    
    //return String XXh YYm ZZs
    //one minute is 60 second, one hour is 60 minutes or 3600 seconds
    //we are going to call the second method on the first method to return results
    
}
//|| seconds <= 59) && (minutes >= 0)