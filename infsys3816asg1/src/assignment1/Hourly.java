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
public class Hourly extends Employee // will override ComputeGross
{

    /**
     *
     */
    @Override
    public void computeGross() 
    {
        //Prompt for hours
        //Prompt for rate
        //Calc OT at time and a half	
        
        double payrate = 0;
                        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee's hourly rate:");
        payrate = sc.nextDouble();
        System.out.println("Enter the number of hours worked:");
        hours = sc.nextInt();
        
        if (hours <= 40)
            gross = (float) (payrate * hours);
        
        else 
            gross = (float) ((40 * payrate) + ((hours - 40) * (payrate * 1.5)));
            System.out.println("Total Gross is: $" + gross);            
    }

    //Hourly() {
    //    throw new UnsupportedOperationException("Yadda Yadda Yadda.");
    //To change body of generated methods, choose Tools | Templates.
    //}

}
