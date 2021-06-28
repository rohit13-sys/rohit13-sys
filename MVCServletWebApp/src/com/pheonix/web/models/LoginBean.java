package com.pheonix.web.models;

public class LoginBean {
	private String userName;
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public boolean isValid() {
		if (userName.equals("rohit") && passWord.equals("123")) {
			return true;
		} else {
			return false;
		}
	}
}
