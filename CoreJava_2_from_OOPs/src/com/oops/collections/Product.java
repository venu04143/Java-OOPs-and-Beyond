package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Product {
	
	int prodId;
	String prodName;
	double prodPrice;
	int prodRating;
	

	public Product(int prodId, String prodName, double prodPrice, int prodRating) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodRating = prodRating;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodRating="
				+ prodRating + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<Product> c1 = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				
				return o1.prodId-o2.prodId;
			}
		};
		
		Comparator<Product> c2 = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				
				return (int) (o1.prodPrice-o2.prodPrice);
			}
		};
		
		Comparator<Product> c3 = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				
				return  o1.prodRating-o2.prodRating;
			}
		};
		
		Product p1 = new Product(3,"VollyBall",800,3);
		Product p2 = new Product(2,"Mobile",12000,4);
		Product p3 = new Product(4,"WashingMachine",20000,2);
		Product p4 = new Product(1,"Shoes",1400,5);
		
		
		ArrayList<Product> prod = new ArrayList<>();
		
		prod.add(p1);
		prod.add(p2);
		prod.add(p3);
		prod.add(p4);
		
		System.out.println(prod);
		
		Collections.sort(prod,c1);
		
		System.out.println(prod);
		
        Collections.sort(prod,c2);
		
		System.out.println(prod);
		
        Collections.sort(prod,c3);
		
		System.out.println(prod);
		
	}

}
