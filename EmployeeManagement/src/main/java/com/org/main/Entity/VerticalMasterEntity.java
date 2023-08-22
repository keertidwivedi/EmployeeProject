package com.org.main.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VerticalMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int verticalId;

	@Column(name="EmpVertical")
	private String vertical;

	@Column(name="remarks")
	private String remarks;

	@OneToOne(mappedBy = "verticalMasterEntity")
	private ClientMasterEntity clientMasterEntity;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_Id")
	private ProjectManagerEntity projectManager;
	
	@OneToOne(mappedBy = "verticalMaster")
	private ProjectMasterEntity projectMaster;

}
