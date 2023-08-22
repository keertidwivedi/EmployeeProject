package org.com.main.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectManagerResponseDTO {
	
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
