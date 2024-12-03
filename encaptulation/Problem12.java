package com.encaptulation;

import java.util.Scanner;

class Menu2{
	private int Id;
	private String Name;
	private int Price;
	private String Description;
	
	
	
	
	
	public Menu2(int id, String name, int price, String Description) {
		this.Id = id;
		this.Name = name;
		this.Price = price;
		this.Description = Description;
	}
	
	/*
	
	public void setId(int id) {
		this.Id = id;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
	public void setDescription(String Description) {
		this.Desription = Description;
	}
	
	*/
	
	public void getId() {
		System.out.println(Id);
	}
	public void getName() {
		System.out.println(Name);
	}
	public void getPrice() {
		System.out.println(Price);
	}
	public void getDescription() {
		System.out.println(Description);
	}
	
	
	
	
}

public class Problem12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int size=sc.nextInt();
		sc.nextLine();
		
		Menu2[] a=new Menu2[size];
		
		Menu2 obj;
		
		for(int i=0;i<a.length;i++) {
			
			String Data=sc.nextLine();
			
			String[] arr=Data.split(",");
			int Id=Integer.parseInt(arr[0]);
			String Name=arr[1];
			int Price=Integer.parseInt(arr[2]);
			String Description=arr[3];
			
			// Menu3 obj=new Menu3();
			
			obj=new Menu2(Id,Name,Price,Description);
			
			
			/*
			
			
			obj.setId(Id);
			obj.setName(Name);
			obj.setPrice(Price);
			obj.setDescription(Description);
			
			
			*/
			
			a[i]=obj;
			
			
		}
		for(int i=0;i<a.length;i++) {
			
			a[i].getId();
			a[i].getName();
			a[i].getPrice();
			a[i].getDescription();
		}
		
		
		
		sc.close();
		
	}

}
