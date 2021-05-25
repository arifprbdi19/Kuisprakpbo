/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

import java.util.Scanner;

/**
 *
 * @author Indiv
 */
public class KuisPbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, email, phoneNumber, search, reset;
        
        do{
            ContactsManager Manager = new ContactsManager();
            
            name = "arifpribadi";
            email = "arifprbdi16@gmail.com";
            phoneNumber = "082246627884";
            Contact data = new Contact(name, email, phoneNumber);
            Manager.addContact(data);
            
            name = "asep";
            email = "asep@gmail.com";
            phoneNumber = "987654d12";
            Contact data2 = new Contact(name, email, phoneNumber);
            Manager.addContact(data2);
            
            name = "michael";
            email = "michael@gmail.com";
            phoneNumber = "981d23512";
            Contact data3 = new Contact(name, email, phoneNumber);
            Manager.addContact(data3);
            
            name = "theo";
            email = "theo@gmail.com";
            phoneNumber = "9458532846";
            Contact data4 = new Contact(name, email, phoneNumber);
            Manager.addContact(data4);
            
            name = "iqsal";
            email = "iqsal@gmail.com";
            phoneNumber = "931254332";
            Contact data5 = new Contact(name, email, phoneNumber);
            Manager.addContact(data5);
            
             name = "friskahgblk";
            email = "friskahgblk@gmail.com";
            phoneNumber = "98765412";
            Contact data6 = new Contact(name, email, phoneNumber);
            Manager.addContact(data6);
            
            Scanner input = new Scanner(System.in);
            System.out.print("Search Name : "); search = input.nextLine();
            System.out.println("Looking for " + search + "'s contact . . .");
            
            Contact result = Manager.searchContact(search.toLowerCase());
            
            if(result != null){
                System.out.println("Name        : " + result.getName());
                System.out.println("Phone Number: " + result.getPhoneNumber());
                System.out.println("E-mail      : " + result.getEmail());
            }else{
                System.out.println("Data Tidak Ditemukan Ya, Mohon Coba Lagi");
            }
            
            System.out.println("Again? (yes/no)"); reset = input.nextLine();
            if("no".equals(reset)){
                System.exit(0);
            }
        } while (true);
        }
    
    }
    

