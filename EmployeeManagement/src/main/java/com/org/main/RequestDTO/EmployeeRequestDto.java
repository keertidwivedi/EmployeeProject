package com.org.main.RequestDTO;

import java.util.Date;
import java.util.Set;

import com.org.main.Entity.ClientMasterEntity;
import com.org.main.Entity.PracticeMasterEntity;
import com.org.main.Entity.ProjectManagement;
import com.org.main.Entity.ProjectManagerEntity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestDto {
	

	private int employeeCode;

	private String reportinManager;

	private String designation;

	private String employeeStatus;

	private String employeeName;

	private String firstName;

	private String lastName;

	private String firstLastName;

	private String gender;

	private String personalEmployeeID;

	private String officialEmployeeID;

	private String baseLocation;

	private String ftCount;

	private String hrbpRemarks;

	private String linkedin;

	private String profileImage;

	private String middleName;

	private String hrbpID;

	private String phoneNumber;

	private String potential;

	private String region;

	private int pastExperienceYears;

	private int pastExperienceMonths;

	private int subPracticeID;

	private Date dateOfJoining;

	private Date dateOfBirth;

	private Date dateOfEnd;

	@Override
	public String toString() {
		return "EmployeeRequestDto [employeeCode=" + employeeCode + ", reportinManager=" + reportinManager
				+ ", designation=" + designation + ", employeeStatus=" + employeeStatus + ", employeeName="
				+ employeeName + ", firstName=" + firstName + ", lastName=" + lastName + ", firstLastName="
				+ firstLastName + ", gender=" + gender + ", personalEmployeeID=" + personalEmployeeID
				+ ", officialEmployeeID=" + officialEmployeeID + ", baseLocation=" + baseLocation + ", ftCount="
				+ ftCount + ", hrbpRemarks=" + hrbpRemarks + ", linkedin=" + linkedin + ", profileImage=" + profileImage
				+ ", middleName=" + middleName + ", hrbpID=" + hrbpID + ", phoneNumber=" + phoneNumber + ", potential="
				+ potential + ", region=" + region + ", pastExperienceYears=" + pastExperienceYears
				+ ", pastExperienceMonths=" + pastExperienceMonths + ", subPracticeID=" + subPracticeID
				+ ", dateOfJoining=" + dateOfJoining + ", dateOfBirth=" + dateOfBirth + ", dateOfEnd=" + dateOfEnd
				+ "]";
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getReportinManager() {
		return reportinManager;
	}

	public void setReportinManager(String reportinManager) {
		this.reportinManager = reportinManager;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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

	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPersonalEmployeeID() {
		return personalEmployeeID;
	}

	public void setPersonalEmployeeID(String personalEmployeeID) {
		this.personalEmployeeID = personalEmployeeID;
	}

	public String getOfficialEmployeeID() {
		return officialEmployeeID;
	}

	public void setOfficialEmployeeID(String officialEmployeeID) {
		this.officialEmployeeID = officialEmployeeID;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getFtCount() {
		return ftCount;
	}

	public void setFtCount(String ftCount) {
		this.ftCount = ftCount;
	}

	public String getHrbpRemarks() {
		return hrbpRemarks;
	}

	public void setHrbpRemarks(String hrbpRemarks) {
		this.hrbpRemarks = hrbpRemarks;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getHrbpID() {
		return hrbpID;
	}

	public void setHrbpID(String hrbpID) {
		this.hrbpID = hrbpID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPotential() {
		return potential;
	}

	public void setPotential(String potential) {
		this.potential = potential;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getPastExperienceYears() {
		return pastExperienceYears;
	}

	public void setPastExperienceYears(int pastExperienceYears) {
		this.pastExperienceYears = pastExperienceYears;
	}

	public int getPastExperienceMonths() {
		return pastExperienceMonths;
	}

	public void setPastExperienceMonths(int pastExperienceMonths) {
		this.pastExperienceMonths = pastExperienceMonths;
	}

	public int getSubPracticeID() {
		return subPracticeID;
	}

	public void setSubPracticeID(int subPracticeID) {
		this.subPracticeID = subPracticeID;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfEnd() {
		return dateOfEnd;
	}

	public void setDateOfEnd(Date dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}


	
	
}
