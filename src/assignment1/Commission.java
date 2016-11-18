/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author aadn7d
 */
public class Commission extends Employee //will override computeGross
{

    @Override
    public void computeGross() 
    {
        /*
        * Prompt for number of items sold. Prompt for unit price of item sold 
        * (we are selling widgets so just set a price of your choosing)
        * Commission Employees will get 50% of gross sales
        */
        int itemssold;
        double itemprice;
        double payrate = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items sold by this employee:");
        itemssold = sc.nextInt();
        System.out.println("Enter the unit price of the items:");
        itemprice = sc.nextDouble();
        
        System.out.println("Enter the employee's hourly rate:");
        payrate = sc.nextDouble();
        System.out.println("Enter the number of hours worked:");
        hours = sc.nextInt();
        
        gross = (float) ((payrate * hours) + (itemssold * itemprice * .5));
        
        System.out.println("Total Gross is: $" + gross); 
                
                       
    }

    //Commission() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

}
