package com.studentregistration;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Program {
    private Integer programId;
    private String programName;
    private String instructor;
    private String semester;
    private String level;

 
    public Program() {
    }
 
    public Program(Integer programId, String programName,String instructor,String semester,String level) {
        this.programId = programId;
        this.programName = programName;
        this.instructor = instructor;
        this.semester = semester;
        this.level = level;
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

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
 
   
    
}
