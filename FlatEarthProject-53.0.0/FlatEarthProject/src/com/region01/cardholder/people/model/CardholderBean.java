package com.region01.cardholder.people.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class CardholderBean {

	private int id;						// N  4				  10			01 01
	
	private String firstName;			// A 30			Toussaint			54 6f 75 73 73 61 69 6e 74 20
	private String middleName;			// A 30			Immanuel			49 6d 6d 61 6e 75 65 6c 20 20
	private String lastName;			// A 30			Alexander			41 6c 65 78 61 6e 64 65 72 20		
	
	private String socialSecurity;		// A  9			573313383			35 37 33 33 31 33 33 38 33 
	
	private String company;				// A 30
	private String department;			// A 30
	private String title;				// A 30
	private BigDecimal salary;			// N 12
	
	private int age;					// N  3
	private String maritalStatus;		// A  1			S-SINGLE	M-MARRIED	D-DIVORCE
	private Date dateOfBirth;			// YY MM DD
	private String education;			// A 30
	
	private String interests;			// A 30
	
	private String userName;			// A  8			TALEXAND
	private String userId;				// A  7			100,250
	private String secret;				// A 30
	
	private int clearTextPin;			// N  4
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;

	public CardholderBean () {}

	public CardholderBean(int id, String firstName, String middleName, String lastName, String socialSecurity,
			String company, String department, String title, BigDecimal salary, int age, String maritalStatus,
			Date dateOfBirth, String education, String interests, String userName, String userId, String secret,
			int clearTextPin, String createUser, Timestamp createTimestamp, String modifyUser,
			Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.socialSecurity = socialSecurity;
		this.company = company;
		this.department = department;
		this.title = title;
		this.salary = salary;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.dateOfBirth = dateOfBirth;
		this.education = education;
		this.interests = interests;
		this.userName = userName;
		this.userId = userId;
		this.secret = secret;
		this.clearTextPin = clearTextPin;
		this.createUser = createUser;
		this.createTimestamp = createTimestamp;
		this.modifyUser = modifyUser;
		this.modifyTimestamp = modifyTimestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public int getClearTextPin() {
		return clearTextPin;
	}

	public void setClearTextPin(int clearTextPin) {
		this.clearTextPin = clearTextPin;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Timestamp getModifyTimestamp() {
		return modifyTimestamp;
	}

	public void setModifyTimestamp(Timestamp modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}

}
