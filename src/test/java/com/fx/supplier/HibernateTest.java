package com.fx.supplier;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fx.supplier.basedata.model.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class HibernateTest {

	@Autowired
	private SessionFactory sessionFactory;

	@Test
	public void testSessionFactory() {
		System.out.println(sessionFactory);
	}

	@Test
	public void testGet() {
		Session session = sessionFactory.openSession();
		Department department = session.get(Department.class, 1L);
		System.out.println(department.getDescription());

	}
}
