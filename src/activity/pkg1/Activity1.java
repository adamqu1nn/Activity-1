/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity.pkg1;

import java.util.Scanner;

/**
 *
 * @author adamd
 */
public class Activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
   
        System.out.println("Enter Your First Name:");
        String fName = scn.nextLine();
        
        System.out.println("Enter your Middle Name:");
        String mName = scn.nextLine();

        System.out.println("Enter your last Name:");
        String lName = scn.nextLine();
      
        System.out.println("Enter Your Gender");
        String gender = scn.nextLine ();
       
        System.out.println("Enter Your Birthdate");
        var Birthdate = scn.nextLine();
        
        System.out.println("Enter your Age");
        int age = scn.nextInt();

        System.out.println("Your Data: " + fName + " " + mName +" "+ lName + " "+age +" "+ gender + " "+ Birthdate); 
  
        scn.close();
    }
    
}
