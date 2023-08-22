package com.org.main.Entity;

import java.util.Date; 
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Cleanup;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class EmployeeMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;

	@Column(name="Employeecode")
	private int employeeCode;

	@Column(name="reportingmanager")
	private String reportinManager;

	@Column(name="designation")
	private String designation;

	@Column(name="employeestatus")
	private String employeeStatus;

	@Column(name="employeename")
	private String employeeName;

	@Column(name="firstname")
	private String firstName;

	@Column(name="lastname")
	private String lastName;

	@Column(name="firstlastname")
	private String firstLastName;

	@Column(name="gender")
	private String gender;

	@Column(name="personalemployeeid")
	private String personalEmployeeID;

	@Column(name="officialemployeeid")
	private String officialEmployeeID;

	@Column(name="baselocation")
	private String baseLocation;

	@Column(name="ftcount")
	private String ftCount;

	@Column(name="hrbpremarks")
	private String hrbpRemarks;

	@Column(name="linkedin")
	private String linkedin;

	@Column(name="profileimage")
	private String profileImage;

	@Column(name="middlename")
	private String middleName;

	@Column(name="hrbpid")
	private String hrbpID;

	@Column(name="phonenumber")
	private String phoneNumber;

	@Column(name="potential")
	private String potential;

	@Column(name="region")
	private String region;

	@Column(name="pastexperienceyears")
	private int pastExperienceYears;

	@Column(name="pastexperiencemonths")
	private int pastExperienceMonths;

	@Column(name="subpracticeid")
	private int subPracticeID;

	@Column(name="dateofjoining")
	private Date dateOfJoining;

	@Column(name="dateofbirth")
	private Date dateOfBirth;

	@Column(name="dateofend")
	private Date dateOfEnd;

	
	
	
	public int getEmployeeID() {
		return employee_id;
	}

	public void setEmployeeID(int employeeID) {
		this.employee_id = employeeID;
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

	public Set<ProjectManagement> getProjectManagement() {
		return projectManagement;
	}

	public void setProjectManagement(Set<ProjectManagement> projectManagement) {
		this.projectManagement = projectManagement;
	}

	public Set<ClientMasterEntity> getClientMaster() {
		return clientMaster;
	}

	public void setClientMaster(Set<ClientMasterEntity> clientMaster) {
		this.clientMaster = clientMaster;
	}

	public PracticeMasterEntity getPracticeMasterEntity() {
		return practiceMasterEntity;
	}

	public void setPracticeMasterEntity(PracticeMasterEntity practiceMasterEntity) {
		this.practiceMasterEntity = practiceMasterEntity;
	}

	public Set<ProjectManagerEntity> getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(Set<ProjectManagerEntity> projectManager) {
		this.projectManager = projectManager;
	}

	@OneToMany(mappedBy = "employeeMaster")
	Set<ProjectManagement> projectManagement;


	@OneToMany(mappedBy = "employeeMaster")
	private Set<ClientMasterEntity> clientMaster;

	@OneToOne(mappedBy = "employeeMaster")
	private PracticeMasterEntity practiceMasterEntity;

	@ManyToMany
	@JoinTable(name = "projectmanager_employee", joinColumns = @JoinColumn(name = "employe_Id"), inverseJoinColumns = @JoinColumn(name = "manager_Id"))
	private Set<ProjectManagerEntity> projectManager;

	
	
}
