package model;

import java.util.ArrayList;
import java.util.UUID;

public class User {
	private UUID id;
	private String userName;
	private String firstName;
	private String lastName;
	private int age;
	private String phoneNumber;
	
	//new account
	public User(String userName, String firstName, String lastName, int age, String phoneNumber) {
		this.id = UUID.randomUUID();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	//existing account loaded from json
	public User(UUID id, String userName, String firstName, String lastName, int age, String phoneNumber) {
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
        
        public ArrayList<Item> getItems(){
            ArrayList<Item> items = new ArrayList<Item>();
            items.add(new Item("The Cat in the Hat", "Dr. Seuss", "cat-in-hat.jpeg"));
            items.add(new Item("Where the Wild Things Are", "Maurice Sendak", "wild-things.jpg"));
            items.add(new Item("Pajama Time", "Sandra Boynton", "pajama-time.jpg"));
            items.add(new Item("Green Eggs and Ham", "Dr. Seuss", "green-eggs.jpg"));
            return items;
        }
	
}
