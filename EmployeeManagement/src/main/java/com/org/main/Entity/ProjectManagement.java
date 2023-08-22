package com.org.main.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class ProjectManagement {
	
	@EmbeddedId
	ProjectMasterKey projectMasterKey;
	
	@ManyToOne
    @MapsId("employee_Id")
    @JoinColumn(name = "employee_Id")
	EmployeeMasterEntity employeeMaster;
	
	@ManyToOne
    @MapsId("project_Id")
    @JoinColumn(name = "project_Id")
	ProjectMasterEntity projectMaster;
	
	@Column(name="startdate")
	private Date startDate;
	
	@Column(name="enddate")
	private Date endDate;

}
