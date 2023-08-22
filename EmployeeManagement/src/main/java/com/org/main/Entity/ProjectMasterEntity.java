package com.org.main.Entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProjectMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectID;

	@Column(name="projectname")
	private String projectName;

	@Column(name="pricingmodel")
	private String pricingModel;

	@Column(name="itservice")
	private String itService;

	@Column(name="servicemodel")
	private String serviceModel;

	@Column(name="executionmodel")
	private String executionModel;

	@Column(name="projectlocation")
	private String projectLocation;

	@Column(name="startdate")
	private Date startDate;

	@Column(name="endate")
	private Date endDate;

	@Column(name="serviceline")
	private String serviceLine;

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "projectmanagementtable", joinColumns = @JoinColumn(name =
	 * "project_id"), inverseJoinColumns = @JoinColumn(name = "employee_id"))
	 * private Set<EmployeeMasterEntity> employeeMaster;
	 */
	
	@OneToOne()
	@JoinColumn(name="client_ID")
	private ClientMasterEntity clientMasterEntity;
	
	@OneToOne()
	@JoinColumn(name="Vertical_Id")
	private VerticalMasterEntity verticalMaster;
	
	
	
	  
	  @ManyToMany
	  @JoinTable( name = "projectmanager_projectmaster", joinColumns
	  = @JoinColumn(name = "manaager_Id"), inverseJoinColumns = @JoinColumn(name =
	  "master_Id")) private Set<ProjectManagerEntity> projectManager;
	 
	 
	
	@OneToMany(mappedBy = "projectMaster")
	private Set<ProjectManagement> projectManagement;

}
