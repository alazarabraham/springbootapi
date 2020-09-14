package com.studentregistration;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Student {
    private Integer id;
    private String firstname;
    private String lastname;
    private String DOB;
    private Integer programid;


    
 
    public Student() {
    }
 
    public Student(Integer id, String firstname,String lastname,String DOB,Integer programid) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.DOB = DOB;
        this.programid = programid;

    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public Integer getProgramid() {
		return programid;
	}

	public void setProgramid(Integer programid) {
		this.programid = programid;
	}

	
 
    
}
