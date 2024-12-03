package com.encaptulation;

import java.util.Scanner;

class Customer3{
	
	
	private int Id;
	private String Name;
	private String Email;
	private int Phone;
	private String Password;
	private String Address;
	
	
	public Customer3(int id, String name, String email, int phone, String password, String address) {
		this.Id = id;
		this.Name = name;
		this.Email = email;
		this.Phone = phone;
		this.Password = password;
		this.Address = address;
	}
	
	
	public void getId() {
		System.out.println(Id);
	}
	public void getName() {
		System.out.println(Name);
	}
	public void getEmail() {
		System.out.println(Email);
	}
	public void getPhone() {
		System.out.println(Phone);
	}
	public void getPassword() {
		System.out.println(Password);
	}
	public void getAddress() {
		System.out.println(Address);
	}
	
	
}
public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int Id=sc.nextInt();
		sc.nextLine();
		String Name=sc.nextLine();
		String Email=sc.nextLine();
		int Phone=sc.nextInt();
		sc.nextLine();
		String Password=sc.nextLine();
		String Address=sc.nextLine();
		
		Customer3 obj=new Customer3(Id,Name,Email,Phone,Password,Address);
		
		obj.getId();
		obj.getName();
		obj.getEmail();
		obj.getPhone();
		obj.getPassword();
		obj.getAddress();
	
		
		sc.close();

	}

}
