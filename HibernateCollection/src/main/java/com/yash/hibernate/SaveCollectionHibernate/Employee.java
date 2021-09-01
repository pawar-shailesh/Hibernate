package com.yash.hibernate.SaveCollectionHibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="EmpDetails1")
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" ,columnDefinition="INTEGER")
private int id;
	@Column(name="fName" ,columnDefinition="VARCHAR(25)")
private String firstName;
	@Column(name="lName" ,columnDefinition="VARCHAR(25)")
private String lastName;
	
@ElementCollection	
private Set<Address> listofAddresses = new HashSet();


public Set<Address> getListofAddress() {
	return listofAddresses;
}

public void setListofAddress(Set<Address> listofAddress) {
	this.listofAddresses = listofAddress;
}
	
public Employee(int id, String firstName, String lastName, Set<Address> listofAddresses) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.listofAddresses = listofAddresses;
} 



public Employee() {
	
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
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", listofAddress="
			+ listofAddresses + "]";
}


}
