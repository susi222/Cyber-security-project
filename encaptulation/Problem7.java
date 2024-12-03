package com.encaptulation;



import java.util.Scanner;

class Restaurant7{
	private int Id;
	private String Name;
	private String Email;
	private Long Phone;
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
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public void getPhone() {
		System.out.println(Phone);
	}
	public void setPhone(Long Phone) {
		this.Phone = Phone;
	}
	public void getAddress() {
		System.out.println(Address);
	}
	public void setAddress(String address) {
		this.Address = address;
	}
}



public class Problem7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int NumberOfObjects=sc.nextInt();

		Restaurant7[] arr=new Restaurant7[NumberOfObjects];
		Restaurant7 obj;

		for(int i=0;i<arr.length;i++){
			obj=new Restaurant7();
			
			
			int Id=sc.nextInt();
			sc.nextLine();
			String Name=sc.nextLine();
			String Email=sc.nextLine();
			Long Phone=sc.nextLong();
			sc.nextLine();
			String Address=sc.nextLine();
			
			obj.setId(Id);
			obj.setName(Name);
			obj.setEmail(Email);
			obj.setPhone(Phone);
			obj.setAddress(Address);
			

			arr[i]=obj;
			
		}
		for(int i=0;i<arr.length;i++){

			arr[i].getId();
			arr[i].getName();
			arr[i].getEmail();
			arr[i].getPhone();
			arr[i].getAddress();
			System.out.println();
		}
		
		sc.close();
	}
}

