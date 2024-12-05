package com.test;

public class Student {
	
	private String firstName;
	private String  age;
	private String city;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", age=" + age + ", city=" + city + "]";
	}
	

}
