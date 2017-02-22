package com.fx.supplier.basedata.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fx.supplier.basedata.model.Department;
import com.fx.supplier.basedata.service.UserService;

@Service
public class UserServiceIml implements UserService {

	@Autowired
	private SessionFactory sessionFactory;

	public void get() {
		Session session = sessionFactory.getCurrentSession();
		Department department = session.get(Department.class, 1L);
		System.out.println(department.getName());
		System.out.println(department.getDescription());
	}

	public void save(Department department) {
		Session session = sessionFactory.getCurrentSession();
		session.save(department);
	}
}
