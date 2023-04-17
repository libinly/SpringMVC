package com.demo.Test1.Controller.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.Test1.DTO.Login.LoginDTO;
import com.demo.Test1.DTO.RegistrationDTO.StudentDTO;
import com.demo.Test1.Model.Service.Login.LoginService;

@Controller
public class LoginController 
{
	@Autowired
	private LoginService Service;
	
	HttpSession session;
	public LoginController()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	@RequestMapping(value="/Login.do", method=RequestMethod.POST)
	public ModelAndView userLoginController(LoginDTO dto,HttpServletRequest req)
	{
		System.out.println("user login controller started");
		StudentDTO fromdb= Service.userLoginService(dto);
		if(fromdb!=null)
		{
			session =req.getSession();
			session.setAttribute("student", fromdb);
			return new ModelAndView("/Home.jsp");
		}
		else
		{
			return new ModelAndView("/Login.jsp");
		}
	}
}
