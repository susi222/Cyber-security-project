package com.encaptulation;



import java.util.Scanner;

class Restaurant10{
	private int Id;
	private String Name;
	private String Email;
	private Long Phone;
	private String Address;
	public Restaurant10(int id, String name, String email, Long phone, String address) {
		this.Id = id;
		this.Name = name;
		this.Email = email;
		this.Phone = phone;
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
	public void getAddress() {
		System.out.println(Address);
	}
}



public class Problem10 {
	
	public static boolean check(long Phone) {
		if((Phone/1000000000==9 || Phone/1000000000==6 || Phone/1000000000==7 || Phone/1000000000==8)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int Id=sc.nextInt();
		sc.nextLine();
		String Name=sc.nextLine();
		String Email=sc.nextLine();
		Long Phone=sc.nextLong();
		sc.nextLine();
		String Address=sc.nextLine();
		
		boolean startswith=check(Phone);
		while(!(startswith)) {
			System.out.println("Please Enter Valid Phone Number starts with 6/7/8/9:");
			Phone=sc.nextLong();
			startswith=check(Phone);
		}
		
		Restaurant10 obj=new Restaurant10(Id,Name,Email,Phone,Address);
	
		
		obj.getId();
		obj.getName();
		obj.getEmail();
		obj.getPhone();
		obj.getAddress();
	

		sc.close();
		
	}

}

