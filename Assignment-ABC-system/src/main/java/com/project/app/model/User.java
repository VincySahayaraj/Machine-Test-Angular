package com.project.app.model;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class User {

	// define fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String firstName, lastName, gender, address; 
	private long phoneNumber;
	private int lId, age;

	// many employees to one login
	@OneToOne
	@JoinColumn(name = "lId", insertable = false, updatable = false)
	private Login login;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Visit> visits;

	// parametrized constructor
	public User(int empId, String firstName, String lastName, int age, String gender, String address,
			long phoneNumber, int lId, Login login,List<Visit> visits) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.lId = lId;
		this.login = login;
		this.visits=visits;
	}

   

	//default constructor
	public User() {
		super();

	}

	// generate getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	
	@JsonBackReference
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	@JsonManagedReference
	public List<Visit> getVisit() {
		return visits;
	}

	public void setVisit(List<Visit> visits) {
		this.visits = visits;
	}



	@Override
	public String toString() {
		return "User [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", lId=" + lId + ", age=" + age + ", login="
				+ login + ", visits=" + visits + "]";
	}

	
	
}
