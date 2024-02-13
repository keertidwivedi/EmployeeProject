package com.org.ResponseDTo;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
public class EmployeeReponseDTo {
	

	
	private int employee_id;
	

	private String firstName;


	private String lastName;

	private String gender;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeReponseDTo [employee_id=" + employee_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + "]";
	}
	
	

}
