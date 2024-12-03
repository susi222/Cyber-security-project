package com.encaptulation;


import java.util.Scanner;

class Customer1{
	
	private int Id;
	private String Name;
	private String Email;
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
		System.out.println(Email);
	}
	public void setEmail(String email) {
		this.Email = email;
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



public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int NumberOfObjects=sc.nextInt();

		Customer1[] arr=new Customer1[NumberOfObjects];
		Customer1 obj;

		for(int i=0;i<arr.length;i++){
			
			
			obj=new Customer1();
			int Id=sc.nextInt();
			sc.nextLine();
			String Name=sc.nextLine();
			String Email=sc.nextLine();
			int Phone=sc.nextInt();
			sc.nextLine();
			String Password=sc.nextLine();
			String Address=sc.nextLine();
			
			obj.setId(Id);
			obj.setName(Name);
			obj.setEmail(Email);
			obj.setPhone(Phone);
			obj.setPassword(Password);
			obj.setAddress(Address);
			

			arr[i]=obj;
			
		}
		for(int i=0;i<arr.length;i++){

			arr[i].getId();
			arr[i].getName();
			arr[i].getEmail();
			arr[i].getPhone();
			arr[i].getPassword();
			arr[i].getPassword();
			System.out.println();
		}

		sc.close();
	}

}

