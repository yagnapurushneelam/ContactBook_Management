package com.version2;
import java.util.ArrayList;
public class ContactBook {
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public void addContact(Contact contact) {
		for(Contact obj : contactList) {
			if(contact.getMobile().equals(obj.getMobile())) {
				System.out.println("Mobile number alredy exist...");
				return;
			}
		}
		contactList.add(contact);
		System.out.println("Contact added successfully....");
	}
	
	public void removeContact(String mobile) {
		for(Contact obj : contactList) {
			if(obj.getMobile().equals(mobile)) {
				contactList.remove(obj);
				System.out.println("Contact Removed...");
				return;
			}
		}
		System.out.println("Invalid contact number...");
	}
	
	public void updateNameContact(String name, String phone) {
		for(Contact obj : contactList) {
			if(obj.getMobile().equals(phone)) {
				obj.setName(name);
				System.out.println("Contact Updated...");
				return;
			}
		}
		System.out.println("Invalid contact number...");
	}
	
	public void updateEmailContact(String email, String phone) {
		for(Contact obj : contactList) {
			if(obj.getMobile().equals(phone)) {
				obj.setEmail(email);
				System.out.println("Contact Updated...");
				return;
			}
		}
		System.out.println("Invalid contact number...");
	}
	
	public void showContacts() {
		for(Contact contact : contactList) {
			System.out.println(contact);
		}
	}
	
	public void searchContact(String mobile) {
		for(Contact obj : contactList) {
			if(obj.getMobile().equals(mobile)) {
				System.out.println(obj);
				return;
			}
		}
		System.out.println("No contact found...");
	}
	
	
}
