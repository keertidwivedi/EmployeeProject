package com.org.main.Entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectManagerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectManagerID;

	@Column(name="projectmanagername")
	private String projectManagerName;

	@ManyToMany(mappedBy = "projectManager")
	private Set<ClientMasterEntity> clientMaster;

	@ManyToMany(mappedBy = "projectManager")
	private Set<EmployeeMasterEntity> employeeMaster;

	@OneToOne(mappedBy = "projectManager")
	private VerticalMasterEntity verticalMaster;

	@OneToOne(mappedBy = "projectManager")
	private PracticeMasterEntity practiceMasterEntity;
	
	@ManyToMany(mappedBy = "projectManager")
	private Set<ProjectMasterEntity> projectMaster;

	public int getProjectManagerID() {
		return projectManagerID;
	}

	public void setProjectManagerID(int projectManagerID) {
		this.projectManagerID = projectManagerID;
	}

	public String getProjectManagerName() {
		return projectManagerName;
	}

	public void setProjectManagerName(String projectManagerName) {
		this.projectManagerName = projectManagerName;
	}

	
}
