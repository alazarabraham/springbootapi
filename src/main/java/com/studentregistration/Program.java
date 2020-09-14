package com.studentregistration;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Program {
    private Integer id;
    private String programname;
 
    public Program() {
    }
 
    public Program(Integer id, String programname) {
        this.id = id;
        this.programname = programname;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProgramname() {
		return programname;
	}

	public void setProgramname(String programname) {
		this.programname = programname;
	}
 
    
}
