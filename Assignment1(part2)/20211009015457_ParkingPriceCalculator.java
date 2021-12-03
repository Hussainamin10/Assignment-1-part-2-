/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingpricecalculator;

import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        
        System.out.print("Please input the number of minutes your car has parked: ");
        int minutes = input.nextInt();

        
        System.out.printf("\n%-25s: %d", "Parking time (minutes)", minutes);
        System.out.printf("\n%-25s: %d", "Parking time (hours)", hours(minutes));
        System.out.printf("\n%-25s: %.2f\n", "Price", price(hours(minutes)));
    }

    
    public static int hours(int minutes) {
        final double TIME_CONVERSION = 60;
        return (int) Math.ceil(minutes / TIME_CONVERSION);
    }

    
    public static double price(int hours) {
        final double price = 2;
        return price * hours;
    }
    
}
