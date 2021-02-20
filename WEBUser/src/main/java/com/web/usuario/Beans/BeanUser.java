package com.web.usuario.Beans;


public class BeanUser {
	private String userId;

	private String userName;
	private String userPassword;
	private boolean isActive;
	private BeanUserData userData;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public BeanUserData getUserData() {
		return userData;
	}
	public void setUserData(BeanUserData userData) {
		this.userData = userData;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + ((userData == null) ? 0 : userData.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
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
		BeanUser other = (BeanUser) obj;
		if (isActive != other.isActive)
			return false;
		if (userData == null) {
			if (other.userData != null)
				return false;
		} else if (!userData.equals(other.userData))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BeanUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", isActive=" + isActive + ", userData=" + userData + "]";
	}

	
	
}
