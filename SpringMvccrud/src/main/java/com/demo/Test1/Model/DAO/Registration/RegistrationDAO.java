package com.demo.Test1.Model.DAO.Registration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.demo.Test1.DTO.RegistrationDTO.StudentDTO;

@Repository
public class RegistrationDAO
{
	@Autowired
	private SessionFactory fact;
	public RegistrationDAO()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public void userRegistrationDAO(StudentDTO sdto)
	{
		System.out.println("user Reg DAO startedretedddddd");
		Session session= fact.openSession();
		Transaction tx= session.beginTransaction();
		session.save(sdto);
		tx.commit();
		System.out.println("user Reg DAO  ended");
	}
}
