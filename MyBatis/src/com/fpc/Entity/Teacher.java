package com.fpc.Entity;
/*
 * 定义实体类的属性，与teacher表中的字段对应
 * 
 * */
public class Teacher {
	private int id; //id & t_id;
	private String name; //name & t_name
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
}
