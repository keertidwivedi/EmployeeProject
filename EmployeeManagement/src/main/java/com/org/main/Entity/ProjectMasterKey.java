package com.org.main.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ProjectMasterKey  implements Serializable {
	
	 

	    @Column(name = "employee_Id")
	    int employee_ID;

	    @Column(name = "project_Id")
	    int projectID;

}
