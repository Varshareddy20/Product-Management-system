package com.varsha.springprj.productmanagementapp;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		ProductService service = new ProductService();
		

		service.addProduct(new Product( "Asus Vivobook",  "Laptop",  "Brown Table", 2024));
		service.addProduct(new Product( "Apple mouse",  "mouse",  "Black Drawer", 2020));
		service.addProduct(new Product( "Asus Pro max",  "Mobile",  "pink Table", 2025));
	    service.addProduct(new Product( "Hp Elitebook",  "Laptop",  "white Table", 2021));
	    service.addProduct(new Product( "Type C",  "Black Charger",  "Drawer", 2023));
	
	    List<Product> products = service.getAllProducts();
	    for(Product p : products) {
	    System.out.println(p);
	    }
	    
	    /*
	    System.out.println("=====================================");
	    
	    System.out.println("a particular product");
	    
	    Product p = service.getProduct("Type C");
	    
	    System.out.println(p);
	    
	    System.out.println("=====================================");
	    System.out.println("a particular product");
	    
	    List<Product> prods = service.getProductWithText("Black");
	    for(Product product : prods) {
		    System.out.println(product);
		}
	    
	    System.out.println("=====================================");
	    System.out.println("a particular product");
	    
	    List<Product> prod = service.getProductWithPlace("Brown Table");
	    for(Product product : prod) {
	    System.out.println(product);
	    
	} 
	 */   
	    
}
}
