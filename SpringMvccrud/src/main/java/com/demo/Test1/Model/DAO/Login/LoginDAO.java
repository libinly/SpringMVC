package com.demo.Test1.Model.DAO.Login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.Test1.DTO.Login.LoginDTO;
import com.demo.Test1.DTO.RegistrationDTO.StudentDTO;


@Repository
public class LoginDAO 
{
	@Autowired
	private SessionFactory fact;
	public LoginDAO()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public StudentDTO userLoginDAO(LoginDTO dto)
	{
		System.out.println("user login started");
		Session session= fact.openSession();
		Query qry = session.createQuery("select from StudentDTO where dto.sname='"+dto.getSemail()+"' and dto.pwd='"+dto.getSpwd()+"'  ");
		StudentDTO fromdb=(StudentDTO) qry.uniqueResult();
		System.out.println("user login ended");
		
		return fromdb;
	}
}
