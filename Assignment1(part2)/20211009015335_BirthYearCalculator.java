/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;

import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class BirthYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //user's input
        System.out.print("Please enter a birth year: ");
        String year = input.nextLine();
        
        //output
        System.out.println("Birth Year: " + year);
        System.out.println("Century   : " +centuryFirst(year));
        System.out.println("Decade    : " + decadeSecond(year));
    }
        //return for century
    public static int centuryFirst(String year){
        return Integer.parseInt(year.substring(0,2))+1;
    }
        //return for decade
    public static String decadeSecond(String year){
        return year.charAt(2)+"0";
    }
    
}
