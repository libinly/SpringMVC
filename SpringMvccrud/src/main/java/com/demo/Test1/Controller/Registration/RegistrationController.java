package com.demo.Test1.Controller.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.Test1.DTO.RegistrationDTO.StudentDTO;
import com.demo.Test1.Model.Service.Registration.RegistrationService;

@Controller
public class RegistrationController 
{
	@Autowired
	private RegistrationService ser;
	
	public RegistrationController() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	@RequestMapping(value="/register.do" ,method=RequestMethod.POST)
	public ModelAndView userregistrationController(StudentDTO stdo)
	{
		System.out.println("user rc startedretedddddd");
		ser.userRegistrationService(stdo);
		System.out.println("user rc ended");
		return new ModelAndView("/display.jsp");
	}
	
}
