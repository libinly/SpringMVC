package com.demo.Test1.Model.Service.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Test1.Model.DAO.Registration.RegistrationDAO;
import com.demo.Test1.DTO.RegistrationDTO.StudentDTO;

@Service
public class RegistrationService
{
	@Autowired
	private RegistrationDAO dao;
	public  RegistrationService()
	{
		
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public void userRegistrationService(StudentDTO stdo)
	{
		System.out.println("service cstartedretedddddd");
		dao.userRegistrationDAO(stdo);
		System.out.println("service  ended");
	}
}
