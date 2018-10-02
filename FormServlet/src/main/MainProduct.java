package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Product;
import ulti.HibernateUtil;

public class MainProduct {
	
	final static SessionFactory factory = HibernateUtil.getFactory();
	
	public static void main(String[] args) {
		
		Product newProduct = new Product();
		newProduct.setName("Product111");
		newProduct.setDescription("New Product");
		newProduct.setImage("/images/products/product1.jpg");
		
		createtProduct(newProduct);
	}
	
	private static void createtProduct(Product product) {
		try {
			//1. create session
			Session session = factory.openSession();
			
			//2. begin transaction
			Transaction tx = session.beginTransaction();
			
			//3. insert
			session.save(product);
			
			//4. transaction commit
			tx.commit();
			
			//5. close session
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
