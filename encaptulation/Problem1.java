package com.encaptulation;



import java.util.Scanner;

class Customer{
	private int Id;
	private String Name;
	private String email;
	private int Phone;
	private String Password;
	private String Address;
	public void getId() {
		System.out.println(Id);
	}
	public void setId(int id) {
		this.Id = id;
	}
	public void getName() {
		System.out.println(Name);
	}
	public void setName(String name) {
		this.Name = name;
	}
	public void getEmail() {
		System.out.println(email);
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void getPhone() {
		System.out.println(Phone);
	}
	public void setPhone(int phone) {
		this.Phone = phone;
	}
	public void getPassword() {
		System.out.println(Password);
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public void getAddress() {
		System.out.println(Address);
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	
	
	
	
}

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer obj=new Customer();
		
	
		int Id=sc.nextInt();
		sc.nextLine();
		String Name=sc.nextLine();
		String email=sc.nextLine();
		int Phone=sc.nextInt();
		sc.nextLine();
		String Password=sc.nextLine();
		String Address=sc.nextLine();
		
		obj.setId(Id);
		obj.setName(Name);
		obj.setEmail(email);
		obj.setPhone(Phone);
		obj.setPassword(Password);
		obj.setAddress(Address);
		
		
		obj.getId();
		obj.getName();
		obj.getEmail();
		obj.getPhone();
		obj.getPassword();
		obj.getAddress();
		
		sc.close();
	

	}

}

