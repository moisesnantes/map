package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Programam {

	public static void main(String[] args) {
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("TV", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Ipad", 2200.0);
		
		stock.put(p1, 900.0);
		stock.put(p2, 1200.0);
		stock.put(p3, 2200.0);
		
		Product ps = new Product("TV", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
