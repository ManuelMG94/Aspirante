package com.web.usuario.Beans;

import java.io.Serializable;
import java.util.Date;


public class BeanUserData implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String lastName;
	private String birthDay;
	
	private BeanUserAddress address;
	private BeanUserContact contact;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public BeanUserAddress getAddress() {
		return address;
	}
	public void setAddress(BeanUserAddress address) {
		this.address = address;
	}
	public BeanUserContact getContact() {
		return contact;
	}
	public void setContact(BeanUserContact contact) {
		this.contact = contact;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthDay == null) ? 0 : birthDay.hashCode());
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanUserData other = (BeanUserData) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthDay == null) {
			if (other.birthDay != null)
				return false;
		} else if (!birthDay.equals(other.birthDay))
			return false;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BeanUserData [name=" + name + ", lastName=" + lastName + ", birthDay=" + birthDay + ", address="
				+ address + ", contact=" + contact + "]";
	}
	
	
	
	
}
