/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaddressextractor;

import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class WebAddressExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        
        //user's input
        System.out.print("Please input a web address: ");
        String webAddress = input.nextLine();
        
        //declaring the dots
        int f = webAddress.indexOf('.');
        int s = webAddress.indexOf('.',f +1);
     
        //address output
        System.out.println("Address   : " + webAddress.toLowerCase());
        
        //heading output
        String heading = webAddress.substring(0,f);
        System.out.println("Heading   : " + heading.toLowerCase());
        
        //company output
        String company = webAddress.substring(f+1,s);
        System.out.println("Company   : " + company.toLowerCase());
        
        //extension output
        String extension = webAddress.substring(s+1);
        System.out.println("Extension : " + extension.toLowerCase());
    }
    
}
