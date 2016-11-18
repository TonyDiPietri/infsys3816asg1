/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author aadn7d
 * CHANGES SYNCED SON.
 */
public class Employee implements Serializable
{
    /*********************
	     Attributes
	*********************/
	float rate=30.0f;
	float taxrate=0.2f;
	int hours=45;
	float gross=0.0f;
	float tax=0.0f;
	float net=0.0f;
	float net_percent=0.0f;

	//End Attributes
        
        /********************
	     Constructors
	********************/
        public Employee()
        {
            
        }
        	
	/********************
	     Methods
	********************/
        public void menu()
        {
            
            int input;
            do {
            System.out.println("1. Calculate Gross Pay");
            System.out.println("2. Calculate Tax");
            System.out.println("3. Calculate Net Pay");
            System.out.println("4. Calculate Net Percent");
            System.out.println("5. Display Employee ");

            Scanner sc = new Scanner(System.in);
            
            input = sc.nextInt();

                if (input == 1) {
                    computeGross();

                } else if (input == 2) {
                    computeTax();

                } else if (input == 3) {
                    computeNet();

                } else if (input == 4) {
                    computeNetPercent();
                    
                } else if (input == 5) {
                    displayEmployee();

                } else if (input != 5) {
                    System.out.println("Invalid Input");
                }

            
            } while (input != 5);
        }
         
	public void computeGross()
        { 
            //This method is overwritten in all extended classes 
            //and therefore will not be used.
            gross=rate*hours;
            System.out.println("Total Gross is: $" + gross);
            
                
	}

	protected void computeTax() 
        { 
            //assigns the product of float gross and taxrate to float tax
            computeGross();
            tax=gross*taxrate;
            System.out.println("Total tax is: $" + tax);
	}

	protected void computeNet()
        { 
            //assigns the difference between float gross and tax to float net
            computeTax();
            net=gross-tax;
            System.out.println("Net pay is: $" + net);
        }

	protected void computeNetPercent() 
        { 
            //assigns the quotient of net over gross times 100 to net_percent
            computeNet();
            net_percent=(net/gross)*100;
            System.out.println("Net percent is: %" + net_percent);
	}
	
	protected void displayEmployee() 
        {
            //displays employee information as calculated by the other methods.
            //computeNetPercent();
            
            System.out.println("Hours: " + hours);
            System.out.println("Tax Rate: " + rate);
            System.out.println("Gross: $" + gross);
            System.out.println("Net: $" + net);
            System.out.println("Net%: %" + net_percent);
	}

} 
