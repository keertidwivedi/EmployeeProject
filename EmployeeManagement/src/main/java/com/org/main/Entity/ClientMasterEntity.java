package com.org.main.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClientMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clientId")
	private int clientId;

	@Column(name="clientname")
	private String clientName;

	@Column(name="clientcountry")
	private String clientCountry;



	public int getClientID() {
		return clientId;
	}

	public void setClientID(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientCountry() {
		return clientCountry;
	}

	public void setClientCountry(String clientCountry) {
		this.clientCountry = clientCountry;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name="remarks")
	private String remarks;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private EmployeeMasterEntity employeeMaster;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vertical_Id")
	private VerticalMasterEntity verticalMasterEntity;

	@ManyToMany
	@JoinTable(name = "projectmanager_client", joinColumns = @JoinColumn(name = "manager_Id"), inverseJoinColumns = @JoinColumn(name = "client_Id"))
	private Set<ProjectManagerEntity> projectManager;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="projectMasterEntity")
	private ProjectMasterEntity projectMasterEntity;
	
	
}
