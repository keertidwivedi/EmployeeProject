package com.org.main.Entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PracticeMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int practiceID;

	@Column(name="projectname")
	private String projectName;

	@Column(name="pdemployeeid")
	private String pdEmployeeID;

	@Column(name="practicestartdate")
	private Date practiceStartDate;

	@Column(name="description")
	private String description;

	@Column(name="hrbpid")
	private String hrbpID;
	
	
	
	

	public int getPracticeID() {
		return practiceID;
	}

	public void setPracticeID(int practiceID) {
		this.practiceID = practiceID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPdEmployeeID() {
		return pdEmployeeID;
	}

	public void setPdEmployeeID(String pdEmployeeID) {
		this.pdEmployeeID = pdEmployeeID;
	}

	public Date getPracticeStartDate() {
		return practiceStartDate;
	}

	public void setPracticeStartDate(Date practiceStartDate) {
		this.practiceStartDate = practiceStartDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHrbpID() {
		return hrbpID;
	}

	public void setHrbpID(String hrbpID) {
		this.hrbpID = hrbpID;
	}

	public ProjectManagerEntity getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(ProjectManagerEntity projectManager) {
		this.projectManager = projectManager;
	}

	public EmployeeMasterEntity getEmployeeMaster() {
		return employeeMaster;
	}

	public void setEmployeeMaster(EmployeeMasterEntity employeeMaster) {
		this.employeeMaster = employeeMaster;
	}

	@OneToOne
	@JoinColumn(name = "manager_Id")
	private ProjectManagerEntity projectManager;

	@OneToOne
	@JoinColumn(name = "employee_id")
	private EmployeeMasterEntity employeeMaster;
	


}
