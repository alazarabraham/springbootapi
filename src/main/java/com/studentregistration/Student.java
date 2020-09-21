package com.studentregistration;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Student {
	
    private Integer studentId;
    private String firstname;
    private String lastname;
    private String degreeProgram;
    private String DOB;


    
 
    public Student() {
    }
 
    public Student(Integer studentId, String firstname,String lastname,String degreeProgram,String DOB) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.degreeProgram = degreeProgram;

        this.DOB = DOB;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

	public String getDegreeProgram() {
		return degreeProgram;
	}

	public void setDegreeProgram(String degreeProgram) {
		this.degreeProgram = degreeProgram;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	
    
    

	
 
    

}
