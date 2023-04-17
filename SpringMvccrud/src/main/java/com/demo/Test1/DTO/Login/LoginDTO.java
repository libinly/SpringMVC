package com.demo.Test1.DTO.Login;

import java.io.Serializable;

public class LoginDTO implements Serializable
{
	private String semail;
	private String spwd;
	
	public LoginDTO()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSpwd() {
		return spwd;
	}

	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}

	@Override
	public String toString() {
		return "LoginDTO [semail=" + semail + ", spwd=" + spwd + "]";
	}
	

	
}
