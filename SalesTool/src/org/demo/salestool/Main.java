package org.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data=new SalesData();
		displayGreeting();
		data.display();

	}
	public static void displayGreeting() {
		System.out.println("Hello Happy Sales People!!!");
		System.out.println("This app shows sales data!!!");
		System.out.println("----------------------------");
		System.out.println("Test 1");
		System.out.println("Test 2");
	}

}
