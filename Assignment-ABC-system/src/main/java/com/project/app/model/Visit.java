package com.project.app.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Visit {

	// define fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int visitId;
	private String custName, contactPerson, interstedProduct, visitSubject, description;
	private Date visitDatetime;
	private boolean isDisabled;
	private boolean isDeleted;
	private int empId;

	// many visits to one user
	@ManyToOne
	@JoinColumn(name = "empId", insertable = false, updatable = false)
	private User user;

	// default constructor
	public Visit() {
		super();

	}

	// parametrized constructor
	public Visit(int visitId, String custName, String contactPerson, String interstedProduct, String visitSubject,
			String description, Date visitDatetime, boolean isDisabled, boolean isDeleted, int empId, User user) {
		super();
		this.visitId = visitId;
		this.custName = custName;
		this.contactPerson = contactPerson;
		this.interstedProduct = interstedProduct;
		this.visitSubject = visitSubject;
		this.description = description;
		this.visitDatetime = visitDatetime;
		this.isDisabled = isDisabled;
		this.isDeleted = isDeleted;
		this.empId = empId;
		this.user = user;
	}

	// getters and setters
	public int getVisitId() {
		return visitId;
	}

	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getInterstedProduct() {
		return interstedProduct;
	}

	public void setInterstedProduct(String interstedProduct) {
		this.interstedProduct = interstedProduct;
	}

	public String getVisitSubject() {
		return visitSubject;
	}

	public void setVisitSubject(String visitSubject) {
		this.visitSubject = visitSubject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getVisitDatetime() {
		return visitDatetime;
	}

	public void setVisitDatetime(Date visitDatetime) {
		this.visitDatetime = visitDatetime;
	}

	public boolean isDisabled() {
		return isDisabled;
	}

	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@JsonBackReference
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Visit [visitId=" + visitId + ", custName=" + custName + ", contactPerson=" + contactPerson
				+ ", interstedProduct=" + interstedProduct + ", visitSubject=" + visitSubject + ", description="
				+ description + ", visitDatetime=" + visitDatetime + ", isDisabled=" + isDisabled + ", isDeleted="
				+ isDeleted + ", empId=" + empId + ", user=" + user + "]";
	}

}
