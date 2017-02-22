package com.fx.supplier;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import com.fx.supplier.basedata.model.Department;

public class SessionFactoryTest {
	private SessionFactory sessionFactory;

	@Before
	public void setUp() throws Exception {
		// A SessionFactory is set up once for an application!
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()//
				.configure() // configures settings from hibernate.cfg.xml
				.build();//
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had
			// trouble building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	@Test
	public void testSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		System.out.println(sessionFactory);
	}

	@Test
	public void testSession() {
		System.out.println(sessionFactory.openSession());
	}
	
	@Test
	public void testSave(){
		Department department = new Department();
		department.setName("name");
		department.setDescription("description");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(department);
		transaction.commit();
		session.close();
	}
}
