package model;

import java.io.Serializable;

public class Person implements Serializable{
	private String data;
	private String name;
	private String fName;
	private String gender;
	private String bloodType;

	public Person() {}

	public Person(String name,String fName,String gender,String bloodType) {
		this.name = name;
		this.fName = fName;
		this.gender = gender;
		this.bloodType = bloodType;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

}
