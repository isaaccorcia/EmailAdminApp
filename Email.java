/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailadminapp;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String email;
   private String department;
   private int mailboxCapacity = 500;
   private int defaultPasswordlength = 10;
   private String alternateEmail;
   private String companySuffix = "coolcompany.com";
   
   //Constructor to receive firstName and lastName
   public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created For: " + this.firstName + " " + this.lastName);
        
        this.department = setDepart(); //Method call asking for the department that returns the department
        System.out.println("Department: " + this.department);
        
        //Method call returning a random password
        this.password = randomPassword(defaultPasswordlength);
        System.out.println("Your temporary password is: " + this.password);
        
        //Generate email by combining elements
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }
   //Ask for the department
   private String setDepart() {
       System.out.println("New Worker: " + lastName + ", " + firstName +"\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n4 for Engineering\n5 for Operations\n6 for Human Resources\nEnter department code: ");
       Scanner in = new Scanner(System.in);
       int departChoice = in.nextInt();
       if (departChoice == 1) {
           return "Sales";
       }
       if (departChoice == 2) {
           return "Dev";
       }
       if (departChoice == 3) {
           return "Acc";
       }
       if (departChoice == 4) {
           return "Engi";
       }
       if (departChoice == 5) {
           return "Ops";
       }
       if (departChoice == 6) {
           return "HR";
       }
       return null;
   }
   //Generate a random password
   private String randomPassword(int length) {
       String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%*&_";
       char[] password = new char[length];
       
       for (int i = 0; i < length; i++) {
         int rand = (int) (Math.random() * setPassword.length());
         password[i] = setPassword.charAt(rand);
       }
       return new String(password);
   }
   //Set the mailboxCapacity
   public void setMailboxCapacity(int capacity) {
       this.mailboxCapacity = capacity;
   }
   //Set the alternate email
   public void setAlternateEmail(String altEmail) {
       this.alternateEmail = altEmail;
   }
   
   //Change the password
   public void changePassword(String password) {
       this.password = password;
   }
   
   public int getMailboxCapacity() {
        return mailboxCapacity;
   }
   
   public String getAlternateEmail() {
       return alternateEmail;
   }
   
   public String getPassword() {
       return password;
   }
   
   public String showInfo() {
       return "DISPLAY NAME: " +firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity +"mb";
   }
   
    
}
