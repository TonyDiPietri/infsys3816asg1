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
public class Salary extends Employee //will override computeGross
{

    @Override
    public void computeGross() 
    {
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Staff or 2) Executive?");
        
        index = sc.nextInt();
        
        switch (index) {
            case 1:
                gross = 50000;
                System.out.println("Total Gross is: $" + gross);
                break;
        //Prompt for Staff or Executive
        //Set Gross salary to $50,000 for staff and $100,000 for executives
            case 2:
                gross = 100000;
                System.out.println("Total Gross is: $" + gross);
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
                        
    }

    //Salary() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

}
