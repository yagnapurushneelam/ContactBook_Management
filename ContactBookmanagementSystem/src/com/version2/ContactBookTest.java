package com.version2;

import java.util.Scanner;

public class ContactBookTest {
	public static void main(String[] args) {
		ContactBook book = new ContactBook();
		Scanner obj = new Scanner(System.in);
		
		int choice;
		
		while(true) {
			System.out.println("********************************");
			System.out.println("********************************");
			System.out.println("****** Welcome to Contact Book 	********");
			System.out.println("****** 1. Add Contacts 			************");
			System.out.println("****** 2. Show Contacts 		************");
			System.out.println("****** 3. Search Contacts 		************");
			System.out.println("****** 4. Update Contact Name 	*************");
			System.out.println("****** 5. Update Contact Email  ****************");
			System.out.println("****** 6. Remove Contact 		***********");
			System.out.println("****** 7. Exit ****************");
			System.out.println("********************************");
			System.out.println("********************************");
			
			choice = obj.nextInt();
			
			switch(choice) {
			case 1 : 
				System.out.println("Enter Name");
				String name = obj.next();
				System.out.println("Enter email");
				String email = obj.next();
				System.out.println("Enter Mobile");
				String mobile = obj.next();
				
				Contact contact = new Contact(name, email, mobile);
				
				book.addContact(contact);
				break;
				
			case 2:
				book.showContacts();
				break;
				
			case 3:
				System.out.println("Enter Mobile");
				mobile = obj.next();
				book.searchContact(mobile);
				break;
				
			case 4:
				System.out.println("Enter Name");
				name = obj.next();
				System.out.println("Enter Mobile");
				mobile = obj.next();
				book.updateNameContact(name, mobile);
				break;
				
			case 5:
				System.out.println("Enter Email");
				email = obj.next();
				System.out.println("Enter Mobile");
				mobile = obj.next();
				book.updateEmailContact(email, mobile);
				break;
				
			case 6:
				System.out.println("Enter Mobile");
				mobile = obj.next();
				book.removeContact(mobile);
				break;
				
			case 7:
				return; // exit
				
			default:
				System.out.println("Invalid choice...");
				
			}
			
		}
	}

}
