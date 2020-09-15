package com.studentregistration;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Program {
    private Integer programId;
    private String programName;
 
    public Program() {
    }
 
    public Program(Integer programId, String programName) {
        this.programId = programId;
        this.programName = programName;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getProgramId() {
		return programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}
 
   
    
}
