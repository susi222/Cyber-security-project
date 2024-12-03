package com.encaptulation;

import java.util.Scanner;

class Customer5{
	
	private int Id;
	private String Name;
	private String Email;
	private long Phone;
	private String Password;
	private String Address;
	
	
	public Customer5(int id, String name, String email, long phone, String password, String address) {
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
public class Problem5 {
	
	public static boolean check(long Phone) {
		if((Phone/1000000000==9 || Phone/1000000000==6 || Phone/1000000000==7 || Phone/1000000000==8)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int Id=sc.nextInt();
		sc.nextLine();
		String Name=sc.nextLine();
		String Email=sc.nextLine();
		long Phone=sc.nextLong();
		sc.nextLine();
		String Password=sc.nextLine();
		String Address=sc.nextLine();
		
		boolean startswith=check(Phone);
		
		
		while(!(startswith)) {
			System.out.println("Please Enter Valid Phone Number starts with 6/7/8/9:");
			Phone=sc.nextLong();
			startswith=check(Phone);
		}
		
		
		Customer5 obj=new Customer5(Id,Name,Email,Phone,Password,Address);
		
		obj.getId();
		obj.getName();
		obj.getEmail();
		obj.getPhone();
		obj.getPassword();
		obj.getAddress();
	
		
		sc.close();

	}

}
