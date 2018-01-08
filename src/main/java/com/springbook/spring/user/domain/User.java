package com.springbook.spring.user.domain;

public class User {
	String id;
	String name;
	String password;
	
	public User(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	//자바 빈 규약을 따라는 클래스에 생성자를 명시적으로 추가했을때는 
	//파라미터가 없는 디폴트 새엉자도 함께 정의해준다. 
	public User() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
