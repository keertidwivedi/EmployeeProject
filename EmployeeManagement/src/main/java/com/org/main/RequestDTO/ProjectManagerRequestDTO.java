package com.org.main.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectManagerRequestDTO {
	
	private int projectManagerID;

	private String projectMangerName;

	public int getProjectManagerID() {
		return projectManagerID;
	}

	public void setProjectManagerID(int projectManagerID) {
		this.projectManagerID = projectManagerID;
	}

	public String getProjectMangerName() {
		return projectMangerName;
	}

	public void setProjectMangerName(String projectMangerName) {
		this.projectMangerName = projectMangerName;
	}
	
	

}
