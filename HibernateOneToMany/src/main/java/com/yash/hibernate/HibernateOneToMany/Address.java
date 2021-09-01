package com.yash.hibernate.HibernateOneToMany;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="addr")

public class Address 
{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id" ,columnDefinition="INTEGER")
private int id;	
	
	@Column(name="STREETNAME" ,columnDefinition="VARCHAR(25)")
		private String street;
	@Column(name="CITYNAME" ,columnDefinition="VARCHAR(25)")
		private String city;
	@Column(name="STATENAME" ,columnDefinition="VARCHAR(25)")
		private String state;
	@Column(name="PINCODE" ,columnDefinition="VARCHAR(25)")
		private String pincode;
		
		
		
		public Address() {
			
		}
		public Address(int id, String street, String city, String state, String pincode) {
			super();
			this.id = id;
			this.street = street;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getStreet() 
		{
			return street;
		}
		public void setStreet(String street) 
		{
			this.street = street;
		}
		public String getCity() 
		{
			return city;
		}
		public void setCity(String city) 
		{
			this.city = city;
		}
		public String getState() 
		{
			return state;
		}
		public void setState(String state) 
		{
			this.state = state;
		}
		public String getPincode() 
		{
			return pincode;
		}
		public void setPincode(String pincode) 
		{
			this.pincode = pincode;
		}
		
		@Override
		public String toString() {
			return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", pincode="
					+ pincode + "]";
		}
		

		
		
		
}
 