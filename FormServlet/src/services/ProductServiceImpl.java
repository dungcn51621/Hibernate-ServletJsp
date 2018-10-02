package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Product;
import ulti.HibernateUtil;

public class ProductServiceImpl implements ProductService {
	
	final static SessionFactory factory = HibernateUtil.getFactory();
	
	@Override
	public void createtProduct(Product product) {
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
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> categories = null;
		try {
			//1. create session
			Session session = factory.openSession();
			
			//2. begin transaction
			Transaction tx = session.beginTransaction();
			
			//3. insert
			categories = session.createQuery("FROM Product").list();
			
			//5. close session
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categories;
	}
}
