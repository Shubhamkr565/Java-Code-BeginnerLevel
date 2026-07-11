package com.ProductInventorySystem;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n==========Product Details==========");
			System.out.println("1. Add Product");
			System.out.println("2. DisplayAll Product");
			System.out.println("3. Search product by ID");
			System.out.println("4. Remove product by ID");
			System.out.println("5. Exit");
			System.out.println("Enter Choice: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter ID");
				int id =  sc.nextInt();
				
				System.out.println("Enter Product name: ");
				String product = sc.next();
				
				System.out.println("Enter Price: ");
				double price =  sc.nextDouble();


				manager.addProduct(new Product(id, product, price ));
				break;
				
			case 2:
				manager.displayAll();
				break;
			
			case 3:
				System.out.println("Enter Product id to Search: ");
				int SID =  sc.nextInt();
				manager.searchById(SID);
				break;
				
			case 4:
				System.out.println("Enter Product id to Remove: ");
				int RID =  sc.nextInt();
				manager.removeById(RID);
				break;
				
			case 5:
				System.out.println("Exiting ..... Good Bye!....");
				sc.close();
				return;
			default:
				System.out.println("Invalid Choice! Enter 1-5.");
			}
		}
	}

}
