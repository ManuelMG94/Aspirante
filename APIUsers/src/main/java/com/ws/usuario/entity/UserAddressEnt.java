package com.ws.usuario.entity;

import java.io.Serializable;



public class UserAddressEnt implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String streatName;
	private String extNumber;
	private String intNumber;
	private String colony;
	private String municipality;
	private String state;
	private String country;
	private String CP;
	
	public UserAddressEnt() {
		
	}
	
	
	
	public String getStreatName() {
		return streatName;
	}
	public void setStreatName(String streatName) {
		this.streatName = streatName;
	}
	public String getExtNumber() {
		return extNumber;
	}
	public void setExtNumber(String extNumber) {
		this.extNumber = extNumber;
	}
	public String getIntNumber() {
		return intNumber;
	}
	public void setIntNumber(String intNumber) {
		this.intNumber = intNumber;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CP == null) ? 0 : CP.hashCode());
		result = prime * result + ((colony == null) ? 0 : colony.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((extNumber == null) ? 0 : extNumber.hashCode());
		result = prime * result + ((intNumber == null) ? 0 : intNumber.hashCode());
		result = prime * result + ((municipality == null) ? 0 : municipality.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streatName == null) ? 0 : streatName.hashCode());
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
		UserAddressEnt other = (UserAddressEnt) obj;
		if (CP == null) {
			if (other.CP != null)
				return false;
		} else if (!CP.equals(other.CP))
			return false;
		if (colony == null) {
			if (other.colony != null)
				return false;
		} else if (!colony.equals(other.colony))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (extNumber == null) {
			if (other.extNumber != null)
				return false;
		} else if (!extNumber.equals(other.extNumber))
			return false;
		if (intNumber == null) {
			if (other.intNumber != null)
				return false;
		} else if (!intNumber.equals(other.intNumber))
			return false;
		if (municipality == null) {
			if (other.municipality != null)
				return false;
		} else if (!municipality.equals(other.municipality))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streatName == null) {
			if (other.streatName != null)
				return false;
		} else if (!streatName.equals(other.streatName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserAddressEnt [streatName=" + streatName + ", extNumber=" + extNumber + ", intNumber=" + intNumber
				+ ", colony=" + colony + ", municipality=" + municipality + ", state=" + state + ", country=" + country
				+ ", CP=" + CP + "]";
	}
	
	
}
