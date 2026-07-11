package com.ProductInventorySystem;

import java.util.HashMap;

public class ProductManager {

	private HashMap<Integer, Product> products = new HashMap<>();
	
	
	public void addProduct(Product p) {
		products.put(p.getId(), p);
		System.out.println("Product add Successfully");
		return;
	}
	
	public void displayAll() {
		if(products.isEmpty()) {
			System.out.println("Product list is Empty.......");
			return;
		}
		for(Product p: products.values()) {
			System.out.println(p);
		}
	}
	
	
	
	public void searchById(int id) {
		Product p = products.get(id);
		
		if(p == null) {
			System.out.println("Product is not found");
		}else {
			System.out.println(p);
		}
	}
	
	public void removeById(int id) {
		Product p = products.remove(id);
		
		if(p == null) {
			System.out.println("Id Not Found....");
		}else {
			System.out.println("Product Removed: "+ p);
		}
	}
}















