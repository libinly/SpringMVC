package com.demo.Test1.DTO.RegistrationDTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student_tb")
public class StudentDTO implements Serializable
{
	@Id
	@GenericGenerator(name="ref", strategy="increment")
	@GeneratedValue(generator="ref")
	private int sid;
	private String sname;
	private String sadd;
	private String course;
	private String splace;
	private int sage;
	private String semail;
	private String spwd;
	
	public StudentDTO()
	{
		System.out.println(this.getClass().getSimpleName()+"createdd");
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

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSplace() {
		return splace;
	}

	public void setSplace(String splace) {
		this.splace = splace;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	@Override
	public String toString() {
		return "StudentDTO [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + ", course=" + course + ", splace="
				+ splace + ", sage=" + sage + ", semail=" + semail + ", spwd=" + spwd + "]";
	}


	
	
}
