package com.encaptulation;

import java.util.Scanner;
import java.lang.Integer;

class Menu{
	private int Id;
	private String Name;
	private int Price;
	private String Description;
	
	
	
	/*
	
	public Menu(int id, String name, int price, String Description) {
		this.Id = id;
		this.Name = name;
		this.Price = price;
		this.Desription = Description;
	}
	
	*/
	
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
		this.Description = Description;
	}
	
	
	
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

public class Problem11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String Data=sc.nextLine();
		
		String[] arr=Data.split(",");
		int Id=Integer.parseInt(arr[0]);
		String Name=arr[1];
		int Price=Integer.parseInt(arr[2]);
		String Description=arr[3];
		
		Menu obj=new Menu();
		
		//Menu obj=new Menu(Id,Name,Price,Description);
		
		
		obj.setId(Id);
		obj.setName(Name);
		obj.setPrice(Price);
		obj.setDescription(Description);
		
		obj.getId();
		obj.getName();
		obj.getPrice();
		obj.getDescription();
		
		
		sc.close();
		
	}

}