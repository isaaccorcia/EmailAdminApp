/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailadminapp;

/**
 *
 * @author isaac
 */
public class EmailAdminApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Email emailExample = new Email("Isaac", "Corcia");
        
        //In case user wants to set a new password
      //  emailExample.changePassword("@newpassword123");
      //  System.out.println(emailExample.getPassword());
        
        //In case user wants to set new Mailbox Capacity
      //  emailExample.setMailboxCapacity(1000);
        
        //In case user wants to set an Alternate Email
      //  emailExample.setAlternateEmail("ic@gmail.com");
      //  System.out.println(emailExample.getAlternateEmail());
        
        
        System.out.println(emailExample.showInfo());
    }
    
}
