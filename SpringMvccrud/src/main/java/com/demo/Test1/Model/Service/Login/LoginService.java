package com.demo.Test1.Model.Service.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Test1.DTO.Login.LoginDTO;
import com.demo.Test1.DTO.RegistrationDTO.StudentDTO;
import com.demo.Test1.Model.DAO.Login.LoginDAO;

@Service
public class LoginService 
{
	@Autowired
	private LoginDAO dao;
	public LoginService()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public StudentDTO userLoginService(LoginDTO dto)
	{
		System.out.println("user login service started");
		StudentDTO fromdb= dao.userLoginDAO(dto);
		System.out.println("user login ervice ended");
		
		return fromdb;
	}
}
