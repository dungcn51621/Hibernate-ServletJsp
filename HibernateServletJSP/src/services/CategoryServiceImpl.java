package services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Category;
import ulti.HibernateUtil;

public class CategoryServiceImpl implements CategoryService {

	static final SessionFactory factory = HibernateUtil.getSessionFactory();
	@Override
	public List<Category> getCategories() {
		List<Category> categories = null;
		try {
			// 1. create session
			Session session = factory.openSession();
			// 2. begin transaction
			Transaction tx = session.beginTransaction();
			// 3. select hql
			categories = session.createQuery("FROM Category").list();
			// 4. close connect
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categories;
	}

}
