package com.addressbook;

import java.util.Scanner;
import java.lang.String;

public class Service {

    public static boolean isNameValid(String name) {
        String nameRegex = "^[a-zA-Z-'\\s]+ [a-zA-Z-'\\s]+$"; 

        return name.matches(nameRegex);
    }

    public static boolean isValidGmail(String email) {
        String validate = "@gmail.com";
        // System.out.println(email.substring(email.length()-10));
        if(email.length() <= validate.length()) {
            return false;
        }
        
        if (email.substring(email.length() - validate.length()).equals(validate)) {
            return true;
        }

        return false;
    }   

    public static void display(int t) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=== Add Contact ===\n");
        System.out.print("Full Name : ");

        try {
            Thread.sleep(100);
            System.out.print("I");
            Thread.sleep(100);
            System.out.print("n");
            Thread.sleep(100);
            System.out.print("v");
            Thread.sleep(100);
            System.out.print("a");
            Thread.sleep(100);
            System.out.print("l");
            Thread.sleep(100);
            System.out.print("i");
            Thread.sleep(100);
            System.out.print("d ");
            Thread.sleep(100);
            System.out.print("!");
            Thread.sleep(100);
            System.out.print("!");

            System.out.print("      Try " + t + " / 3");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=== Add Contact ===\n");
        System.out.print("Full Name : ");
    }

    public static void display(String name, int t) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=== Add Contact ===\n");
        System.out.println("Full Name : " + name);
        System.out.print("Mobile : ");

        try {
            Thread.sleep(100);
            System.out.print("I");
            Thread.sleep(100);
            System.out.print("n");
            Thread.sleep(100);
            System.out.print("v");
            Thread.sleep(100);
            System.out.print("a");
            Thread.sleep(100);
            System.out.print("l");
            Thread.sleep(100);
            System.out.print("i");
            Thread.sleep(100);
            System.out.print("d ");
            Thread.sleep(100);
            System.out.print("!");
            Thread.sleep(100);
            System.out.print("!");
            System.out.print("      Try " + t + " / 3");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=== Add Contact ===\n");
        System.out.println("Full Name : " + name);
        System.out.print("Mobile : ");
    }

    public static void display(String name, long mobile, int t) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=== Add Contact ===\n");
        System.out.println("Full Name : " + name);
        System.out.println("Mobile : " + mobile);
        System.out.print("Address : ");

        try {
            Thread.sleep(100);
            System.out.print("C");
            Thread.sleep(100);
            System.out.print("a");
            Thread.sleep(100);
            System.out.print("n'");
            Thread.sleep(100);
            System.out.print("t ");
            Thread.sleep(100);
            System.out.print("b");
            Thread.sleep(100);
            System.out.print("e ");
            Thread.sleep(100);
            System.out.print("N");
            Thread.sleep(100);
            System.out.print("u");
            Thread.sleep(100);
            System.out.print("l");
            Thread.sleep(100);
            System.out.print("l");
            System.out.print("      Try " + t + " / 3");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=== Add Contact ===\n");
        System.out.println("Full Name : " + name);
        System.out.println("Mobile : " + mobile);
        System.out.print("Address : ");
    }

    public static void display(String name, long mobile, String address, int t) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=== Add Contact ===\n");
        System.out.println("Full Name : " + name);
        System.out.println("Mobile : " + mobile);
        System.out.println("Address : " + address);
        System.out.print("Gmail : ");

        try {
            Thread.sleep(100);
            System.out.print("I");
            Thread.sleep(100);
            System.out.print("n");
            Thread.sleep(100);
            System.out.print("v");
            Thread.sleep(100);
            System.out.print("a");
            Thread.sleep(100);
            System.out.print("l");
            Thread.sleep(100);
            System.out.print("i");
            Thread.sleep(100);
            System.out.print("d ");
            Thread.sleep(100);
            System.out.print("!");
            Thread.sleep(100);
            System.out.print("!");
            System.out.print("      Try " + t + " / 3");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=== Add Contact ===\n");
        System.out.println("Full Name : " + name);
        System.out.println("Mobile : " + mobile);
        System.out.println("Address : " + address);
        System.out.print("Gmail : ");
    }

    public void addContact(Scanner sc, Contact persons[]) {

        String name = null, address = null , email = null;
        long mobile = -1;
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("=== Add Contact ===\n");
        int i = 1;
        
        System.out.print("Full Name : ");
        name = sc.nextLine();

        do {
            name = sc.nextLine();
            if(!isNameValid(name)) {
                if(i > 3) {
                    return;
                }
                display(i++);
            }
        } while(!isNameValid(name));
        i = 1;
        name = name.substring(0,1).toUpperCase() + name.substring(1);

        System.out.print("Mobile : ");

        do {
            mobile = sc.nextLong();
            if(String.valueOf(mobile).length() != 10) {
                if(i > 4) {
                    return;
                }
                display(name, i++);
            }
        } while(String.valueOf(mobile).length() != 10);
        i = 1;

        System.out.print("Address : ");
        address = sc.nextLine();
            
        do {
            address = sc.nextLine();
            if(address.equals("")) {
                if(i > 2) {
                    return;
                }
                display(name, mobile, i++);
            }
        } while(address.equals(""));
        i = 1;

        System.out.print("Gmail : ");
        
        do {
            email = sc.nextLine();
            if(!isValidGmail(email)) {
                if(i > 3) {
                    return;
                }
                display(name, mobile, address, i++);
            }
        } while(!isValidGmail(email));

        int var = name.charAt(0) - 'a';

        Contact newContact = new Contact(name, mobile, address, email);

//        addContactUtil(newContact, persons[var]);

        System.out.println("\n=== New Contact Added ===");
        
    }

    private static void addContactUtil(Contact newContact, Contact root) {
        if(root == null) {
            root = newContact;
            return;
        }
        if(root.compareTo(newContact) < 0) {
            addContactUtil(newContact.right, root);
        }
        else if(root.compareTo(newContact) > 0) {
            addContactUtil(newContact.left, root);
        }
    }
}
