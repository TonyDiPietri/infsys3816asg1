/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Tony DiPietri and Fatima Haider
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static Employee[] employeeArray = new Employee[3];
    
    public boolean employeespopulated = false;
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException 
    {
        Payroll pyrll = new Payroll();
        pyrll.menu();
        // TODO code application logic here
    }
    
    public void menu() throws IOException, FileNotFoundException, ClassNotFoundException {
        int input;
        
        do {
            System.out.println("Please select an option:");
            System.out.println("1. Populate Employees:");
            System.out.println("2. Select Employee");
            System.out.println("3. Save Employee");
            System.out.println("4. Load Employee");
            System.out.println("5. Exit System");

            Scanner sc = new Scanner(System.in);
            
            input = sc.nextInt();

            if (input == 1 && employeespopulated == false) {
                populateEmployee();

            } else if (input == 1 && employeespopulated == true) {
                System.out.println("Employees already created.");
            
            } else if (input == 2) {
                selectEmployee();

            } else if (input == 3) {
                saveEmployee();

            } else if (input == 4) {
                loadEmployee();

            } else if (input != 5) {
                System.out.println("Invalid Input");
            }

            
        } while (input != 5);
    }
    
    public void populateEmployee() //throws IOException
    {
        
        employeeArray[0] = new Hourly();
        employeeArray[1] = new Salary();
        employeeArray[2] = new Commission();
        
        employeespopulated = true;
    }
    
    public void selectEmployee()
    {
       System.out.println("Please enter employee 0, 1, or 2");
       Scanner sc = new Scanner(System.in);
       int selectedIndex;
       selectedIndex = sc.nextInt();
       employeeArray[selectedIndex].menu(); 
    }
    
    public void saveEmployee() throws FileNotFoundException, IOException
    {
//            System.out.println("Enter the filename to save your info:");
//            String fileName;
//        fileName = sc.next();
        try
        {
        //FileOutputStream fos = new FileOutputStream("C:\\Users\\fhb6b\\OneDrive\\infsys3816asg1");
        FileOutputStream fos;
                fos = new FileOutputStream("Accounts");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
           //try () {
            oos.writeObject(employeeArray);
            oos.flush();
            //}
        }
        
             catch(Exception ioe)
            {
                
            }   
    }
    
    public void loadEmployee() throws FileNotFoundException, IOException, ClassNotFoundException
        {
//            System.out.println("Enter the filename you want to load:");
//            String fileName = sc.next();
           // FileInputStream fis = new FileInputStream("C:\\Users\\fhb6b\\OneDrive\\infsys3816asg1");
            //FileInputStream fis = new FileInputStream("Accounts");
           // try (ObjectInputStream ois = new ObjectInputStream(fis))
            try
            {
                //FileInputStream fis = new FileInputStream("C:\\Users\\fhb6b\\OneDrive\\infsys3816asg1");
                FileInputStream fis = new FileInputStream("Accounts");
                ObjectInputStream ois = new ObjectInputStream(fis);
                //try () {
                employeeArray = (Employee[]) ois.readObject() ;
                ois.close();
                //}
            }
            catch(IOException | ClassNotFoundException ioe)
            {
                
            }
    }
}
